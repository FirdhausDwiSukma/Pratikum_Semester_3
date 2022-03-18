package com.pbo.topik4;

public class MainPerusahaan {
    public static void main(String[] args) {
        Departemen departemen = new Departemen("PT. INDECFOOD");

        Karyawan karyawan1 = new Tetap("Caca", 800000, 200000);
        Karyawan karyawan2 = new Tetap("Ica", 500000, 550000);
        Karyawan karyawan3 = new Tetap("Kelvin", 700000, 600000);

        Karyawan karyawan4 = new Kontrak("Lili", 2, 5000000);
        Karyawan karyawan5 = new Kontrak("Lala", 4, 4000000);
        Karyawan karyawan6 = new Kontrak("Kiki", 6, 8000000);

        departemen.addKaryawan(karyawan1);
        departemen.addKaryawan(karyawan2);
        departemen.addKaryawan(karyawan3);
        departemen.addKaryawan(karyawan4);
        departemen.addKaryawan(karyawan5);
        departemen.addKaryawan(karyawan6);

        departemen.displayAll();
        departemen.displayKontrak();
        departemen.displayTetap();
    }
}