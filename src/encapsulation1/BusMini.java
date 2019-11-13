/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation1;

/**
 *
 * @author hp
 */
public class BusMini {
    public static void main(String[] args) {
        
        //pembuatan objek busMini dari kelas bus
        Bus busMini = new Bus ();
        
        //memasukkan nilai jumlah penumpang dan penumpang max
        
        busMini.penumpang = 5;
        busMini.maxPenumpang = 15;
        
        //memanggil method cetak pada kelas bus;
        busMini.cetak();
        
        //menambahkan penumpang pada busMini;
        busMini.penumpang = busMini.penumpang + 5;
        busMini.cetak();
        
        busMini.penumpang = busMini.penumpang - 2;
        busMini.cetak();
        
        busMini.penumpang = busMini.penumpang + 8;
        busMini.cetak();
    }
}
