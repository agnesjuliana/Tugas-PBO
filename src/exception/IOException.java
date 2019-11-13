/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.File;

public class IOException {

    public void IOException() {
        try {
            FileInputStream in = new FileInputStream("input.txt");
            System.out.println("This is not printed");
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
    }

    public static void main(String[] args) {
        IOException example = new IOException();
        example.IOException();

        
        File file = new File ( "test.txt");
        FileInputStream fileInputStream = null;
        
        try{fileInputStream = new FileInputStream (file);
        fileInputStream.read();
            System.out.println("Tidak eror");
            
        } catch (java.io.IOException e){
            System.out.println(e);
        }
        
    }

    
}
