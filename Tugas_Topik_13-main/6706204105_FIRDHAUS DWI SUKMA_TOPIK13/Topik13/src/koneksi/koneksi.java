/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;
import com.mysql.cj.jdbc.MysqlDataSource;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author Firdaus
 */
public class koneksi {
    public static Connection con;
   
        public static Connection configDB() throws SQLException{
            
        MysqlDataSource dataSource = new MysqlDataSource();
        String DB_URL = "jdbc:mysql://localhost:3306/makanan";
        String DB_USERNAME = "root";
        String DB_PASSWORD = "";
        
        dataSource.setUrl(DB_URL);
        dataSource.setUser(DB_USERNAME);
        dataSource.setPassword(DB_PASSWORD);
        try{
            con = dataSource.getConnection();
            System.out.println("Koneksi Berhasil");
        } catch (SQLException ex){
            System.out.println("Eksepsi akses data : " + ex.getMessage());
        }
        return con;
    } 
}
