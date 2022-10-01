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

import javax.swing.JOptionPane;

public class GetInputFromKeyboard2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        String name ="", hoby ="";
        
        name = JOptionPane.showInputDialog("Nama Anda : ");
        hoby = JOptionPane.showInputDialog("Hobi Anda : ");
        
        String msg = "Jadi Hobi Anda "+hoby+". "
                + "Hobi yang bagus "+name;
        
        JOptionPane.showMessageDialog(null, msg);
        
        System.out.println("Jadi Hobi Anda "+hoby+". Hobi yang bagus" + name);
    }
}
