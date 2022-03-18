/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formDataBarang;

/**
 *
 * @author Firdaus
 */
public class Barang {
    private String idBarang, namaBar;
    private int stock;
    private double harga;
    
    public Barang(String idBarang, String namaBar, int stock, double harga){
       this.idBarang = idBarang;
       this.namaBar = namaBar;
       this.stock = stock;
       this.harga = harga;
    }
    
    public String getIdBarang(){
       return idBarang;
    }
    
    public String getNamaBarang(){
       return namaBar;
    }
    
    public int getStock(){
       return stock;
    }
    
    public double getHarga(){
       return harga;
    }
}
