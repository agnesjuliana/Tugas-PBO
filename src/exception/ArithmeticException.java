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
public class ArithmeticException {

    static int a = 3;

    public static void main(String[] args) {
        try {
            System.out.println("Apakah baris ini error?");
            int b = (a / 0);
            System.out.println("Hasilnya adalah " + b);
        } catch (java.lang.ArithmeticException e) {
            System.out.println(e);
        }
        
        System.out.println("LAnjut ke pengujian kedua");
        
        try{
        Scanner sc = new Scanner (System.in);
        System.out.println("Masukkan 2 buah integer");
        int b = sc. nextInt();
        }catch (java.lang.ArithmeticException e) {
            System.out.println(e);
        }
    }
}
