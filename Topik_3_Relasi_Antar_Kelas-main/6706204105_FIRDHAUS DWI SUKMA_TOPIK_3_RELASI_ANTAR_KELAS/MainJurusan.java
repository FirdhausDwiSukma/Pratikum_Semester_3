package com.pbo.topik3;

import java.util.ArrayList;

public class MainJurusan {
    public static void main(String[] args) {
        Jurusan d3if = new Jurusan("D3IF", "Diploma 3 Rekayasa Perangkat Lunak Aplikasi");
        Jurusan d3si = new Jurusan("D3SI", "Diploma 3 Sistem Informasi");

        //D3RPLA
        Mahasiswa mhs1 = new Mahasiswa("6701", "Rendi");
        Mahasiswa mhs2 = new Mahasiswa("6702", "Chaca");
        Mahasiswa mhs3 = new Mahasiswa("6703", "Agus");

        //D3SI
        Mahasiswa mhs4 = new Mahasiswa("6301", "Ridwan");
        Mahasiswa mhs5 = new Mahasiswa("6302", "Siska");
        Mahasiswa mhs6 = new Mahasiswa("6303", "Zayn");
        Mahasiswa mhs7 = new Mahasiswa("6304", "Rahmat");

        //Add D3RPLA
        d3if.addMhs(mhs1);
        d3if.addMhs(mhs2);
        d3if.addMhs(mhs3);

        //Add D3SI
        d3si.addMhs(mhs4);
        d3si.addMhs(mhs5);
        d3si.addMhs(mhs6);
        d3si.addMhs(mhs7);

        //Mencetak Jurusan D3RPLA
        System.out.println("Diploma 3 Rekayasa Perangkat Lunak Aplikasi");
        System.out.println("Kode : " + d3if.getKode());
        System.out.println("Nama : " + d3if.getNama());
        //Mencetak Mahasiswa D3RPLA
        System.out.println("Daftar Mahasiswa D3RPLA :");
        ArrayList<Mahasiswa> mhsRpla = d3if.getMhs();
        for (int i = 0; i < mhsRpla.size(); i++) {
            System.out.println(i + 1 + ". " + mhsRpla.get(i).getNim() + " - " + mhsRpla.get(i).getNama());
        }

        //Mencetak Jurusan D3SI
        System.out.println("\nDiploma 3 Sistem Informasi");
        System.out.println("Kode : " + d3si.getKode());
        System.out.println("Nama : " + d3si.getNama());
        //Mencetak Mahasiswa D3SI
        System.out.println("Daftar Mahasiswa D3RPLA :");
        ArrayList<Mahasiswa> mhsSi = d3si.getMhs();
        for (int i = 0; i < mhsSi.size(); i++) {
            System.out.println(i + 1 + ". " + mhsSi.get(i).getNim() + " - " + mhsSi.get(i).getNama()) ;
        }
    }
}
