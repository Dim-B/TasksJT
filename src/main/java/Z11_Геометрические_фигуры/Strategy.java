package Z11_Геометрические_фигуры;

import java.util.Random;

public class Strategy {

    Random random = new Random();
    private double dropSpeed = random.nextDouble() + 0.1;
    private double angleSpeed = random.nextDouble() + 0.1;
    private double x;
    private double y;

    public Strategy(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void calculateNextPoint() {
        int xc = 405;
        int yc = 285;
        double radius = Math.sqrt(Math.pow((xc - x), 2) + Math.pow((yc - y), 2));
        radius -= dropSpeed;
        double angle = Math.atan2(y - yc, x - xc) / Math.PI * 180;
        angle = (angle < 0) ? angle + 360 : angle;
        angle -= angleSpeed;
        x = (xc + radius * Math.cos(Math.toRadians(angle)));
        y = (yc + radius * Math.sin(Math.toRadians(angle)));
    }

    public int getNextX() {
        return (int) x;
    }

    public int getNextY() {
        return (int) y;
    }
}
