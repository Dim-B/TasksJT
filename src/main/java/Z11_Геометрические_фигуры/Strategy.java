package Z11_Геометрические_фигуры;

public class Strategy {

    public static int getX(int x, int y) {
        int xc = 400;
        int yc = 300;
        double radius = Math.sqrt((xc - x) * (xc - x) + (yc - y) * (yc - y));
        double angle = Math.atan2(yc - y, xc - x);
        return x + (int) (radius * Math.cos(angle));
    }

    public static int getY(int x, int y) {
        int xc = 400;
        int yc = 300;
        double radius = Math.sqrt((xc - x) * (xc - x) + (yc - y) * (yc - y));
        double angle = Math.atan2(yc - y, xc - x);
        return y + (int) (radius * Math.sin(angle));
    }
}
