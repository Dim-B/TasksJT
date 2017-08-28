package Z11_Геометрические_фигуры;

import javax.swing.*;
import java.awt.*;

public abstract class Shape extends JComponent {
    int x;
    int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    protected abstract void paintComponent(Graphics g);

    abstract void move();
}
