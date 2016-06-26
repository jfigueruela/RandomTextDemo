package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.log4j.Logger;

import demo.RandomtextService;

/**
 * Demo Utils class.
 * 
 * @author jfigueruela
 * @since 20160626
 */
public class DemoUtils {
    private static final Logger logger = Logger.getLogger(DemoUtils.class);

    /**
     * Generates inclusive random value between two input values.
     * 
     * @param min
     *            Minimum value range.
     * @param max
     *            Maximun value range.
     * @return {Integer} value generated.
     */
    public static int getRandomValue(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    public static String getParagraphSum(List<RandomTextItemProcessDTO> list) {
        String result = "";
        for (RandomTextItemProcessDTO item : list) {
            result += item.getRandomtextTextRequest().getText_out();
        }
        return result;
    }

    public static Integer getParagraphAverageSize(
            List<RandomTextItemProcessDTO> list) {
        Integer result = 0;
        for (RandomTextItemProcessDTO item : list) {
            result += item.getRandomtextTextRequest().getText_out().length();
        }
        if (result > 0) {
            result = result / list.size();
        }
        return result;
    }

    public static long getParagraphProcessingTime(
            List<RandomTextItemProcessDTO> list) {
        long result = 0;
        for (RandomTextItemProcessDTO item : list) {
            result += item.getProcessTime();
        }
        if (result > 0) {
            result = result / list.size();
        }
        return result;
    }

    /**
     * Clean and search for the most frequent work on text.
     * 
     * @param inputString
     * @return {String} Frequent word.
     */
    public static String searchMostFrequentWord(String inputString) {
        // Remove all HTML marks.
        inputString = inputString.replaceAll("\\<.*?>", " ");
        // Remove all end of line character.
        inputString = inputString.replaceAll("(\\r|\\n)", " ");
        // Remove all '.' character
        inputString = inputString.replaceAll("(\\.)", " ");
        logger.info("inputString:" + inputString);
        // Split string to array to be processed.
        String[] wordsArray = inputString.split(" ");
        logger.info("wordsArray:" + wordsArray.toString());
        int counter = 0;
        String mostFrequentWord = "";
        for (String streamed : wordsArray) {
            if (streamed.toLowerCase().equals(mostFrequentWord)) {
                counter++;
            } else if (counter == 0) {
                mostFrequentWord = streamed.toLowerCase();
                counter = 1;
            } else {
                counter--;
            }
        }
        return mostFrequentWord;
    }
}
