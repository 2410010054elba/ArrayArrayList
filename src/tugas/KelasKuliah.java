/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

import java.util.ArrayList;

public class KelasKuliah {

    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    public void tambahMahasiswa(Mahasiswa m) {
        daftarMahasiswa.add(m);
    }

    public void tampilkanSemua() {
        System.out.println("== Daftar Mahasiswa ==");
        for (int i = 0; i < daftarMahasiswa.size(); i++) {
            Mahasiswa m = daftarMahasiswa.get(i);
            System.out.println((i + 1) + ". " + m.info());
        }
        System.out.println("Total mahasiswa: " + daftarMahasiswa.size());
    }

    public double hitungRataRata() {
        if (daftarMahasiswa.isEmpty()) {
            return 0;
        }
        double total = 0;
        for (Mahasiswa m : daftarMahasiswa) {
            total += m.getNilai();
        }
        return total / daftarMahasiswa.size();
    }

    public int jumlahLulus() {
        int lulus = 0;
        for (Mahasiswa m : daftarMahasiswa) {
            if (m.lulus()) {
                lulus++;
            }
        }
        return lulus;
    }
}