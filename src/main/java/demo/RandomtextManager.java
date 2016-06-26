package demo;

import java.util.List;

public class RandomtextManager {

    /**
     * 
     * @param pStart
     * @param pEnd
     * @param wCountMin
     * @param wCountMax
     * @return
     */
    public static DemoDTO process(Integer pStart, Integer pEnd,
            Integer wCountMin, Integer wCountMax) {
        DemoDTO result = new DemoDTO();

        RandomtextService randomtextService = new RandomtextService();
        // Number of paragraphs, generated random value.
        int paragrapthNumber = DemoUtils.getRandomValue(pStart, pEnd);
        List<RandomtextTextRequest> list = randomtextService
                .getRandomTextList(paragrapthNumber);

        RandomtextTextResponse randomtextTextResponse = new RandomtextTextResponse(
                list.get(0).getText_out(), 2, 3, 4);

        return result;
    }
}
