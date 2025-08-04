package org.example;

public class CelsiusKelvin extends Kelvin {
    public CelsiusKelvin(Celsius celsius) {
        super(celsius.getTemperatura() + 273.15);
    }
}

