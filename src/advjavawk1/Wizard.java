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
public class Wizard extends Character{

    private int mana;

    public Wizard() {
        this.name = "Jeff the Wizard";
        this.cClass = "Mage";
        this.mana = 500;
    }
    
    public Wizard(String name,String cclass,int mana) {
        this.name = name;
        this.cClass = cclass;
        this.mana = mana;
    }

    
    
    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public String getcClass() {
        return cClass;
    }

    public void setcClass(String cClass) {
        this.cClass = cClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    @Override
    public void stats() {
        System.out.println(name + " is a " + cClass + " and has " 
                + mana + " mana");
    }
    
    
}
