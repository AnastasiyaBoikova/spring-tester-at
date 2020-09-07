package word.model;

public class WordCount {

    private String request ;

    public WordCount(String request) {
        this.request = request;
    }

    public String getRequest() {
        return request;
    }

    @Override
    public String toString() {
        return "WordCount{"
                + request + '\'' +
                '}';
    }
}
