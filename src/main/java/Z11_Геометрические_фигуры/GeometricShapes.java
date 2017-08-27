package Z11_Геометрические_фигуры;

//  11) Определить иерархию геометрических фигур. Создать несколько обьектов. Отрисовать их на форме используя
//  переопределение методов при наследовании. Ввести абстрактный класс. Использовать ArrayList и туда ложить
//  все свои разные фигуры. Определить методы движения/удаления этих фигур. Ввести класс Strategy, который
//  определяет стратегию движения. Ввести игровое поле, реализовать проверку пересечения фигур с игровым полем,
//  должен присутствовать отскок, а также соударение фигур друг с другом.[5]

import javax.swing.*;
import java.awt.*;

public class GeometricShapes extends JFrame {
    public static void main(String[] args) {
        new GeometricShapes("Геометрические фигуры");
    }

    public GeometricShapes(String title) throws HeadlessException {
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(300, 200, 700, 500);
        setBackground(Color.BLACK);
        Field field = new Field();
        add(field);
        setResizable(false);
        setVisible(true);
    }


}

class Field extends JPanel {
    @Override
    public void paint(Graphics g) {

        g.setColor(Color.ORANGE);
        g.fillRect(50, 50, 20, 20);

        g.setColor(Color.red);
        g.fillOval(100, 150, 20, 20);

        g.setColor(Color.green);
    }
}

abstract class Shape extends JPanel {
    int x;
    int y;
    Color color;
    int speed;

    public Shape(int x, int y, Color color, int speed) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.speed = speed;
    }
}
