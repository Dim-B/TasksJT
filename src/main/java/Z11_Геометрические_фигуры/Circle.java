package Z11_Геометрические_фигуры;

import java.awt.*;

public class Circle extends Shape {
    public Circle(int x, int y) {
        super(x, y);
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillOval(x - 10, y - 10, 20, 20);
    }

}
