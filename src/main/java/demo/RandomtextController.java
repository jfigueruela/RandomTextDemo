package demo;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import demo.RandomTextResult;
import demo.RandomTextResultDAO;
import demo.RandomtextManager;
import utils.DemoDTO;

@RestController
@RequestMapping("/betvictor")
public class RandomtextController {
    @Autowired
    @Qualifier("randomTextResultDAO")
    private RandomTextResultDAO randomTextResultDAO;
    private static final Logger logger = Logger.getLogger(RandomtextController.class);

    /**
     * 
     * @param pStart
     *            - indicates the start number of paragraphs
     * @param pEnd
     *            - indicates the end number of paragraphs
     * @param wCountMin
     *            - indicates min number of words in each paragraph
     * @param wCountMax
     *            - indicates max number of words in each paragraph
     * @return {ResponseEntity} Response demo processed.
     */
    @RequestMapping(value = "/text", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<DemoDTO> text(
            @RequestParam(value = "p_start", required = false, defaultValue = "1") Integer pStart,
            @RequestParam(value = "p_end", required = false, defaultValue = "3") Integer pEnd,
            @RequestParam(value = "w_count_min", required = false, defaultValue = "1") Integer wCountMin,
            @RequestParam(value = "w_count_max", required = false, defaultValue = "25") Integer wCountMax) {
        logger.info(String
                .format("Incoming parameters {p_start:%s,p_end:%s,w_count_min:%s,w_count_max:%s, }", pStart, pEnd, wCountMin, wCountMax));
        DemoDTO result = RandomtextManager.processMultiple(pStart, pEnd, wCountMin, wCountMax);

        RandomTextResult randomTextResult = null;
        randomTextResult = new RandomTextResult(result.getFreq_word(), result.getAvg_paragraph_size(),
                result.getTotal_processing_time(), result.getTotal_processing_time());

        randomTextResultDAO.save(randomTextResult);

        return ResponseEntity.accepted().body(result);
    }
}
