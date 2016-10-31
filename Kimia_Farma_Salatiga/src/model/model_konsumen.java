/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author ivan
 */
public class model_konsumen {
    private int id_konsumen;
    private String nama_konsumen;
    private String alamat;

    public int getId_konsumen() {
        return id_konsumen;
    }

    public void setId_konsumen(int id_konsumen) {
        this.id_konsumen = id_konsumen;
    }

    public String getNama_konsumen() {
        return nama_konsumen;
    }

    public void setNama_konsumen(String nama_konsumen) {
        this.nama_konsumen = nama_konsumen;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    @Override
    public String toString(){
        return String.valueOf(id_konsumen);
    }
}
