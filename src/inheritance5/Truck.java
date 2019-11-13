/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance5;

/**
 *
 * @author hp
 */
public class Truck {
    //truk punya tiga properti
    public int candence;
    public int gear;
    public int speed;
    
    //truk punya satu konstruktor
    public Truck (int startCandence, int startSpeed, int startGear){
        gear = startGear;
        candence = startCandence;
        speed = startSpeed;
        
    }
    
    //truk punya empat method

    public void setCandence(int newValue) {
        candence = newValue;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }
    
    public void applybrake (int decrement){
        speed = decrement;
    }

    public void speedUp(int increment) {
        speed = increment;
    }
    
}
