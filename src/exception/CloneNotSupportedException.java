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
public class CloneNotSupportedException {
    String nama;
    CloneNotSupportedException (String name){
            this.nama = nama;
        }
    
    public static void main(String[] args) {
        try{
            new Clone1().clone();
            
    }catch (java.lang.CloneNotSupportedException e){
            System.out.println(e);
    }
        
        
        try {
            CloneNotSupportedException coba1 = new CloneNotSupportedException ("Exception punya clone");
            CloneNotSupportedException coba2 = (CloneNotSupportedException) coba1.clone();
            
            System.out.println(coba2.nama);
            System.out.println("Tidak ada pengecalian");
            
        }catch (java.lang.CloneNotSupportedException e){
            System.out.println(e);
        }
        
        
}
}
