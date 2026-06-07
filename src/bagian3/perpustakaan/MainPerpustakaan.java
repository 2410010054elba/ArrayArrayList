/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian3.perpustakaan;

public class MainPerpustakaan {
    public static void main(String[] args) {

        Perpustakaan perpus = new Perpustakaan();

        perpus.tambahBuku(new Buku("Laskar Pelangi", "Andrea Hirata", 2005));
        perpus.tambahBuku(new Buku("Sang Pemimpi", "Andrea Hirata", 2006));
        perpus.tambahBuku(new Buku("Bumi Manusia", "Pramoedya", 1980));
        perpus.tambahBuku(new Buku("Negeri 5 Menara", "Ahmad Fuadi", 2009));

        perpus.tampilkanKoleksi();
        System.out.println();

        System.out.println("=== UJI PINJAM ===");
        perpus.pinjamBuku("Bumi Manusia");
        perpus.pinjamBuku("Bumi Manusia");
        System.out.println();

        System.out.println("=== UJI KEMBALIKAN ===");
        perpus.kembalikanBuku("Bumi Manusia");
        perpus.kembalikanBuku("Bumi Manusia"); 
        perpus.kembalikanBuku("Harry Potter"); 
        System.out.println();

        System.out.println("=== UJI CARI PENULIS ===");
        perpus.cariPenulis("Andrea Hirata");
        System.out.println();
        perpus.cariPenulis("Tere Liye"); 
        System.out.println();

        perpus.tampilkanKoleksi();
        System.out.println("Buku tersedia: " + perpus.jumlahTersedia());
    }
}