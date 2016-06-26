package demo;

import java.util.List;

import utils.DemoDTO;
import utils.DemoUtils;
import utils.RandomTextItemProcessDTO;

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
    public static DemoDTO process(Integer pStart, Integer pEnd,
            Integer wCountMin, Integer wCountMax) {
        long startProcTime = System.nanoTime();
        DemoDTO result = new DemoDTO();

        RandomtextService randomtextService = new RandomtextService();
        // Number of paragraphs, generated random value.
        int paragrapthNumber = DemoUtils.getRandomValue(pStart, pEnd);
        List<RandomTextItemProcessDTO> list = randomtextService
                .getRandomTextList(paragrapthNumber);

        String paragraphsSum = DemoUtils.getParagraphSum(list);

        // Set most frequenct word.
        result.setFreq_word(DemoUtils.searchMostFrequentWord(paragraphsSum));

        result.setAvg_paragraph_size(DemoUtils.getParagraphAverageSize(list));
        result.setAvg_paragraph_processing_time(DemoUtils
                .getParagraphProcessingTime(list));
        // Calculate total process time elapsed.
        long endProcTime = System.nanoTime();
        result.setTotal_processing_time((endProcTime - startProcTime) / 1000000000);

        // TODO @jfigueruela: Here persist {DemoDTO}
        return result;
    }
}
