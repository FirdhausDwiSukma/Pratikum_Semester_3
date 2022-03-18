package com.pbo.assessment1pbo;

public class MainPaket {
    public static void main(String[] args) {
        Paket utama = new Paket("3", "N0004", "Pos Indonesia", 23000, "Eiger", "Bandung Kopo", "Bambang", "DayeuhKolot");
        Paket asuransi = new Paket("2","N0003","J&T",21000,"Eiger","Bandung Kopo","Tini","DayeuhKolot",40000);
        Paket dropshipper = new Paket("4","N0002","siCepat",24000,"Eiger","Bandung Kopo","Dropship2","Pontianak","Joko","DayeuhKolot","yes");
        Paket asuransiDropshipper = new Paket("1","N0001","JNE",21000,"Eiger","Bandung Kopo","Dropship1","Surabaya","Bejo","DayeuhKolot",40000,"yes");


        System.out.println("========== Data Pengiriman ==========");
        System.out.println("Utama");
        utama.Output();
        System.out.println("Asuransi");
        asuransi.Output();
        System.out.println("Dropshipper");
        dropshipper.Output();
        System.out.println("Asuransi + Dropshipper");
        asuransiDropshipper.Output();
    }
}