/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formDataBarang;
import akses.koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author Firdaus
 */
public class DbBarang {
    private Connection con;
    private final koneksi k = new koneksi();
    
    public ArrayList<Barang> getBarang() throws SQLException{
       ArrayList<Barang> daftar = new ArrayList<>();
       
       con = k.configDB();
       
       String kueri = "SELECT * FROM barang";
       PreparedStatement ps = con.prepareStatement(kueri);
       
       ResultSet rs = ps.executeQuery();
       
        while (rs.next()) {
            String id = rs.getString("id_barang");
            String nama = rs.getString("nama");
            String stock = rs.getString("stock");
            String harga = rs.getString("harga");
            
            Barang b = new Barang(id, nama, Integer.parseInt(stock), Double.parseDouble(harga));
            daftar.add(b);
            
        }
       rs.close(); 
       ps.close();
       con.close();
       return daftar;
    }
    
    //Insert Data
    
    public boolean insertBarang(Barang b) throws SQLException{
       con = k.configDB();
       
       String kueri = "INSERT INTO barang(id_barang, nama, stock, harga) VALUES (?,?,?,?)";
       PreparedStatement ps = con.prepareStatement(kueri);
       ps.setString(1, b.getIdBarang()); ps.setString(2, b.getNamaBarang());
       ps.setInt(3, b.getStock()); ps.setDouble(4, b.getHarga());
       
       int rowAffected = ps.executeUpdate();
       
       ps.close(); 
       con.close();
       return rowAffected == 1;
    }
    
    public boolean updateBarang(Barang b) throws SQLException{
    
        con = k.configDB();
        
        String kueri = "UPDATE barang SET nama=?, stock=?, harga=? WHERE id_barang=?";
        PreparedStatement ps = con.prepareStatement(kueri);
        ps.setString(1, b.getNamaBarang()); ps.setInt(2, b.getStock()); 
        ps.setDouble(3, b.getHarga()); ps.setString(4, b.getIdBarang()); 
        int rowAffected = ps.executeUpdate();
        
        ps.close(); 
        con.close();
        return rowAffected == 1;
    }
    
    public boolean deleteBarang(String id) throws SQLException{
    
        con = k.configDB();
        
        String kueri = "DELETE FROM barang WHERE id_barang = ?";
        PreparedStatement ps = con.prepareStatement(kueri);
        ps.setString(1, id);
        
        int rowAffected = ps.executeUpdate();

        ps.close(); con.close();
        return rowAffected == 1;
    }
    
    //CARI -- SELECT-WHERE
    public ArrayList<Barang> searchBarang(String key) throws SQLException {
        ArrayList<Barang> daftar = new ArrayList<>();
    
        con = k.configDB();
        
        String kueri = "SELECT * FROM barang WHERE nama LIKE ? OR stock=? OR harga=?";
        PreparedStatement ps = con.prepareStatement(kueri);
        ps.setString(1, "%"+key+"%");
        ps.setString(2, key);
        ps.setString(3, key);
        
        ResultSet rs = ps.executeQuery();
        
         while (rs.next()) {
            String id = rs.getString("id_barang");
            String nama = rs.getString("nama");
            String stock = rs.getString("stock");
            String harga = rs.getString("harga");
            
            Barang b = new Barang(id, nama, Integer.parseInt(stock), Double.parseDouble(harga));
            daftar.add(b);            
        }
        rs.close(); 
        ps.close();
        con.close();
        return daftar;
    }
}
