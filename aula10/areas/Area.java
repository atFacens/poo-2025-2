package areas;

public class Area {
    private int maxX, maxY;

    public Area(int maxX, int maxY) {
        if (maxX > 10 && maxY > 10) {
            this.maxX = maxX;
            this.maxY = maxY;
        } else {
            maxX = 100;
            maxY = 100;
        }
    }

    public int getMaxX() {
        return maxX;
    }

    public int getMaxY() {
        return maxY;
    }

}
