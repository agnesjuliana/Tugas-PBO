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
public class MontainTruck extends Truck {
    public int seatHeight;
    
    public MontainTruck (int startHeight, int startCadence,int startSpeed, int startGear){
            super (startCadence,startSpeed,startGear);
            seatHeight = startHeight;
    }
    
    public void setHeight (int newValue){
        seatHeight = newValue;
    }
    public static void main(String[] args) {
        System.out.println("Mulai berjalan");
        MontainTruck MB = new MontainTruck(0,0,0,0);
        System.out.println("gear= "+ MB.gear);
        System.out.println("speed= "+ MB.speed);
        MB.setGear (2);
        MB.speedUp(2);
        System.out.println("Gear= "+ MB.gear);
        System.out.println("Speed= "+ MB.speed);
    }
}
