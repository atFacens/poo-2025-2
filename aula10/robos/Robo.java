package robos;

import areas.Area;

public abstract class Robo {
    private int posX, posY;
    private Area area;

    public Robo(Area area) {
        this.area = area;
    }

    public Robo(Area area, int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
        this.area = area;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public Area getArea() {
        return area;
    }

    public abstract boolean moverNorte(int deslocamento);
    public abstract boolean moverSul(int deslocamento);
    public abstract boolean moverLeste(int deslocamento);
    public abstract boolean moverOeste(int deslocamento);
}
