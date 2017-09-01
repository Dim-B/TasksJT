package Z11_Геометрические_фигуры;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

abstract class Shape extends JComponent {
    int x;
    int y;

    private Strategy strategy;

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    Shape(int x, int y) {
        this.x = x;
        this.y = y;
        strategy = new Strategy(x, y);
    }

    protected abstract void paintComponent(Graphics g);

    void move() {
        strategy.calculateNextPoint();
        x = strategy.getNextX();
        y = strategy.getNextY();
    }

    public void remove(ArrayList<Shape> shapes) {
        shapes.remove(this);
    }

    static Shape getShape() {
        Random random = new Random();
        switch (random.nextInt(4)) {
            case 0:
                return new Circle(random.nextInt(500) + 100, random.nextInt(600) + 15);
            case 1:
                return new Square(random.nextInt(500) + 200, random.nextInt(600) + 15);
            case 2:
                return new Triangle(random.nextInt(500) + 200, random.nextInt(600) + 15);
            default:
                return new Pentagon(random.nextInt(500) + 200, random.nextInt(600) + 15);
        }
    }

}
