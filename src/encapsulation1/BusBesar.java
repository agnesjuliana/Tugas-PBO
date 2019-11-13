/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation1;

/**
 *
 * @author Agnes Juliana
 */
public class BusBesar {
    public static void main(String[] args) {
        Bus busBesar = new Bus ();
        
        busBesar.penumpang = 6;
        busBesar.maxPenumpang = 15;
        
        busBesar.cetak();
    }
}
