package ball.java2;

import javax.swing.*;
import java.awt.*;

public class GameCanvas extends Background {

    // Переменная принимающая MainCircles для передачи информации что GsmeCanvas отрисовалась
    private MainCircles controller;
    // Переменная , время отрисовки нашей панели GameCanvas
    long lastFrameTime;
    // Переменная кадров в секунду, которая будет задерживать кадры на 17 милисекунд
    private static final int FPS_SLEEP_TIME = 17;
    // Конструктор панели GameCanvas, берущий в аргумент информацию от переменой констуктора MainCircles


    GameCanvas(MainCircles controller) {
        this.controller = controller;
        // Устанавливаем время отрисовки в нановремя
        lastFrameTime = System.nanoTime();




    }

    // Что бы рисовать нужно переопределить метод paintComponent!
    @Override
    protected void paintComponent(Graphics g) { // while (true) бесконечный цикл перерисовки
        super.paintComponent(g);
        // Переменная текущего времени
        long currentTime = System.nanoTime();
        // Узнаем время отрисовки в переменной
        float deltaTime = (currentTime - lastFrameTime) * 0.000000001f;
        // Передает отрисовки информацию что отрисовался беря в аргумент графику, и время отрисовки
        controller.onDrawFrame(this, g, deltaTime);
        lastFrameTime = currentTime;
        // Принуждаем кадр панели показывать каждые 17 милисекунд ( так и не понял эту контрукцию )
        try {
            Thread.sleep(FPS_SLEEP_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // метод перерисовки
        repaint();                              // }
    }

    public int getLeft() { return 0; }
    public int getRight() { return getWidth() - 1; }
    public int getTop() { return 0; }
    public int getBottom() { return getHeight() - 1; }

}
