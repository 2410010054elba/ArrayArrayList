/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian1.array;

/**
 *
 * @author ASUS
 */
public class latihanmandiriarray3 {
      public static void main(String[] args) {
        int[] angka = {4, 8, 15, 16, 23, 42};
        int jumlahGenap = 0;

      for (int a : angka) {
            if (a % 2 == 0) {
                jumlahGenap++;
   }               
  }
      System.out.println("Jumlah angka genap: " + jumlahGenap);
 }
}