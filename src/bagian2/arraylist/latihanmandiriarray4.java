/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian2.arraylist;

import java.util.ArrayList;

public class latihanmandiriarray4 {
    public static void main(String[] args) {
        
        ArrayList<String> daftarBelanja = new ArrayList<>();
        
        daftarBelanja.add("Susu");
        daftarBelanja.add("Roti");
        daftarBelanja.add("Telur");
        daftarBelanja.add("Minyak");
        
        System.out.println("Sebelum dihapus : " + daftarBelanja);
        
        daftarBelanja.remove(1);
        
        System.out.println("Setelah dihapus : " + daftarBelanja);
        System.out.println("Jumlah akhir    : " + daftarBelanja.size());
    }
}
