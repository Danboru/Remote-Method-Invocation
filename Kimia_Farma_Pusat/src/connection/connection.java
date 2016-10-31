/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sahar
 */
public class connection {
    public Connection con = null;
    public Connection connect(){
        try {
            MysqlDataSource msds = new MysqlDataSource();
            msds.setServerName("localhost");
            msds.setPort(3306);
            msds.setUser("root");
            msds.setPassword("");
            msds.setDatabaseName("db_apotek_pusat");
            con = msds.getConnection();
            System.out.println("connected");
        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return con;
    }
    
    public static void main(String[] args) {
        connection conn =new connection();
        conn.connect();
    }
}
