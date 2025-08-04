package org.example;

public class CelsiusFahrenheit extends Fahrenheit {
    public CelsiusFahrenheit(Celsius celsius) {
        super((celsius.getTemperatura() * 9.0 / 5.0) + 32);
    }
}

