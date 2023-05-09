package utils;

import java.util.Random;

public class Randomiser {

    public static int getRandom(int upperBound) {
        return new Random().nextInt(upperBound);
    }

    public static int getRandom(int bottomBound, int upperBound) {
        return new Random().nextInt(bottomBound ,upperBound);
    }
}
