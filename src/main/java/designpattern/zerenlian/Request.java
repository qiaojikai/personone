package designpattern.zerenlian;

public class Request {

    private String type;

    private String content;

    private int count;

    public Request() {
    }

    public Request(String type, String content, int count) {
        this.type = type;
        this.content = content;
        this.count = count;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}