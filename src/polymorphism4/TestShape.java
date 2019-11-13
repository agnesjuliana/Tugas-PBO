/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism4;

/**
 *
 * @author hp
 */
public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Rectangle ("red",4,5);
        System.out.println("s1");
        System.out.println("luasnya adalah "+s1.getArea());
        System.out.println("datanya " + s1.toString());
        
        Shape s2 = new Triangle ("blue",4,5);
        System.out.println("s1");
        System.out.println("luasnya adalah "+s2.getArea());
        System.out.println("datanya " + s2.toString());
    }

}
