package demo;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "RandomTextResult")
public class RandomTextResult {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private java.util.Date date;
    /*
     * The word that was the most frequent in the paragraphs
     */
    private String         freq_word;
    /*
     * The average size of a paragraph
     */
    private Integer        avg_paragraph_size;
    /*
     * The average time spent analyzing a paragraph
     */
    private long           avg_paragraph_processing_time;
    /*
     * Total processing time to generate the final response
     */
    private long           total_processing_time;

    public RandomTextResult() {
        // TODO Auto-generated constructor stub
    }

    public RandomTextResult(String freq_word, Integer avg_paragraph_size, long avg_paragraph_processing_time,
            long total_processing_time) {
        super();
        this.date = new Date();
        this.freq_word = freq_word;
        this.avg_paragraph_size = avg_paragraph_size;
        this.avg_paragraph_processing_time = avg_paragraph_processing_time;
        this.total_processing_time = total_processing_time;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public long getAvg_paragraph_processing_time() {
        return avg_paragraph_processing_time;
    }

    public void setAvg_paragraph_processing_time(long avg_paragraph_processing_time) {
        this.avg_paragraph_processing_time = avg_paragraph_processing_time;
    }

    public long getTotal_processing_time() {
        return total_processing_time;
    }

    public void setTotal_processing_time(long total_processing_time) {
        this.total_processing_time = total_processing_time;
    }

    public java.util.Date getDate() {
        return date;
    }

    public void setDate(java.util.Date date) {
        this.date = date;
    }

}
