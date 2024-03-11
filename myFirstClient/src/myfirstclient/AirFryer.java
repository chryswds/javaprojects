/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myfirstclient;

/**
 *
 * @author chrystiandybas
 */
public class AirFryer {
    
    // Properties // Air Fryer components - basket, knob, plug, sensor
    private String airFryerBasket;
    private String knob;
    private String plug;
    private String sensor;
    
    // First constructor - Air Fryer parts
    public AirFryer(String airFryerBasket, String knob, String plug, String sensor) {
        this.airFryerBasket = airFryerBasket;
        this.knob = knob;
        
    }
    
    //Second constructor - Air Fryer functionalities
    public AirFryer(String plug, String sensor) {
        this.plug = plug;
        this.sensor = sensor;
    }

    //Getter because its allowed to be seen by something else
    public String getSensor() {
        return sensor;
    }
    
    //Setter because it can change - showing that the food is ready (green) or not ready (red)
    public void setSensor(String sensor) {
        this.sensor = sensor;
    }
    
    //Method representing the object working
    public String cookingFood(){
        return ("I'm preparing the food hohoho!!!");
    }

}

    
