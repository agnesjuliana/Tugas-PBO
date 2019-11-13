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
public class Shape {

    //variable private
    private String color;

    //constructor
    public Shape(String color) {
        this.color = color;
    }

    public String toString() {
        return "Shape [colors = " + color + "]";
    }

    public double getArea() {
        System.err.println("Shape tidak diketahui, tidak dapat menghitung area");
        return 0;
    }
}
