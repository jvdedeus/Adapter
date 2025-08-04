package org.example;

public class FahrenheitCelsius extends Celsius {
    public FahrenheitCelsius(Fahrenheit fahrenheit) {
        super((fahrenheit.getTemperatura() - 32) * 5.0 / 9.0);
    }
}

