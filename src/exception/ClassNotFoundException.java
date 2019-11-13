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
public class ClassNotFoundException {
    public static void main(String[] args) {
        try{
        Class.forName("IniGaada");
        }catch (java.lang.ClassNotFoundException e){
            System.out.println(e);
        }
        
        try{
        Class.forName("Mungkin gaada");
        }catch (java.lang.ClassNotFoundException e){
            System.out.println(e);
        }
    }
}
