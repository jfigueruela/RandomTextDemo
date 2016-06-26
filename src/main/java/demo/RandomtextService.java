package demo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.json.JSONObject;

public class RandomtextService {
    private static final Logger logger = Logger
            .getLogger(RandomtextService.class);
    private static final String RANDOMTEXT_URL = "http://www.randomtext.me";
    private static final String RANDOMTEXT_PARAMS = "/api/giberish/p-3/2-5";

    /**
     * Gets a single {RandomtextTextRequest} object.
     * 
     * @return {RandomtextTextRequest}
     */
    public RandomtextTextRequest getRandomText() {
        RandomtextTextRequest result = null;
        try {
            // Connect to and bind a JSON response object.
            JSONObject json = JsonReader.readJsonFromUrl(String.format("%s%s",
                    RANDOMTEXT_URL, RANDOMTEXT_PARAMS));
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
     * @return
     */
    public List<RandomtextTextRequest> getRandomTextList(int numItems) {
        List<RandomtextTextRequest> result = new ArrayList<RandomtextTextRequest>();
        for (int i = 0; i < numItems; i++) {
            result.add(this.getRandomText());
        }
        logger.info(String.format("Items loaded %s", result.size()));
        return result;
    }
}
