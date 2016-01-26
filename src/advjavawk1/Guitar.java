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
public class Guitar extends StringInstrument{
    
    private String brand;
    private String type;
    
    public Guitar() {
        this.name="Electric Guitar";
        this.numOfStrings=6;
        this.brand="Ibanez"; 
        this.type="Eletric";
    }
     public Guitar(String name, int str, String brand,String type) {
        this.name=name;
        this.numOfStrings=str;
        this.brand=brand; 
        this.type=type;
    }

     
     
     
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNumOfStrings() {
        return numOfStrings;
    }

    public void setNumOfStrings(int numOfStrings) {
        this.numOfStrings = numOfStrings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

     
    
    @Override
    public void play() {
        System.out.println("duhduhduh duh duh duhduhduh");
    }
    
    public void stats() {
        System.out.println(name + " is a " +brand+" "+numOfStrings+ " String");
    }
    
    
}
