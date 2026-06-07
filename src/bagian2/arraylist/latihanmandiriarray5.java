/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian2.arraylist;

import java.util.ArrayList;

public class latihanmandiriarray5 {
    public static void main(String[] args) {
        
        ArrayList<Integer> angka = new ArrayList<>();
        
        angka.add(70);
        angka.add(95);
        angka.add(60);
        angka.add(88);
        angka.add(75);
        
        System.out.println("Data angka : " + angka);
        
        int max = angka.get(0);
        
        for (int n : angka) {
            if (n > max) {
                max = n;
            }
        }
        
        System.out.println("Nilai terbesar : " + max);
    }
}
