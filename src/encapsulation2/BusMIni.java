/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation2;

/**
 *
 * @author hp
 */
public class BusMIni {
    public static void main(String[] args) {
        
        Bus busMini = new Bus (40);
        busMini.cetak();
        
        //penambahan penumpang 
        busMini.addPenumpang(15);
        busMini.cetak();
        
        //penambahan penumpang
        busMini.addPenumpang(5);
        busMini.cetak();
        
        busMini.addPenumpang(5);
        busMini.cetak();
        
        
    }
}
