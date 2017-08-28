package Z11_Геометрические_фигуры;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Field extends JPanel {

    ArrayList<Shape> shapes;

    public Field(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    @Override
    public void paintComponent(Graphics g) {
        Image im = null;
        try {
            im = ImageIO.read(new File("src/main/resources/blackHole.jpg"));
        } catch (IOException e) {}
        g.drawImage(im, 0, 0, null);
        for (Shape s : shapes) {
            s.paintComponent(g);
        }
    }
}
