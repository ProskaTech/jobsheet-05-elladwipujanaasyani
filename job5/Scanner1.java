// Created by 21343022_Ella Dwipujana Asyani

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package job5;

/**
 *
 * @author Ella Dwipujana Asyani
 */
import java.util.Scanner;

public class Scanner1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner in = new Scanner (System.in);
        
        System.out.print("Masukkan Nama Lengkap: ");
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
