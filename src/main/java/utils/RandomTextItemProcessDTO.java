package utils;

@Deprecated
public class RandomTextItemProcessDTO {
    private RandomtextTextRequest randomtextTextRequest;
    private long                  processTime;

    public RandomTextItemProcessDTO(RandomtextTextRequest randomtextTextRequest, long processTime) {
        this.randomtextTextRequest = randomtextTextRequest;
        this.processTime = processTime;
    }

    public RandomtextTextRequest getRandomtextTextRequest() {
        return randomtextTextRequest;
    }

    public long getProcessTime() {
        return processTime;
    }

}
