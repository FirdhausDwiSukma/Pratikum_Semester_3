package com.pbo.topik1;

public class MainBuku {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Harry Potter", "J.K Rowling", 300000);
        Buku buku2 = new Buku("UML", "Ivar Jacobson", 400000);

        System.out.println(buku1.getJudul() + " " + buku1.getPengarang() + " " + buku1.getHarga());
        System.out.println(buku2.getJudul() + " " + buku2.getPengarang() + " " + buku2.getHarga());

    }
}
