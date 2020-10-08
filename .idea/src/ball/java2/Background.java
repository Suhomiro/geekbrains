package ball.java2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Background extends JPanel{

    private final int timeBackground = 200;
      private static Color color;
    Background(){

        color = new Color((int) (Math.random() * 255),
                (int) (Math.random() * 255),
                (int) (Math.random() * 255)
        );
        setBackground(color);

    }



    }

