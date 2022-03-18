package com.pbo.topik10;

public class Driver extends Member {
    private final String noPlat, jenisKendaraan;

    public Driver (String noPlat, String jenisKendaraan, String nik, String nama, String noTelp, double saldo){
        super(nik, nama, noTelp, saldo);
        this.noPlat = noPlat;
        this.jenisKendaraan = jenisKendaraan;
    }

    @Override
    public void display() {
        System.out.println("==== Data Driver ====");
        System.out.println("NIK : " + nik);
        System.out.println("Nama : " + nama);
        System.out.println("Saldo : " + saldo);
        System.out.println("Nomor Plat : " + noPlat);
        System.out.println("Jenis Kendaraan : " + jenisKendaraan);
    }
}
