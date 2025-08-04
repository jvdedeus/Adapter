import org.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CelsiusTest {
    private Celsius celsius;
    private double baseTemp;

    @BeforeEach
    public void setUp() {
        baseTemp = 26.85;
        celsius = new Celsius(baseTemp);
    }

    @Test
    public void deveRetornarTemperaturaEmFahrenheit() {
        CelsiusFahrenheit adapter = new CelsiusFahrenheit(celsius);
        double expected = baseTemp * 9/5 + 32;
        assertEquals(expected, adapter.getTemperatura(), 0.01);
    }

    @Test
    public void deveRetornarTemperaturaEmKelvin() {
        CelsiusKelvin adapter = new CelsiusKelvin(celsius);
        double expected = baseTemp + 273.15;
        assertEquals(expected, adapter.getTemperatura(), 0.01);
    }
}
