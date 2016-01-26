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
abstract class Creature extends NonRealBeing {
    protected String genre;
    
}
/*public abstract class Canine implements Animal {
    // Common instance property inherited by all sub-classes.
    private int age;

    // Common Animal methods inherited by all sub-classes.
    // Provide a concrete version that can be re-used by sub-classes.
    // No need to allow custom implementations by those sub-classes.
    @Override
    public int getAge() {
        return age;
    }

    // Is default implementation really a good idea here?
    @Override
    public void setAge(int age) {
        this.age = age;
    }
    
    // We won't implement speak here because Canine is too generic and each
    // sub-class will speak differently
    
    // Common Canine method.
    // We will dictate that all Canines should wag their tails, giving
    // each sub-class a chance to do this their own way
    public abstract void wagTail();
    
}*/