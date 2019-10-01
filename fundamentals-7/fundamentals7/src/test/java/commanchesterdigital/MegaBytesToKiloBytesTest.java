package commanchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MegaBytesToKiloBytesTest {

    @Test
    public void when2050KBShouldReturn2MBand2KB () {
        //Arrange
        Integer kiloByte = 1024;

        KiloBytesToMegaBytes KiloToMega = new KiloBytesToMegaBytes();

        KiloToMega.KiloBytesToMegaBytes(1024);


    }
}
