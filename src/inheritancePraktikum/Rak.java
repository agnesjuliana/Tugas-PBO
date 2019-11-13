/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancePraktikum;

/**
 *
 * @author hp
 */
public class Rak extends Perpustakaan{
    public static void jmlhrak(){
        System.out.println("Jumlah rak : 30 rak");
    }
    
    public static void cetak (){
        cetaknama();
        alamat ();
        jmlhrak();
    }


}
