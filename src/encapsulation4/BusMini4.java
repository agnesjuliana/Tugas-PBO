/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation4;

/**
 *
 * @author hp
 */
public class BusMini4 {
    public static void main(String[] args) {
        Bus4 busmini = new Bus4(5);
        busmini.getpenumpang(17);
        busmini.getpenumpang(24);
        busmini.cetak();
        
        busmini.addPenumpang(2);
        busmini.cetak();
    }
    
    
}
