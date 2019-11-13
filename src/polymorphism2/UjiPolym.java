/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism2;

/**
 *
 * @author hp
 */
public class UjiPolym {
    public static void main(String[] args) {
        Line agnes = new Line(20.0,30.0,40.0, 50.0);
        Line juliana = new Line (30.0,45.0,20.0,15.0);
        
        agnes.getLength();
        System.out.println("Agnes Equals Juliana = "+agnes.isEqual(agnes,juliana));
        
        System.out.println("Agnes Less Juliana = "+agnes.isLess(agnes,juliana));
        
        System.out.println("Agnes Greater Juliana = "+agnes.isGreater(agnes,juliana));
        
        
    }
}
