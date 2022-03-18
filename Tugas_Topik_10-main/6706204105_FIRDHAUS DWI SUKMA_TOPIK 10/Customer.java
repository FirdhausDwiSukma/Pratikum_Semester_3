package com.pbo.topik10;

public class Customer extends Member{

    public Customer(String nik, String nama, String noTelp, double saldo){
        super(nik, nama, noTelp, saldo);
    }

    @Override
    public void display() {
        System.out.println("==== Data Customer ====");
        System.out.println("NIK : " + nik);
        System.out.println("Nama : " + nama);
        System.out.println("Saldo : " + saldo);
    }
}
