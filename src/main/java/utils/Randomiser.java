package utils;

import java.util.Random;

public class Randomiser {

    private static final int AMOUNT_OF_SYSTEMS = 5;
    private static final int AMOUNT_OF_ALL_TABLES = 15;
    private static final int AMOUNT_OF_TABLE_TYPES = 3;

    public static int getRandomSystem() {
        return getRandom(AMOUNT_OF_SYSTEMS);
    }

    public static int getRandomTable() {
        return getRandom(AMOUNT_OF_ALL_TABLES);
    }

    public static int getRandomTableType() {
        return getRandom(AMOUNT_OF_TABLE_TYPES);
    }

    public static int getRandom(int upperBound) {
        return new Random().nextInt(upperBound);
    }

    public static int getRandom(int bottomBound, int upperBound) {
        return new Random().nextInt(bottomBound ,upperBound);
    }
}
