package ball.java2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MainCircles extends JFrame {
    // Координаты поля
    private static final int POS_X = 400;
    private static final int POS_Y = 200;
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 600;
    // Колл. шариков
    Sprite[] sprites = new Sprite[10];
    Sprite[] newSprites = new Sprite[5];




    public static void main(String[] args) {
        // Контроллер который коректно вызывает конструктор окна MainCircles ( пока не очень понятно для чего так нужно)
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainCircles();
            }
        });
    }
    // Конструктор отрисовки окна
    private MainCircles() {
        // Закрытие окна и выход
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // Размер
        setBounds(POS_X, POS_Y, WINDOW_WIDTH, WINDOW_HEIGHT);

        // Создание обьекта из конструктора GameCanvas ( поле для рисование)
        GameCanvas canvas = new GameCanvas(this);
        // Добавление в окно
        add(canvas);
        // Вызов метода в окне созданных мячиков
        initApplication();
        addNewBall(canvas);
        // Имя окна
        setTitle("Circles");
        // Видимость окна
        setVisible(true);


    }

    // Метод создание мячиков из массива
    private void initApplication() {
        for (int i = 0; i < sprites.length; i++) {
            sprites[i] = new Ball();

        }
    }
    // Метод отрисвоки нашей панели GameCanvas примая аргументы время отрисовки, графику, панель GameCanvas
    public void onDrawFrame(GameCanvas canvas, Graphics g, float deltaTime) {

        update(canvas, deltaTime);
        render(canvas, g);
    }
    // Метод обновление  принимая в аргумент панель, и текущее время
    private void update(GameCanvas canvas, float deltaTime) {
        // Обновление мячиков на панели с временем обновления
        for (int i = 0; i < sprites.length; i++) {
            sprites[i].update(canvas, deltaTime);
        }
            for (int i = 0; i < newSprites.length; i++) {
                newSprites[i].update(canvas, deltaTime);
            }

    }
    // Метод отрисовки  принимая в аргумент панель и графику
    private void render(GameCanvas canvas, Graphics g) {
        // Отрисовка мячей
        for (int i = 0; i < sprites.length; i++) {
            sprites[i].render(canvas, g);
        }
        for (int i = 0; i < newSprites.length;i++){
            newSprites[i].render(canvas,g);
        }
    }
    private void addNewBall(GameCanvas canvas) {

            canvas.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {

                    for (int i = 0; i < newSprites.length; i++) {
                        newSprites[i] = new Ball();
                        repaint();
                    }

                }




                @Override
                public void mousePressed(MouseEvent e) {
                }

                @Override
                public void mouseReleased(MouseEvent e) {

                }

                @Override
                public void mouseEntered(MouseEvent e) {
                }

                @Override
                public void mouseExited(MouseEvent e) {

                }
            });


    }
}
