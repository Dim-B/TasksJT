package Z11_Геометрические_фигуры;

import java.awt.*;

public class Pentagon extends Shape {
    public Pentagon(int x, int y) {
        super(x, y);
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.CYAN);
        g.fillPolygon(new int[]{x - 7, x + 7, x + 12, x, x - 12}, new int[]{y + 10, y + 10, y - 4, y - 12, y - 4}, 5);
    }

    @Override
    void move() {
        x++;
    }
}
