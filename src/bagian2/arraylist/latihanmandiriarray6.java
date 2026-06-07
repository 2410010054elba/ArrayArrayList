/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian2.arraylist;

import java.util.ArrayList;

public class latihanmandiriarray6 {
    public static void main(String[] args) {
        
        ArrayList<String> nama = new ArrayList<>();
        
        nama.add("Andy");
        nama.add("Dimas");
        nama.add("Lana");
        nama.add("Ripad");
        nama.add("Elba");
        nama.add("Shadania");
        
        System.out.println("Semua nama : " + nama);
        System.out.println();
        System.out.println("Nama yang diawali huruf A:");
        
        for (String n : nama) {
            if (n.startsWith("A")) {
                System.out.println("- " + n);
            }
        }
    }
}