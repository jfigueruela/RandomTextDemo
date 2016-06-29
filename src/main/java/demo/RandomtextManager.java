package demo;

import java.util.ArrayList;
import java.util.List;

import utils.DemoDTO;
import utils.DemoUtils;
import utils.RandomTextItemProcessDTO;
import utils.RandomtextTextRequest;

public class RandomtextManager {

    /**
     * Process random text manager.
     * 
     * @param pStart
     * @param pEnd
     * @param wCountMin
     * @param wCountMax
     * @return {DemoDTO}
     */
    public static DemoDTO process(Integer pStart, Integer pEnd, Integer wCountMin, Integer wCountMax) {
        long startProcTime = System.nanoTime();
        DemoDTO result = new DemoDTO();

        RandomtextService randomtextService = new RandomtextService();
        // Number of paragraphs, generated random value.
        int paragrapthNumber = DemoUtils.getRandomValue(pStart, pEnd);
        RandomtextTextRequest randomtextTextRequest = randomtextService.getRandomText(paragrapthNumber, wCountMax);

        // Set most frequenct word.
        result.setFreq_word(DemoUtils.searchMostFrequentWord(randomtextTextRequest.getText_out()));

        result.setAvg_paragraph_size(DemoUtils.getParagraphAverageSize(randomtextTextRequest));

        // Calculate total process time elapsed.
        long endProcTime = System.nanoTime();
        result.setAvg_paragraph_processing_time((endProcTime - startProcTime) / 1000000000);

        // TODO @jfigueruela: Here persist {DemoDTO}
        return result;
    }

    public static DemoDTO processMultiple(Integer pStart, Integer pEnd, Integer wCountMin, Integer wCountMax) {
        long startProcTime = System.nanoTime();

        DemoDTO result = process(pStart, pEnd, wCountMin, wCountMax);

        long endProcTime = System.nanoTime();
        result.setTotal_processing_time((endProcTime - startProcTime) / 1000000000);

        return result;
    }
}
