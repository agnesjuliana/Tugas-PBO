/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism1;

/**
 *
 * @author hp
 */
public class Aeroplan extends Vehicle{
    public void walk (){
        System.out.println("Aeroplan flying");
    }
    public void fuel (){
        System.out.println("Bahan bakar");
    }
    public static void main(String[] args) {
        Aeroplan garuda = new Aeroplan ();
        
        garuda.function();
        garuda.fuel();
        garuda.walk();
    }
   
}
