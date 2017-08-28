package Z11_Геометрические_фигуры;

import java.awt.*;

public class Circle extends Shape {
    public Circle(int x, int y) {
        super(x, y);
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(getX() - 10, getY() - 10, 20, 20);
    }

    @Override
    void move() {
        x = Strategy.getX(x, y);
        y = Strategy.getY(x, y);
    }
}
