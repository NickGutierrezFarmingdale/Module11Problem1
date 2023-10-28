package org.example;

public class Adapter implements EuropeanSocket{

    public Adapter(AmericanPowerPlug americanPowerPlug){
    }

    @Override
    public void plugIntoEuropeanSocket(){
        System.out.println("Plugging into european socket.");
    }
}
