package Z11_Геометрические_фигуры;

import java.awt.*;

public class Triangle extends Shape {
    public Triangle(int x, int y) {
        super(x, y);
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillPolygon(new int[]{x - 10, x + 10, x}, new int[]{y + 10, y + 10, y - 10}, 3);
    }

}
