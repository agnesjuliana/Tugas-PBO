/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulationPraktik2;

/**
 *
 * @author hp
 */
public class Bola {
    private int jarijari;

    
    public void setJarijari(int jarijari){
        this.jarijari = jarijari;
    }
    public void showDiameter(){
        int diameter = this.jarijari*2;
        System.out.println("Diameter bola adalah "+diameter);
    }
    public void showPermukaan(){
        double permukaan = 4*Math.PI*Math.pow(this.jarijari,2);
        System.out.println("Luas permukaan bola adalah "+permukaan);
    }
    public void showVolume(){
        double volume = 4/3*Math.PI*Math.pow(this.jarijari,3);
        System.out.println("Volume bola adalah "+volume);
    }
}
