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
public class Fork extends Silverware {

    private String material;

    public Fork() {
        super();
        this.name="Fork";
        this.type="Dinner Ware";
        this.material="Metal";
        
    }
    public Fork(String name,String type, String mat) {
        super();
        this.name=name;
        this.type=type;
        this.material=mat;
    }

    
    
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    

    @Override
    public void use() {
        System.out.println(name + "  stabs food");
    }
    
    public void forkMaterial() {
        System.out.println("Fork Material is " + material);
    }
    
}
