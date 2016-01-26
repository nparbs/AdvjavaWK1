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
public class Pokemon extends Creature {

    private String type;

    public Pokemon(String name, String genre, String type) {
        this.name = name;
        this.genre = genre;
        this.type = type;
    }
    public Pokemon() {
        this.name = "Pikachu";
        this.genre = "Cartooon";
        this.type = "Electric";
    }
    
    

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
   
    
    @Override
    public void stats() {
        System.out.println(name + " is a " + type + " type of pokemon on a "
        + genre);
    }
    
    public void attack() {
        if(type=="Electric"){
            System.out.println("THUNDERBOLT");
        }else if(type=="Fire"){
            System.out.println("FLAMETHROWER");
        }else{
            System.out.println("Pokemon Attack");
        }
    }
    
    
}
