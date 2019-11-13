/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance1;

/**
 *
 * @author hp
 */
public class Kedua extends Pertama {
    private int b = 0;
    
    protected void BacaSuper (){
        System.out.println("Nilai b : "+b);
       terprotek ();
       info ();
    }
}
