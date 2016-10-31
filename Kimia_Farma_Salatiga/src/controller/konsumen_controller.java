/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.model_konsumen;

/**
 *
 * @author ivan
 */
public class konsumen_controller {
    private Connection connectCabang = null;
    
    public konsumen_controller(){
        this.connectCabang = new connection.connection().connect_cabang();
    }
    
    public String insertKonsumen(model_konsumen dr){
        String status ="gagal";
        try {
            PreparedStatement stm = connectCabang.prepareStatement("INSERT INTO "
                            + "tbl_konsumen(nama_konsumen,alamat)"
                            + " VALUES (?,?)");
            stm.setString(1, dr.getNama_konsumen());
            stm.setString(2, dr.getAlamat());
            stm.executeUpdate();
            status = "berhasil disimpan";
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }
    
    public List<model_konsumen> showKonsumen(){
        List<model_konsumen> cust = new ArrayList<>();
        try {
            PreparedStatement stm = connectCabang.prepareStatement("SELECT * FROM tbl_konsumen");
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                model_konsumen  d = new model_konsumen();
                d.setId_konsumen(rs.getInt("id_konsumen"));
                d.setNama_konsumen(rs.getString("nama_konsumen"));
                d.setAlamat(rs.getString("alamat"));
               
                cust.add(d);
            }
        } catch (Exception e) {
        }
        return cust;
    }
}
