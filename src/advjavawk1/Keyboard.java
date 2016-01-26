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
public class Keyboard extends InputDevice {
    private String keyType;
    private String switchType;

     public Keyboard() {
        this.name = "Logitech g710";
        this.keyType = "QWERTY";
        this.switchType = "MX-Blues";
        this.pollingRate=500;
    }
    public Keyboard(String name, String keyType, String switchType, int pol) {
        this.name = name;
        this.keyType = keyType;
        this.switchType = switchType;
        this.pollingRate=pol;
    }

    
    
    public String getKeyType() {
        return keyType;
    }

    public void setKeyType(String keyType) {
        this.keyType = keyType;
    }

    public String getSwitchType() {
        return switchType;
    }

    public void setSwitchType(String switchType) {
        this.switchType = switchType;
    }

    public int getPollingRate() {
        return pollingRate;
    }

    public void setPollingRate(int pollingRate) {
        this.pollingRate = pollingRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    


    @Override
    public void Info() {
        System.out.println( name +" is a " + keyType + "  keyboard and has " 
                + switchType);
    }
    public void type() {
        System.out.println("clickclack");
    }


    
    
    
}
