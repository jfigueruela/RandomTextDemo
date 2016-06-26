package dtos;

public class DemoDTO {
    /*
     * The word that was the most frequent in the paragraphs
     */
    private String freq_word;
    /*
     * The average size of a paragraph
     */
    private Integer avg_paragraph_size;
    /*
     * The average time spent analyzing a paragraph
     */
    private Integer avg_paragraph_processing_time;
    /*
     * Total processing time to generate the final response
     */
    private Integer total_processing_time;

    /**
     * DemoDTO
     * 
     * @param freq_word
     *            - the word that was the most frequent in the paragraphs
     * @param avg_paragraph_size
     *            - the average size of a paragraph
     * @param avg_paragraph_processing_time
     *            - the average time spent analyzing a paragraph
     * @param total_processing_time
     *            - total processing time to generate the final response
     */
    public DemoDTO(String freq_word, Integer avg_paragraph_size,
            Integer avg_paragraph_processing_time, Integer total_processing_time) {
        super();
        this.freq_word = freq_word;
        this.avg_paragraph_size = avg_paragraph_size;
        this.avg_paragraph_processing_time = avg_paragraph_processing_time;
        this.total_processing_time = total_processing_time;
    }

    public DemoDTO() {
    }

    public String getFreq_word() {
        return freq_word;
    }

    public void setFreq_word(String freq_word) {
        this.freq_word = freq_word;
    }

    public Integer getAvg_paragraph_size() {
        return avg_paragraph_size;
    }

    public void setAvg_paragraph_size(Integer avg_paragraph_size) {
        this.avg_paragraph_size = avg_paragraph_size;
    }

    public Integer getAvg_paragraph_processing_time() {
        return avg_paragraph_processing_time;
    }

    public void setAvg_paragraph_processing_time(
            Integer avg_paragraph_processing_time) {
        this.avg_paragraph_processing_time = avg_paragraph_processing_time;
    }

    public Integer getTotal_processing_time() {
        return total_processing_time;
    }

    public void setTotal_processing_time(Integer total_processing_time) {
        this.total_processing_time = total_processing_time;
    }
}
