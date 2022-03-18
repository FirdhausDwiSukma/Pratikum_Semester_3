package com.pbo.assessment1pbo;

public class Paket {
    private String namaPenjual;
    private String alamatPenjual;
    private String namaDropshipper;
    private String namaPembeli;
    private String alamatPembeli;
    private String alamatDropshipper;
    private String statDropshipper;
    private double ongkosKirim;
    private String namaEkspedisi;
    private String noTransaksi;
    private  String resi;
    private double asuransi ;

    //Data utama
    public Paket(String noTransaksi,String resi, String namaEkspedisi, double ongkosKirim, String namaPenjual, String alamatPenjual, String namaPembeli,String alamatPembeli){
        this.noTransaksi = noTransaksi;
        this.resi = resi;
        this.namaEkspedisi = namaEkspedisi;
        this.ongkosKirim = ongkosKirim;
        this.namaPenjual = namaPenjual;
        this.alamatPenjual = alamatPenjual;
        this.namaPembeli = namaPembeli;
        this.alamatPembeli = alamatPembeli;
    }

    //Data utama + Data asuransi
    public Paket(String noTransaksi,String resi, String namaEkspedisi, double ongkosKirim, String namaPenjual, String alamatPenjual, String namaPembeli,String alamatPembeli, double asuransi){
        this.noTransaksi = noTransaksi;
        this.resi = resi;
        this.namaEkspedisi = namaEkspedisi;
        this.ongkosKirim = ongkosKirim;
        this.namaPenjual = namaPenjual;
        this.alamatPenjual = alamatPenjual;
        this.namaPembeli = namaPembeli;
        this.alamatPembeli = alamatPembeli;
        this.asuransi = asuransi;
    }

    //Data Utama + Dropshipper
    public Paket(String noTransaksi,String resi, String namaEkspedisi, double ongkosKirim, String namaPenjual,String alamatPenjual, String namaDropshipper, String alamatDropshipper, String namaPembeli, String alamatPembeli, String statDropshipper){
        this.noTransaksi = noTransaksi;
        this.resi = resi;
        this.namaEkspedisi = namaEkspedisi;
        this.ongkosKirim = ongkosKirim;
        this.namaPenjual = namaPenjual;
        this.alamatPenjual = alamatPenjual;
        this.namaDropshipper = namaDropshipper;
        this.alamatDropshipper = alamatDropshipper;
        this.namaPembeli = namaPembeli;
        this.alamatPembeli = alamatPembeli;
        this.statDropshipper = statDropshipper;
    }

    //Data utama + asuransi + dropshipper
    public Paket(String noTransaksi,String resi, String namaEkspedisi, double ongkosKirim, String namaPenjual,String alamatPenjual, String namaDropshipper, String alamatDropshipper, String namaPembeli, String alamatPembeli, double asuransi, String statDropshipper){
        this.noTransaksi = noTransaksi;
        this.resi = resi;
        this.namaEkspedisi = namaEkspedisi;
        this.ongkosKirim = ongkosKirim;
        this.namaPenjual = namaPenjual;
        this.alamatPenjual = alamatPenjual;
        this.namaDropshipper = namaDropshipper;
        this.alamatDropshipper = alamatDropshipper;
        this.namaPembeli = namaPembeli;
        this.alamatPembeli = alamatPembeli;
        this.asuransi = asuransi;
        this.statDropshipper = statDropshipper;
    }

    public void Output(){
        System.out.println("No Transaksi : " + noTransaksi);
        System.out.println("No resi : " + resi);
        System.out.println("Nama Ekspedisi :" + namaEkspedisi);
        if ((ongkosKirim > 20000 && asuransi > 0) && statDropshipper == null){
            ongkosKirim -= 5000;
        }
        System.out.println("Ongkos Kirim : " + ongkosKirim);
        switch (String.valueOf(namaDropshipper)){
            case "null" :
                System.out.println("Nama Pengirim : " + namaPenjual);
                break;
            default :
                System.out.println("Nama Pengirim : " + namaDropshipper);
                break;
        }
        switch (String.valueOf(alamatDropshipper)){
            case "null" :
                System.out.println("Alamat Pengirim : " + alamatPenjual);
                break;
            default:
                System.out.println("Alamat Pengirim : " + alamatDropshipper);
                break;
        }
        System.out.println("Nama Penerima : " + namaPembeli);
        System.out.println("Alamat Penerima : " + alamatPembeli);
        if (asuransi > 0){
            System.out.println("Nominal Asuransi : " + asuransi);
        }
        System.out.println("===================================");
    }

}
