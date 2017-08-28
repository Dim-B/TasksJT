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

    public ArrayList<Shape> shapes = new ArrayList<>();

    public static void main(String[] args) {
        new GeometricShapes("Геометрические фигуры");
    }

    public GeometricShapes(String title) throws HeadlessException {
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(200, 100, 815, 635);
        setBackground(Color.BLACK);

        shapes.add(new Circle(100, 100));
        shapes.add(new Square(200, 100));
        shapes.add(new Triangle(100, 200));
        shapes.add(new Pentagon(200, 200));

        add(new Field(shapes));
        setResizable(false);
        setVisible(true);

        new Thread(this).start();
    }


    @Override
    public void run() {
        while (true) {
            for (Shape s : shapes) {
                s.move();
            }
            repaint();
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){
            }

        }
    }
}

