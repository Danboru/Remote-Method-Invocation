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
import model.model_obat;

/**
 *
 * @author sahar
 */
public class obat_controller {
    private Connection connectPusat= null;
    private Connection connectCabang=null;
    
    public obat_controller(){
        this.connectPusat = new connection.connection().connect_pusat();
        sync();
    }
    
    
    
    public String insertObat(model_obat dr){
        String status ="gagal";
        try {
            connectCabang = new connection.connection().connect_cabang();
            PreparedStatement stm = connectCabang.prepareStatement("INSERT INTO tbl_obat(kode_obat, golongan, nama_obat, stock, harga_satuan, kadaluarsa) VALUES (?,?,?,?,?,?)");
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
            connectCabang = new connection.connection().connect_cabang();
            PreparedStatement stm = connectCabang.prepareStatement("SELECT * FROM tbl_obat");
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
    
    public void clear(){
        connectCabang = new connection.connection().connect_cabang();
        try {
            PreparedStatement stm = connectCabang.prepareStatement("DELETE FROM tbl_obat");
            stm.execute();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void sync(){
        connectCabang = new connection.connection().connect_cabang();
        try {
            clear();
            try {
            PreparedStatement stm2 = connectPusat.prepareStatement("SELECT * FROM tbl_obat");
            ResultSet rs2 = stm2.executeQuery();
            while (rs2.next()) {
                model_obat  d = new model_obat();
                d.setId_obat(rs2.getInt("id_obat"));
                d.setKode_obat(rs2.getString("kode_obat"));
                d.setGolongan(rs2.getString("golongan"));
                d.setNama_obat(rs2.getString("nama_obat"));
                d.setStock(rs2.getInt("stock"));
                d.setHarga_satuan(rs2.getInt("harga_satuan"));
                d.setKadaluarsa(rs2.getString("kadaluarsa"));
                insertObat(d);
            }
        } catch (Exception e) {
        }
            
        } catch (Exception e) {
        }
    }
}
