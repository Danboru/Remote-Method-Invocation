package Koneksi;

import java.sql.Connection;
import java.sql.DriverManager;

public class Koneksi {
    private Connection con;
    
    public Koneksi(){
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/dbapotek";
        String user = "root";
        String pass = "";
        
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
        }
    }
    
    public Connection getConnection(){
        return con;
    }
    
    public static void main(String[] args) {
        System.out.println(new Koneksi().getConnection());
    }
}
