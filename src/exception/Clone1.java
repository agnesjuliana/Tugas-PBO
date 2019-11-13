/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author hp
 */
public class Clone1 {
    @Override
    public Clone1 clone()throws java.lang.CloneNotSupportedException{
        return (Clone1) super.clone();
    }
}
