package org.cake;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UtilsTest
{
    @Test
    public void testGeneratePositiveRandomLong() {
        long minLimit = 1L;
        long maxLimit = 10000000000L;

        for (int i = 0; i < 1000; i++) {
            long randomLong = Utils.generatePositiveRandomLong();
            Assertions.assertTrue(randomLong >= minLimit && randomLong < maxLimit, "Generated value is not within the expected range");
        }
    }
}
