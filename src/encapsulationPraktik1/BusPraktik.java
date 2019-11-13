/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulationPraktik1;

/**
 *
 * @author hp
 */
public class BusPraktik {
    private int penumpang;
    private int maxPenumpang;
    private int berat;
    private int average;

    //konstruktor kelas Bus
    public BusPraktik(int maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }


    //method mutator untuk menambahkan penumpang
    public void addPenumpang(int penumpang) {

        int temp;
        temp = this.penumpang + penumpang;
        if (temp >= maxPenumpang) {
            System.out.println("Penumpang melebihi kuota");
            

        }else {
            this.penumpang = temp;
        }
    }
    public void cetak (){
        System.out.println("Penumpang bus sekarang adalah "+ penumpang);
        System.out.println("Jumlah penumpang maksimal adalah "+ maxPenumpang);
        System.out.println("Jumlah berat penumpang "+berat);
        System.out.println("Rata rata berat penumpang adalah "+ average);
    }
    
    public void berat (int berat){
        int rata;
        this.berat = this.berat+berat;
        ratarata();

    } 
    
    public void ratarata(){
        int average = berat/penumpang;
        this.average = average;
    }
}
