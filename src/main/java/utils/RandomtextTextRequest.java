package utils;

import org.json.JSONObject;

/**
 * 
 * @author jfigueruela
 * @since 20160626
 */
public class RandomtextTextRequest {

    private String type;
    private Integer amount;
    private String number;
    private String number_max;
    private String format;
    private String time;
    private String text_out;

    /**
     * Constructor and parser.
     * 
     * @param {JSONObject} Json object.
     */
    public RandomtextTextRequest(JSONObject json) {
        this.type = (String) json.get("type");
        this.amount = (Integer) json.get("amount");
        this.number = (String) json.get("number");
        this.number_max = (String) json.get("number_max");
        this.format = (String) json.get("format");
        this.time = (String) json.get("time");
        this.text_out = (String) json.get("text_out");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber_max() {
        return number_max;
    }

    public void setNumber_max(String number_max) {
        this.number_max = number_max;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getText_out() {
        return text_out;
    }

    public void setText_out(String text_out) {
        this.text_out = text_out;
    }
}
