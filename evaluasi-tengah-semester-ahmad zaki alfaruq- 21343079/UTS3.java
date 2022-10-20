/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 *  Created by Ahmad Zaki Alfaruq_21343079
 */
import javax.swing.JOptionPane;

public class UTS3 {
    public static void main(String[]args){
        int angka;
        String a;
    
        a = JOptionPane.showInputDialog("Silahkan masukkan angka ");
        angka = Integer.parseInt(a);

        if(angka >=0) {
            JOptionPane.showMessageDialog(null,"angka "+angka+" adalah bilangan positif");
        }
        else{
            JOptionPane.showMessageDialog(null,"angka "+angka+" adalah bilangan negatif");
        }
    }
}

    
