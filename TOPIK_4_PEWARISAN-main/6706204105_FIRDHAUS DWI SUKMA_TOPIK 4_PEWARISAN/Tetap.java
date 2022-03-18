package com.pbo.topik4;

public class Tetap extends Karyawan {
    private double tuDas;

    public Tetap(String nama, double tuDas, double gaDas){
        super(nama, gaDas);
        this.tuDas = tuDas;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Tunjangan Dasar : " + tuDas + "\n");
    }
}
