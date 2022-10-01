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
public class Job5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukan nama lengkap: ");
        String nama = in.nextLine();
        
        System.out.print("Masukkan Nim: ");
        int Nim = in.nextInt();
        
        System.out.print("Masukkan Nilai : ");
        float nilai = in.nextFloat();
        
        System.out.println("\nNama : " + nama +
                           "\nNim : " + Nim +
                           "\nNilai : " + nilai);
    }
    
}
