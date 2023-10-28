package org.example;

public class Driver {
    public static void main(String[] args) {
        AmericanPowerPlug americanPlug = new AmericanPowerPlug();
        Adapter adapter = new Adapter(americanPlug);

        //American plug into european socket

        adapter.plugIntoEuropeanSocket();
    }
}
