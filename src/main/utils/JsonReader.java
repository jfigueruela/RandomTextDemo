package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;

import org.apache.log4j.Logger;
import org.json.JSONObject;

public class JsonReader {
    private static final Logger logger = Logger.getLogger(JsonReader.class);

    public static JSONObject readJsonFromUrl(String url) throws IOException {
        JSONObject result = null;
        URL inputUrl = new URL(url);
        URLConnection yc = inputUrl.openConnection();
        yc.addRequestProperty("User-Agent",
                "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0)");
        yc.connect();
        BufferedReader in = new BufferedReader(new InputStreamReader(
                yc.getInputStream()));
        String jsonText = readAll(in);
        result = new JSONObject(jsonText);
        in.close();
        return result;

    }

    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        logger.info(String.format("Obtained string: %s", sb.toString()));
        return sb.toString();
    }
}
