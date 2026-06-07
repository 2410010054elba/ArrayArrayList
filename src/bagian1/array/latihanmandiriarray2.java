/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian1.array;

/**
 *
 * @author ASUS
 */
public class latihanmandiriarray2 {
    public static void main(String[] args) {
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
        
        System.out.println("Hari dengan lebih dari 5 huruf:");
        for (String h : hari) {
            if (h.length() > 5) {
                System.out.println(h);
    }
        }
    }
}