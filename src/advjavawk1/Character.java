/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advjavawk1;

/**
 *
 * @author Nick
 */
abstract class Character extends NonRealBeing {
    protected String cClass;
    
    public void cClass(){
        System.out.println("My class is " + cClass);
    }
    
}
