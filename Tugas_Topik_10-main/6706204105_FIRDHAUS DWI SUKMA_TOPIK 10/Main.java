package com.pbo.topik10;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private ArrayList<Member> members = new ArrayList<>();
    private Scanner scanInput = new Scanner(System.in);

    private void inputDriver(){
        System.out.println("Masukkan Data Driver");
        System.out.print("NIK : ");
        String nik = scanInput.next();
        System.out.print("Nama : ");
        String nama = scanInput.next();
        System.out.print("No Telepon : ");
        String noTelp = scanInput.next();
        System.out.print("Saldo : ");
        double saldo = scanInput.nextDouble();
        System.out.print("Plat nomor : ");
        String platNomor = scanInput.next();
        System.out.print("Jenis Kendaraan : ");
        String jenisKendaraan = scanInput.next();

        Driver driverInput = new Driver(platNomor, jenisKendaraan, nik, nama, noTelp, saldo);
        members.add(driverInput);
    }

    private void inputCustomer(){
        System.out.println("Masukkan Data Customer");
        System.out.print("NIK : ");
        String nik = scanInput.next();
        System.out.print("Nama : ");
        String nama = scanInput.next();
        System.out.print("No Telepon : ");
        String noTelp = scanInput.next();
        System.out.print("Saldo : ");
        double saldo = scanInput.nextDouble();

        Customer customerInput = new Customer(nik, nama, noTelp, saldo);
        members.add(customerInput);
    }

    private Member searchById (String idNum){
        Member member = null;
        for (Member x : members) {
            if (x.getNik().equals(idNum)) {
                member = x;
                break;
            }
        }
        return member;
    }

    private void display(){
        for (Member member : members) {
            member.display();
        }
    }

    private void transaksi(int type){
        System.out.println("Create Transaksi");
        System.out.print("ID Customer : ");
        String idCus = scanInput.next();
        System.out.print("ID Driver : ");
        String idDriv = scanInput.next();
        System.out.print("Saldo : ");
        double saldo = scanInput.nextDouble();

        Member customer = searchById(idCus);
        Member driver = searchById(idDriv);

        if (customer != null && (customer instanceof Customer) && (driver instanceof Driver)){
            if (type == 0){
                customer.transaksi(driver, saldo);
            } else {
                driver.transaksi(customer, saldo);
            }
        }
    }

    private void mainOjol(){
        int select;

        do {
            System.out.println("Select Menu");
            System.out.println("1. Input Driver");
            System.out.println("2. Input Customer");
            System.out.println("3. Display Data");
            System.out.println("4. Top-Up Saldo");
            System.out.println("5. Transaksi");
            System.out.println("6. Exit");

            System.out.print("Select : ");
            select = scanInput.nextInt();
            switch(select){
                case 1 :
                    inputDriver();
                    break;
                case 2 :
                    inputCustomer();
                    break;
                case 3 :
                    display();
                    break;
                case 4 :
                    transaksi(0);
                    break;
                case 5 :
                    transaksi(1);
                    break;
                case 6 :
                    System.out.println("Exit");
                    break;
            }
        }while (select != 6);
    }

    public static void main(String[] args) {
        new Main().mainOjol();
    }
}
