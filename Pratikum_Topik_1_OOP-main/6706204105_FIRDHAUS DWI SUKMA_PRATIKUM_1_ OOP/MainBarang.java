package com.pbo.topik1;

public class MainBarang {
    public static void main(String[] args) {
        Barang barang1 = new Barang("BRG-001", "Tas Gucci");
        barang1.setHarga(1200);
        Barang barang2 = new Barang("BRG-002","Printer Epson L355");
        barang2.setHarga(200);

        System.out.println(barang1.getIdProduk() + " " + barang1.getNama() + " " + barang1.getHarga());
        System.out.println(barang2.getIdProduk() + " " + barang2.getNama() + " " + barang2.getHarga());

        Barang barang3 = new Barang("BRG-003", "Koper", 150);
        Barang barang4 = new Barang("BRG-004", "Helm", 20);

        System.out.println(barang3.getIdProduk() + " " + barang3.getNama() + " " + barang3.getHarga());
        System.out.println(barang4.getIdProduk() + " " + barang4.getNama() + " " + barang4.getHarga());
        double totalHarga = barang1.getHarga() + barang2.getHarga() + barang3.getHarga() + barang4.getHarga();

        System.out.println("Total = " + totalHarga);


    }
}
