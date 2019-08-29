/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PemantapanKasusKondisi;

import java.util.Scanner;

/**
 *
 * @author nuris
 */

public class TagihanBiayaListrik {
    public static void main (String[] args) {
        int Kwh;
        double total;
        
       
        
    // Scanner
    Scanner masukan = new Scanner(System.in);
    
    // input
    System.out.println("input perkalian Kwh: ");
    Kwh = masukan.nextInt();
    
    // pengulangan
    if (Kwh <= 450) {
        System.out.println("Golongan C");
        double biaya = 20000 + (1000 * Kwh);
        
        total = Double.valueOf((biaya * 10 / 100) + biaya);
        System.out.println("total: "+ total);
        
    } else if (Kwh <= 900) {     
        System.out.println("Golongan B");
        double biaya = 35000 + (2500 * Kwh);
        
        total = Double.valueOf(15/100 + biaya);
        System.out.println("total: " + total);
        
    } else if (Kwh <= 1200) {
        System.out.println("Golongan A");
        double biaya = 50000 + (3000 * Kwh);
        
        total = Double.valueOf(20/100 + biaya);
        System.out.println("total: " + total);
    }
        
    
        
                
    
    
    
        
    }
    
}
