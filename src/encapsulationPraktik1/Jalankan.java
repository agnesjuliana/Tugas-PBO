/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulationPraktik1;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Jalankan {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
          System.out.println("Masukkan jumlah maksimal penumpang");
        int a = scan.nextInt();
        

        BusPraktik bussaya = new BusPraktik(a);
        
   
        for (int i = 0; i <= a; i++) {
            System.out.println("Masukkan jumlah penumpang yang naik ke bus");
            int b = scan.nextInt();
            bussaya.addPenumpang(b);

            for (int j = 1; j <= b; j++) {
                
                System.out.println("Berat penumpang ke-"+j);
                int d = scan.nextInt();
                bussaya.berat(d);

            }
            System.out.println("======================================");
            bussaya.cetak();
            
            System.out.println("======================================");
        }
    }
}
