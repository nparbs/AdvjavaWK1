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
abstract class InputDevice extends UsbDevice{
    protected int pollingRate;
    
    
    public void pollingRate() {
        System.out.println( name + " is an input device with a polling rate of "
                + pollingRate);
    }
}
