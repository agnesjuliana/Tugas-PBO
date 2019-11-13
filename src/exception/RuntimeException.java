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
public class RuntimeException {
    public static void main(String[] args) {
        try{
        int b;
        System.out.println(b);
        }catch (java.lang.RuntimeException e){
            System.out.println(e);
        }
        
        try{
        boolean aku;
        System.out.println(aku);
        }catch (java.lang.RuntimeException e){
            System.out.println(e);
        }
    
    }
}
