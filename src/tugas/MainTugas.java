/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//NAMA : MUHAMMAD ELBA HASANI
//NPM  : 2410010054

package tugas;

public class MainTugas {
    public static void main(String[] args) {

        String[] mataKuliah = {
            "Pemrograman Berbasis Objek",
            "Struktur Data",
            "Basis Data"
        };

        System.out.println("== Daftar Mata Kuliah ==");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.println((i + 1) + ". " + mataKuliah[i]);
        }
        System.out.println();

        KelasKuliah kelas = new KelasKuliah();

        kelas.tambahMahasiswa(new Mahasiswa("Andy",   "2401001", 85.0));
        kelas.tambahMahasiswa(new Mahasiswa("Dimas",   "2401002", 55.0));
        kelas.tambahMahasiswa(new Mahasiswa("Elba",  "2401003", 90.0));
        kelas.tambahMahasiswa(new Mahasiswa("Lana",   "2401004", 45.0));
        kelas.tambahMahasiswa(new Mahasiswa("Shadania",    "2401005", 72.0));

        kelas.tampilkanSemua();
        System.out.println();

        System.out.println("== Rekap Nilai ==");
        System.out.println("Rata-rata nilai  : " + kelas.hitungRataRata());
        System.out.println("Jumlah lulus     : " + kelas.jumlahLulus());
        System.out.println("Jumlah tidak lulus: " +
                (5 - kelas.jumlahLulus()));
        System.out.println();

        System.out.println("== Menambah Mahasiswa Baru ==");
        kelas.tambahMahasiswa(new Mahasiswa("Ripad", "2401006", 78.0));
        System.out.println("Mahasiswa baru berhasil ditambahkan.");
        System.out.println();

        kelas.tampilkanSemua();
        System.out.println();

        System.out.println("== Rekap Nilai Terbaru ==");
        System.out.println("Rata-rata nilai  : " + kelas.hitungRataRata());
        System.out.println("Jumlah lulus     : " + kelas.jumlahLulus());
    }
}