package demo;

public class RandomtextTextResponse {
    private String freq_world;
    private Integer avg_paragraph_size;
    private Integer avg_paragraph_processing_time;
    private Integer total_processing_time;

    /**
     * Betvictor demo Text response object.
     * 
     * @param {String} freq_world - the word that was the most frequent in the
     *        paragraphs
     * @param {Integer} avg_paragraph_size - the average size of a paragraph
     * @param {Integer} avg_paragraph_processing_time - the average time spent
     *        analyzing a paragraph paragraph
     * @param {Integer} total_processing_time - total processing time to
     *        generate the final response paragraph
     */
    public RandomtextTextResponse(String freq_world,
            Integer avg_paragraph_size, Integer avg_paragraph_processing_time,
            Integer total_processing_time) {
        this.freq_world = freq_world;
        this.avg_paragraph_size = avg_paragraph_size;
        this.avg_paragraph_processing_time = avg_paragraph_processing_time;
        this.total_processing_time = total_processing_time;
    }

    public String getFreq_world() {
        return freq_world;
    }

    public void setFreq_world(String freq_world) {
        this.freq_world = freq_world;
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
