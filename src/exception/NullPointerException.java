/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author hp
 */
public class NullPointerException {

    public static String saya;
    public static String dia = "mungkin";
    

    public static void main(String[] args) {

        try {

            System.out.println("Apakah ini salah? sepertinya tidak");
            if (saya.equals("aaa")) {
                System.out.println("Stringnya sama");
            }
            System.out.println("SAYA BINGUNG MAU BUAT APA");

        }catch (java.lang.NullPointerException e) {
            System.out.println("salahnyaaaa 1 " + e);

        }
        
        
        try {
            int i;
            for (i = 0; i < 3; i++) {
                
                boolean pernyataan = (saya.equals("iiii"));
                System.out.println(pernyataan);
            }
        }
        
        catch (java.lang.NullPointerException e) {
            System.out.println("salahnyaaaa 2 " + e);

        }

    }

}
