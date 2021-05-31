/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek;

import java.util.Scanner;

/**
 *
 * @author MOKLET-1
 */

public class MethodRumusLuasPersegiPanjang {
    public static void main(String[] args) {
        int panjang;
        int lebar;
        double luas;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Menghitung Luas Persegi Panjang");
        
        System.out.print("Masukan panjang: ");
        
        panjang = scan.nextInt();
        
        System.out.print("Masukan lebar: ");
        
        lebar = scan.nextInt();
        
        luas = (lebar * panjang);
        
        System.out.println("Luas Persegi Panjang= " +luas);
        
    }
    
}
