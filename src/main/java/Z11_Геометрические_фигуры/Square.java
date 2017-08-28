package Z11_Геометрические_фигуры;

import java.awt.*;

public class Square extends Shape {
    public Square(int x, int y) {
        super(x, y);
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillRect(getX() - 10, getY() - 10, 20, 20);
    }

    @Override
    void move() {
        x++;
    }
}
