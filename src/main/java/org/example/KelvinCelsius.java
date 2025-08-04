package org.example;

public class KelvinCelsius extends Celsius {
    public KelvinCelsius(Kelvin kelvin) {
        super(kelvin.getTemperatura() - 273.15);
    }
}

