package robos;

import areas.Area;

public class RoboSimples extends Robo {

    public RoboSimples(Area area) {
        super(area);
    }

    public RoboSimples(Area area, int posX, int posY) {
        super(area, posX, posY);
    }

    public boolean isValidPosX(int posX) {
        return (posX >= 0 && posX <= getArea().getMaxX());
    }

    public boolean isValidPosY(int posY) {
        return (posY >= 0 && posY <= getArea().getMaxY());
    }

    @Override
    public boolean moverNorte(int deslocamento) {
        throw new UnsupportedOperationException("Unimplemented method 'moverNorte'");
    }

    @Override
    public boolean moverSul(int deslocamento) {
        throw new UnsupportedOperationException("Unimplemented method 'moverSul'");
    }

    @Override
    public boolean moverLeste(int deslocamento) {
        throw new UnsupportedOperationException("Unimplemented method 'moverLeste'");
    }

    @Override
    public boolean moverOeste(int deslocamento) {
        throw new UnsupportedOperationException("Unimplemented method 'moverOeste'");
    }

}
