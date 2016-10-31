/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.model_obat;

/**
 *
 * @author sahar
 */
public class obat_controller {
    private Connection connect= null;
    public obat_controller(){
        this.connect = new connection.connection().connect();
    }
    
    public String insertObat(model_obat dr){
        String status ="gagal";
        try {
            PreparedStatement stm = connect.prepareStatement("INSERT INTO tbl_obat(kode_obat, golongan, nama_obat, stock, harga_satuan, kadaluarsa) VALUES (?,?,?,?,?,?)");
            stm.setString(1, dr.getKode_obat());
            stm.setString(2, dr.getGolongan());
            stm.setString(3, dr.getNama_obat());
            stm.setInt(4, dr.getStock());
            stm.setInt(5, dr.getHarga_satuan());
            stm.setString(6, dr.getKadaluarsa());
            stm.executeUpdate();
            status = "berhasil disimpan";
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }
    
    public List<model_obat> showObat(){
        List<model_obat> drl = new ArrayList<>();
        try {
            PreparedStatement stm = connect.prepareStatement("SELECT * FROM tbl_obat");
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                model_obat  d = new model_obat();
                d.setId_obat(rs.getInt("id_obat"));
                d.setKode_obat(rs.getString("kode_obat"));
                d.setGolongan(rs.getString("golongan"));
                d.setNama_obat(rs.getString("nama_obat"));
                d.setStock(rs.getInt("stock"));
                d.setHarga_satuan(rs.getInt("harga_satuan"));
                d.setKadaluarsa(rs.getString("kadaluarsa"));
               
                drl.add(d);
            }
        } catch (Exception e) {
        }
        return drl;
    }
    
    public String deleteObat(String kode_obat){
        String status = "gagal";
        try {
            PreparedStatement ps = connect.prepareStatement("DELETE FROM tbl_obat WHERE kode_obat = ? ");
            ps.setString(1, kode_obat);
            ps.executeUpdate();
            status = "berhasil di delete";
        } catch (SQLException ex) {
            Logger.getLogger(obat_controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }
    
    public String update(String kode_obat, model_obat dr){
        String status = "gagal";
        try {
            PreparedStatement ps = connect.prepareStatement("UPDATE tbl_obat SET golongan = ?, nama_obat = ?, stock = ?, harga_satuan = ?, kadaluarsa = ?  WHERE kode_obat = ?");
            //ps.setString(1, dr.getKode_obat());
            ps.setString(1, dr.getGolongan());
            ps.setString(2, dr.getNama_obat());
            ps.setString(3, String.valueOf(dr.getStock()));
            ps.setString(4, String.valueOf(dr.getHarga_satuan()));
            ps.setString(5, dr.getKadaluarsa());
            ps.setString(6, kode_obat);
            ps.executeUpdate();
            status = "berhasil update";
        } catch (SQLException ex) {
            Logger.getLogger(obat_controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }
}
