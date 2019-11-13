/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulationTantangan;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class BusMini {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean pernyataan = false;

        System.out.println("Masukkan jumlah maksimal penumpang");
        int a = scan.nextInt();
        

        Bus busMini = new Bus(a);
        
    


        for (int i = 0; i <= a; i++) {
            System.out.println("Masukkan jumlah penumpang yang naik ke bus");
            int b = scan.nextInt();

            busMini.addPenumpang(b);
            busMini.cetak();
            System.out.println("======================================");
        }

    }
}
