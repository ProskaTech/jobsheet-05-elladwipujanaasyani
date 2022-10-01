// Created by 21343022_Ella Dwipujana Asyani
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package job5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author Ella Dwipujana Asyani
 */
public class GetInputFromKeyboard1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
        
        String name = "", hoby = "";
        
        try{
            System.out.print("Nama Anda : ");
            name = dataIn.readLine();
            System.out.print("Hobi Anda :");
            hoby = dataIn.readLine();
        }
        
        catch (IOException e){
            System.out.println("Gagal membaca keyboard");
        }
        System.out.println("Jadi Hobi Anda " +hoby+". Hobi yang bagus " + name);
    }
}
