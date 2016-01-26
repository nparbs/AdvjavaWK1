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
public class Jedi extends ForceSensitive{
    private String lightsaberColor;
   
    
     public Jedi() {
        this.name="Luke Skywalker";
        this.side="Light";
        this.lightsaberColor="Green";
    }
     
    public Jedi(String name, String side, String lightsaberColor) {
        this.name=name;
        this.side=side;
        this.lightsaberColor = lightsaberColor;
    }

    
    
    public String getLightsaberColor() {
        return lightsaberColor;
    }

    public void setLightsaberColor(String lightsaberColor) {
        this.lightsaberColor = lightsaberColor;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    

    @Override
    public void stats() {
        System.out.println(name+" is on the " + side + " side and has a " 
                + lightsaberColor + " lightsaber");
    }
    
    public void swingLS(){
        System.out.println(name + " swings his " + lightsaberColor 
                + " lightsaber");
    }
    
    
}
