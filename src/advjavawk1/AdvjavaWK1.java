/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advjavawk1;

/**
 *
 * @author Nick Parbs
 */

public class AdvjavaWK1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Fork
        Fork fork1 = new Fork();
        Fork myFork = new Fork("Nicks Fork","Kitchen Ware","Gold");
        fork1.use();
        fork1.forkMaterial();
        myFork.use();
        myFork.forkMaterial();
        
        //KB
        Keyboard logitechKB = new Keyboard();
        Keyboard myKB = 
                new Keyboard("Nicks Keyboard","QWERTY","MX-Reds",500);
        logitechKB.Info();
        myKB.Info();
        myKB.pollingRate();
        myKB.type();
        
        //Guitar
        Guitar electricGuitar = new Guitar();
        Guitar myGuitar = new Guitar("Nicks Guitar",6,"Gibson","Acoustic");
        electricGuitar.stats();
        electricGuitar.play();
        myGuitar.stats();
        
        //Wiz
        Wizard wiz = new Wizard();
        Wizard harry = new Wizard("Harry Potter","Griffindore",9000);
        wiz.cClass();
        harry.stats();
        
        //Jedi
        Jedi luke = new Jedi();
        Jedi obi = new Jedi("Obiwan","Light","Blue");
        luke.stats();
        luke.swingLS();
        obi.stats();
        obi.swingLS();
        
        //Pokemon
        Pokemon pika = new Pokemon();
        Pokemon charm = new Pokemon("Charmander","Cartoon","Fire");
        pika.stats();
        pika.attack();
        charm.stats();
        charm.attack();
        
    }
}
