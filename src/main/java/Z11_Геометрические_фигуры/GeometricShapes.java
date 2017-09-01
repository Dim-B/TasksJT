package Z11_Геометрические_фигуры;

//  11) Определить иерархию геометрических фигур. Создать несколько обьектов. Отрисовать их на форме используя
//  переопределение методов при наследовании. Ввести абстрактный класс. Использовать ArrayList и туда ложить
//  все свои разные фигуры. Определить методы движения/удаления этих фигур. Ввести класс Strategy, который
//  определяет стратегию движения. Ввести игровое поле, реализовать проверку пересечения фигур с игровым полем,
//  должен присутствовать отскок, а также соударение фигур друг с другом.[5]

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GeometricShapes extends JFrame implements Runnable {

    private ArrayList<Shape> shapes = new ArrayList<>();
    public static void main(String[] args) {
        new GeometricShapes("Геометрические фигуры");
    }

    private GeometricShapes(String title) throws HeadlessException {
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(150, 100, 810, 630);
        setBackground(Color.BLACK);

        for (int i = 0; i < 20; i++) {
            shapes.add(Shape.getShape());
        }

        add(new Field(shapes));
        setResizable(false);
        setVisible(true);

        new Thread(this).start();
    }

    @Override
    public void run() {
        while (!shapes.isEmpty()) {
            for (int i = 0; i < shapes.size(); i++) {
                shapes.get(i).move();
                int yc = 285;
                int xc = 405;
                if (Math.sqrt(Math.pow((xc - shapes.get(i).getX()), 2) + Math.pow((yc - shapes.get(i).getY()), 2)) < 50) {
                    shapes.get(i).remove(shapes);
                }
            }
            repaint();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }

        }
    }
}

