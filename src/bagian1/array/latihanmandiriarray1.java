/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian1.array;

/**
 *
 * @author ASUS
 */
public class latihanmandiriarray1 {
    public static void main(String[] args) {
        double[] suhu = {31.5, 28.0, 33.2, 27.8, 35.0, 29.6};
        
        double tertinggi = suhu[0];
        double terendah  = suhu[0];
        
        for (double s : suhu) {
            if (s > tertinggi) tertinggi = s;
            if (s < terendah)  terendah  = s;
        }
        
        System.out.println("Suhu tertinggi: " + tertinggi + " °C");
        System.out.println("Suhu terendah : " + terendah  + " °C");

    }
}
