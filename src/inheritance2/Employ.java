/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance2;

/**
 *
 * @author hp
 */
public class Employ extends Person {
    private String noKaryawan;

    public Employ(String noKaryawan, String nama,int usia) {
        super(usia, nama);
        this.noKaryawan = noKaryawan;
    }
    
    //metode 
    public void info (){
        System.out.println("No. Karyawan : "+ this.noKaryawan);
        super.info();
    }
    
    
    
}
