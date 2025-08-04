package org.example;

public class KelvinFahrenheit extends Fahrenheit {
    public KelvinFahrenheit(Kelvin kelvin) {
        super((kelvin.getTemperatura() - 273.15) * 9.0 / 5.0 + 32);
    }
}

