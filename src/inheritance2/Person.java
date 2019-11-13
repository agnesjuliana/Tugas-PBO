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
public class Person {
    
    private String nama;
    private int usia;
    
    //konstruktor 
    public Person (int usia, String nama){
        this.nama = nama;
        this.usia = usia;
    }
    
    //metode 
    public void info (){
        System.out.println("Nama : "+ this.nama);
        System.out.println("Usia : "+ this.usia);
    }
}
