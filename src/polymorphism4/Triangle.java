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
public class Triangle extends Shape{
    //variable private
    private int base;
    private int height;
    
    //constructor
    public Triangle (String color, int base, int height){
    super(color);
    this.base = base;
    this.height = height;
    
    }
    
    public String toString (){
        return "Triangle [base = " +base + ",height = "+ height + ","+"]";
    }
    
    public double getArea (){
        return 0.5*base*height;
    }
}
