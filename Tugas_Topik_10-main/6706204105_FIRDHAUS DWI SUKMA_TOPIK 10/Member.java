package com.pbo.topik10;

public abstract class Member {
    protected final String nik, nama, noTelp;
    protected double saldo;

    public Member(String nik, String nama, String noTelp, double saldo){
        this.nik = nik;
        this.nama = nama;
        this.noTelp = noTelp;
        this.saldo = saldo;
    }

    public void transaksi(Member member, double cost){
        this.saldo += cost;
        member.saldo -= cost;
    }

    public String getNik() {
        return nik;
    }

    public abstract void display();
}
