/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulationPraktik2;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Panggil {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Masukkan nilai jari jari bola");
        int a = scan.nextInt();
        
        Bola aku = new Bola ();
        
        aku.setJarijari(a);
        
        aku.showDiameter();
        aku.showPermukaan();
        aku.showVolume();
    }
}
