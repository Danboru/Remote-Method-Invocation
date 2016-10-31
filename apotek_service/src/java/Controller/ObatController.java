/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ModelObat;

/**
 *
 * @author ivan
 */
public class ObatController {
    private Connection con;
    
    public ObatController(Connection con) {
        this.con = con;
    }
    
    public List<ModelObat> getAllObat() {
        List<ModelObat> listObat = new ArrayList<ModelObat>();
        try {
            PreparedStatement ps = con.prepareStatement("SELECT id, kode_obat, nama_obat, golongan, harga_satuan, kadaluarsa FROM tbl_obat");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ModelObat mo = new ModelObat();
                mo.setId_obat(rs.getInt(1));
                mo.setKode_obat(rs.getString(2));
                mo.setNama_obat(rs.getString(3));
                mo.setGolongan(rs.getString(4));
                mo.setHarga_satuan(rs.getInt(5));
                mo.setKadaluarsa(rs.getString(6));
                
                listObat.add(mo);
            }
        } catch (SQLException e) {
        }
        return listObat;
    }
    
    public List<ModelObat> InsertObat(String kode_obat, String nama_obat, String golongan, int harga_satuan, String kadaluarsa){
        try {
            String query = "INSERT INTO tbl_obat(kode_obat, nama_obat, golongan, harga_satuan, kadaluarsa) VALUES(?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);
            
            ps.setString(1, kode_obat);
            ps.setString(2, nama_obat);
            ps.setString(3, golongan);
            ps.setString(4, String.valueOf(harga_satuan));
            ps.setString(5, kadaluarsa);
            
            int result = ps.executeUpdate();
            if (result > 0) {
                System.out.println("Berhasil simpan");
            }
            } catch (SQLException ex) {
                Logger.getLogger(ObatController.class.getName()).log(Level.SEVERE, null, ex);
            }
        return null;
    }
    
    public List<ModelObat> DeleteObat(int id){
        try {
            String query = "DELETE FROM tbl_obat WHERE id=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, String.valueOf(id));
            int hasil = ps.executeUpdate();
            if(hasil > 0){
                System.out.println("Berhasil delete");
            }
        } catch (Exception ex) {
            Logger.getLogger(ObatController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<ModelObat> UpdateObat(int id, String kode_obat, String nama_obat, String golongan, int harga_satuan, String kadaluarsa){
        try {
            //String query = "UPDATE tbl_obat SET kode_obat='"+ kode_obat +"',nama_obat='"+ nama_obat +"',golongan='"+ golongan +"' harga_satuan="+ harga_satuan +", kadaluarsa='"+ kadaluarsa +"' WHERE id="+ id ;
            String query = "UPDATE tbl_obat SET kode_obat=?, nama_obat=?, golongan=?, harga_satuan=?, kadaluarsa=? WHERE id=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, kode_obat);
            ps.setString(2, nama_obat);
            ps.setString(3, golongan);
            ps.setString(4, String.valueOf(harga_satuan));
            ps.setString(5, kadaluarsa);
            ps.setString(6, String.valueOf(id));
            
            int result = ps.executeUpdate();
            if (result > 0) {
                System.out.println("Berhasil update");
            }
        } catch (Exception ex) {
            Logger.getLogger(ObatController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
