/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian3.perpustakaan;

public class Buku {
    private String judul;
    private String penulis;
    private boolean dipinjam;
    private int tahunTerbit; 

    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.dipinjam = false;
    }

    public String getJudul() { return judul; }
    public String getPenulis() { return penulis; }
    public boolean isDipinjam() { return dipinjam; }
    public int getTahunTerbit() { return tahunTerbit; } // GETTER BARU
    public void setDipinjam(boolean dipinjam) { this.dipinjam = dipinjam; }

    public String info() {
        String status = dipinjam ? "Dipinjam" : "Tersedia";
        return judul + " oleh " + penulis + 
               " (" + tahunTerbit + ") [" + status + "]";
    }
}