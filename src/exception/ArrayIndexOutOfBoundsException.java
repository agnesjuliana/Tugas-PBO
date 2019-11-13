/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class ArrayIndexOutOfBoundsException {

    static int pertama[] = new int[3];
    static int kedua[] = new int[5];
    static int a = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Mungkin setelah ini salah");
            for (int i = 0; i < 4; i++) {
                pertama[i] = i;

            }
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        
        try {
            System.out.println("Masukkan jumlah angka yang ingin dibuat, maksimal 5");
            a = sc.nextInt();
            
            
            for (int i = 0;i <= a; i++) {
                kedua[i] = i;

            }
            
        }catch (java.lang.ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }

}
