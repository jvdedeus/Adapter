import org.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KelvinTest {
    private Kelvin kelvin;
    private double baseTemp;

    @BeforeEach
    public void setUp() {
        baseTemp = 300.0;
        kelvin = new Kelvin(baseTemp);
    }

    @Test
    public void deveRetornarTemperaturaEmCelsius() {
        KelvinCelsius adapter = new KelvinCelsius(kelvin);
        double expected = baseTemp - 273.15;
        assertEquals(expected, adapter.getTemperatura(), 0.01);
    }

    @Test
    public void deveRetornarTemperaturaEmFahrenheit() {
        KelvinFahrenheit adapter = new KelvinFahrenheit(kelvin);
        double expected = (baseTemp - 273.15) * 9/5 + 32;
        assertEquals(expected, adapter.getTemperatura(), 0.01);
    }
}
