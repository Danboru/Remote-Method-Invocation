/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import model.model_transaksi;

/**
 *
 * @author ivan
 */
public class transaksi_controller {
    private Connection connectCabang = null;
    
    public transaksi_controller(){
        this.connectCabang = new connection.connection().connect_cabang();
    }
    
    public String insertTransaksi(model_transaksi dr){
        String status ="gagal";
        try {
            PreparedStatement stm = connectCabang.prepareStatement("INSERT INTO "
                            + "tbl_pembelian(nama_konsumen, nama_obat, harga_satuan, jumlah_pembelian, total, tanggal_pembelian)"
                            + " VALUES (?,?,?,?,?,?)");
            stm.setString(1, dr.getNama_konsumen());
            stm.setString(2, dr.getNama_obat());
            stm.setString(3, String.valueOf(dr.getHarga_satuan()));
            stm.setString(4, String.valueOf(dr.getJumlah_pembelian()));
            stm.setString(5, String.valueOf(dr.getTotal()));
            stm.setString(6, dr.getTanggal_pembelian());
            stm.executeUpdate();
            status = "berhasil disimpan";
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }
}
