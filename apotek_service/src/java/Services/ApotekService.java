/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Services;

import Controller.ObatController;
import Koneksi.Koneksi;
import java.sql.Connection;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.ModelObat;

/**
 *
 * @author ivan
 */
@WebService(serviceName = "ApotekService")
public class ApotekService {
    
private Connection con;
    public ApotekService(){
        con = new Koneksi().getConnection();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "insertObat")
    public List<ModelObat> insertObat(@WebParam(name = "kode_obat") String kode_obat, @WebParam(name = "nama_obat") String nama_obat, @WebParam(name = "golongan") String golongan, @WebParam(name = "harga_satuan") int harga_satuan, @WebParam(name = "kadaluarsa") String kadaluarsa) {
        List<ModelObat> addObat = new ObatController(con).InsertObat(kode_obat, nama_obat, golongan, harga_satuan, kadaluarsa);
        return addObat;
    }
    
    @WebMethod(operationName = "selectObat")
    public List<ModelObat> SelectObat() {
        List<ModelObat> listObat = new ObatController(con).getAllObat();
        return listObat;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "deleteObat")
    public List<ModelObat> deleteObat(@WebParam(name = "id") int id) {
        List<ModelObat> deleteObat = new ObatController(con).DeleteObat(id);
        return deleteObat;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "updateObat")
    public List<ModelObat> updateObat(@WebParam(name = "id") int id, @WebParam(name = "kode_obat") String kode_obat, @WebParam(name = "nama_obat") String nama_obat, @WebParam(name = "golongan") String golongan, @WebParam(name = "harga_satuan") int harga_satuan, @WebParam(name = "kadaluarsa") String kadaluarsa) {
        List<ModelObat> updateObat = new ObatController(con).UpdateObat(id, kode_obat, nama_obat, golongan, harga_satuan, kadaluarsa);
        return updateObat;
    }

    
    
    
}
