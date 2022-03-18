package com.pbo.assessment1pbo;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class ShowroomJaya {
    private static final ArrayList<Mobil> arrMobil = new ArrayList<>();

    public static void main(String[] args) {
        //Matikan comment untuk menjalankan perintah dari 3 pilihan dibawah ini
        Mobil mobil = new Mobil("Avanza","2018", 150000000.0, 5);
        tambahMobil(mobil);
//        Mobil mobil2 = new Mobil("Aston Martin","2019", 394000000.0, 2);
//        tambahMobil(mobil2);
//        Mobil mobil1 = new Mobil("YARIS 1.5 G M/T 3 Airbags","2020", 248300000.0, 4);
//        tambahMobil(mobil1);

        viewStok();
        System.out.println("==================");
        beliMobil("Avanza", "2018", 15);
//        beliMobil("Aston Martin", "2019", 2);
//        beliMobil("YARIS 1.5 G M/T 3 Airbags", "2020", 4);

    }

    public static void tambahMobil(Mobil mobil){
        arrMobil.add(mobil);
    }

    public static void beliMobil(String merk, String tahunKeluaran, int jumlahBeli){
        System.out.println("Showroom Mobil Jaya - Penjualan\n" +
                "INPUT\n" +
                "Merk : " + merk + "\n" +
                "Tahun Keluaran : " + tahunKeluaran + "\n" +
                "Jumlah : " + jumlahBeli);
        System.out.println("==================");
        arrMobil.forEach(mobil -> {
            if (merk.equalsIgnoreCase(mobil.getMerk()) && tahunKeluaran.equalsIgnoreCase(mobil.getTahunKeluaran()) && jumlahBeli <= mobil.getStock()){
                mobil.setStock(mobil.getStock() - jumlahBeli);
                double diskon = 0.0;
                double hargadiskon = 0.0;
                DecimalFormat decfor = new DecimalFormat("0.0");
                String satuan = decfor.format(mobil.getHarga());
                String harga = decfor.format(mobil.getHarga() * jumlahBeli);
                double totalBayar = mobil.getHarga() * jumlahBeli;

                System.out.println("OUTPUT\n" +
                        "Merk : " + mobil.getMerk() + "\n" +
                        "Harga Satuan : " + satuan + "\n" +
                        "Tahun Keluaran : " + mobil.getTahunKeluaran() + "\n" +
                        "Jumlah Beli : " + jumlahBeli + "\n" +
                        "Total Harga : " + harga);
                if (jumlahBeli == 1){
                    diskon = 0.0;
                    hargadiskon = 0.0;
                }
                if (jumlahBeli == 2){
                    diskon = 10.0;
                    hargadiskon =(mobil.getHarga() * jumlahBeli) * 0.1;

                    mobil.setHarga(hargadiskon);
                }

                if (jumlahBeli > 2){
                    diskon = 20.0;
                    hargadiskon = (mobil.getHarga() * jumlahBeli) * 0.2;

                    mobil.setHarga(hargadiskon);
                }

                String total = decfor.format(totalBayar - hargadiskon);

                System.out.println("Diskon : " + diskon + " persen\n" +
                        "Total Diskon : " +  hargadiskon + "\n" +
                        "Total Bayar : " + total );
                System.out.println("==================");
            } else System.out.println("OUTPUT\n" +
                        "Maaf, Jumlah Stok Tidak Mencukupi");
            });
    }

    public static void viewStok(){
        arrMobil.forEach(Mobil::displayInfo);
    }
}