package org.example;

public class FahrenheitKelvin extends Kelvin {
    public FahrenheitKelvin(Fahrenheit fahrenheit) {
        super((fahrenheit.getTemperatura() - 32) * 5.0 / 9.0 + 273.15);
    }
}

