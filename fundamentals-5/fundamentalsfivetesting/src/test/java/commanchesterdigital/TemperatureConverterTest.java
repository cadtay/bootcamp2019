package commanchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class TemperatureConverterTest {

    @Test
    public void whenFahrenheitIsZeroThenCelsiusIsMinus17() {
        // THIS IS A UNIT TEST

        // ARRANGE
        String unitToConvertTo = "C";
        int temperature = 0;

        // ACT
        double result = TemperatureConverter.covert(unitToConvertTo, temperature);

        // ASSERT
        Assertions.assertThat(result).isEqualTo(-17);

    }

    @Test
    public void whenFahrenheitIs100ThenCelciusIs38() {

        // THIS IS A UNIT TEST

        // ARRANGE
        String unitToConvertTo = "C";
        int temperature = 100;

        // ACT
        double result = TemperatureConverter.covert(unitToConvertTo, temperature);

        // ASSERT
        Assertions.assertThat(result).isEqualTo(38);

    }
}
