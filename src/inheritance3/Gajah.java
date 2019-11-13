/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance3;

/**
 *
 * @author hp
 */
public class Gajah extends Hewan{
    public static void testClassMethod (){
        System.out.println("INi testClassMethod di Gajah");
    }
    
    //mengoveride
    public void testInstanceMethod(){
        System.out.println("INi testInstanceMethod di Gajah dengan ovveride");
    }
    public static void main(String[] args) {
        Gajah myGajah = new Gajah();
        Hewan myHewan = myGajah;
        Hewan.testClassMethod();
        myHewan.testInstanceMethod();
    }
}
