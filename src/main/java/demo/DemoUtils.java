package demo;

import java.util.Random;

/**
 * Demo Utils class.
 * 
 * @author jfigueruela
 * @since 20160626
 */
public class DemoUtils {

    /**
     * Generates inclusive random value between two input values.
     * 
     * @param min
     *            Minimum value range.
     * @param max
     *            MAximun value range.
     * @return {Integer} value generated.
     */
    public static int getRandomValue(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
}
