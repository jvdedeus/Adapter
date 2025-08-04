import org.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FahrenheitTest {
    private Fahrenheit fahrenheit;
    private double baseTemp;

    @BeforeEach
    public void setUp() {
        baseTemp = 80.33;
        fahrenheit = new Fahrenheit(baseTemp);
    }

    @Test
    public void deveRetornarTemperaturaEmCelsius() {
        FahrenheitCelsius adapter = new FahrenheitCelsius(fahrenheit);
        double expected = (baseTemp - 32) * 5/9;
        assertEquals(expected, adapter.getTemperatura(), 0.01);
    }

    @Test
    public void deveRetornarTemperaturaEmKelvin() {
        FahrenheitKelvin adapter = new FahrenheitKelvin(fahrenheit);
        double expected = (baseTemp - 32) * 5/9 + 273.15;
        assertEquals(expected, adapter.getTemperatura(), 0.01);
    }
}
