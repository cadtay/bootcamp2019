package commanchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class TestIntroduction {

    //annotation test needs to be used throughout the testing
    @Test
    public void testThatABankAccountTakesAnInputWhenDeposited() {

    }

    @Test
    public void shouldTakeInputWhenDeposited() {

    }

        // BDD STYLE:
    @Test
    public void givenBankAccountWhenInputThenDeposited() {

    }

    @Test
    public void shouldAddTwoNumbers() {
        // ARRANGE
        int first = 23;
        int second = 23;

        // ACT
        int result = first + second;

        // ASSERT
        assertThat(result).isEqualTo(46);

    }
}
