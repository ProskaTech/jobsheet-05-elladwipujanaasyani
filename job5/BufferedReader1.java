// Created by 21343022_Ella Dwipujana Asyani
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package job5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author Ella Dwipujana Asyani
 */
public class BufferedReader1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
        
        String a, b;
        float angka1, angka2, jumlah;
        System.out.println("Program Penjumlahan Dua Buah Bilangan");
        
        try {
            System.out.println("Masukkan Angka pertama :");
            a = dataIn.readLine();
            /*Data yang akan diproses aritmatika harus dikonversikan dulu
            dari tipe data string ke tipe data angka yang diperlukan.
            Data yang diperoleh dari inputan kelas BufferdReader tipe datanya selalu String*/
            angka1 = Float.parseFloat(a);//konversi dari string ke float
            
            System.out.print("Masukkan angka kedua :");
            b = dataIn.readLine();
            angka2 = Float.parseFloat(b);//konversi dari string ke float
            
            jumlah = angka1 + angka2;
            System.out.println("Jumlah : " + jumlah);
        }
        
        catch (IOException e) {
            System.out.println("gagal membaca keyboard");
        }
    }
    
}
