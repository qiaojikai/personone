package designpattern.xiangyuan;

public class Location {
	private int locX;

    private int locY;

    public Location() {
    }

    public Location(int locX, int locY) {
        this.locX = locX;
        this.locY = locY;
    }

    public int getLocX() {
        return locX;
    }

    public void setLocX(int locX) {
        this.locX = locX;
    }

    public int getLocY() {
        return locY;
    }

    public void setLocY(int locY) {
        this.locY = locY;
    }


    @Override
    public String toString() {
        return "{" +
                "locX=" + locX +
                ", locY=" + locY +
                '}';
    }
}
