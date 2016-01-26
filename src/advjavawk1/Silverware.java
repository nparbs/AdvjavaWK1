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
abstract class Silverware extends Utensil{
    protected String type;
    
    @Override
    public void use() {
        System.out.println(name + " is used to eat the food");
    }
}
