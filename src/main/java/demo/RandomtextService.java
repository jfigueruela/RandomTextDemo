package demo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.json.JSONObject;

import utils.JsonReader;
import utils.RandomTextItemProcessDTO;
import utils.RandomtextTextRequest;

public class RandomtextService {
    private static final Logger logger         = Logger.getLogger(RandomtextService.class);
    private static final String RANDOMTEXT_URL = "http://www.randomtext.me";

    /**
     * Gets a single {RandomtextTextRequest} object.
     * 
     * @param paragraphs
     * @param maxWNumber
     * @return {RandomtextTextRequest}
     */
    public RandomtextTextRequest getRandomText(int paragraphs, int maxWNumber) {
        RandomtextTextRequest result = null;

        String randomParams = String.format("/api/giberish/p-%s/1-%s", paragraphs, maxWNumber);

        try {
            // Connect to and bind a JSON response object.
            JSONObject json = JsonReader.readJsonFromUrl(String.format("%s%s", RANDOMTEXT_URL, randomParams));
            // Request handing object.
            result = new RandomtextTextRequest(json);
        } catch (IOException e) {
            logger.error("Error obtainig random text.", e);
        }

        return result;
    }

    /**
     * Get a list of random text objects with specified number items.
     * 
     * @param numItems
     * @param paragraphs
     * @param maxWNumber
     * @return
     */
    public List<RandomTextItemProcessDTO> getRandomTextList(int numItems, int paragraphs, int maxWNumber) {
        List<RandomTextItemProcessDTO> result = new ArrayList<RandomTextItemProcessDTO>();
        try {
            for (int i = 0; i < numItems; i++) {
                long startProcTime = System.nanoTime();

                Thread.sleep(1000);
                long endProcTime = System.nanoTime();
                long time = (endProcTime - startProcTime) / 1000000000;
                result.add(new RandomTextItemProcessDTO(this.getRandomText(paragraphs, maxWNumber), time));
            }
        } catch (InterruptedException e) {
            logger.error(String.format("Error loading items data."));
        }
        logger.info(String.format("Items loaded %s", result.size()));
        return result;
    }
}
