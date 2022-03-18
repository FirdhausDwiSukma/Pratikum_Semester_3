/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akses;
import com.mysql.cj.jdbc.MysqlDataSource;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author Firdaus
 */
public class koneksi {
    private final MysqlDataSource dataSource = new MysqlDataSource();
    private final String DB_URL = "jdbc:mysql://localhost:3306/kasir";
    private final String DB_USERNAME = "root";
    private final String DB_PASSWORD = "";

   

    public Connection configDB() throws SQLException {
        dataSource.setUrl(DB_URL);
        dataSource.setUser(DB_USERNAME);
        dataSource.setPassword(DB_PASSWORD);
        Connection con = dataSource.getConnection();
        try{
            con = dataSource.getConnection();
            System.out.println("Koneksi Berhasil");
        } catch (SQLException ex){
            System.out.println("Eksepsi akses data : " + ex.getMessage());
        }
        return con;
    }
}
