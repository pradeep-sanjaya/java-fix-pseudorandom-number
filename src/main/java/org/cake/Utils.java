package org.cake;

import java.security.SecureRandom;

public final class Utils
{
    public static long generatePositiveRandomLong() {
        long minLimit = 1L;
        long maxLimit = 10000000000L;
        long range = maxLimit - minLimit;
        return minLimit + (Math.abs(new SecureRandom().nextLong()) % range);
    }
}
