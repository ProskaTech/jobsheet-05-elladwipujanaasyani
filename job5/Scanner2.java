/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package job5;

import java.util.Scanner;
/**
 *
 * @author Ella Dwipujana Asyani
 */
public class Scanner2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float angka1, angka2, jumlah;
        Scanner dataMasuk = new Scanner(System.in);
        
        System.out.print("Masukkan Angka ke -1 : ");
        angka1 = dataMasuk.nextFloat();
        
        System.out.print("Masukkan Angka ke-2 : ");
        angka2 = dataMasuk.nextFloat(); 
        
        jumlah = angka1 + angka2;
        
        System.out.println("Angka ke-1 : " + angka1);
        System.out.println("Angka ke-2 : " + angka2);
        System.out.println("Jumlah : " + jumlah);
    }
    
}
