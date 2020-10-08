package ball.java2;

import java.awt.*;
// Класс аследник родитяля класса Sprite
class Ball extends Sprite {
    // Переменные цвета и и скорости
    private final Color color;
    private float vX;
    private float vY;
    // Конструктор который задает случайные размеры и цвета мячиков
    Ball() {
        halfHeight = 20 + (float) (Math.random() * 50f);
        halfWidth = halfHeight;
        color = new Color(
                (int) (Math.random() * 255), // R
                (int) (Math.random() * 255), // G
                (int) (Math.random() * 255)  // B
        );
        // Скорость мячей
        vX = (float) (100f + (Math.random() * 200f));
        vY = (float) (100f + (Math.random() * 200f));
    }
    //
    @Override
    void update(GameCanvas canvas, float deltaTime) {
        // Растояние шариков куда они летят
        x += vX * deltaTime;//S = vt;
        y += vY * deltaTime;
        // Логика изменения координат шариков
        if (getLeft() < canvas.getLeft()) {
            setLeft(canvas.getLeft());
            vX = -vX;
        }
        if (getRight() > canvas.getRight()) {
            setRight(canvas.getRight());
            vX = -vX;
        }
        if (getTop() < canvas.getTop()) {
            setTop(canvas.getTop());
            vY = -vY;
        }
        if (getBottom() > canvas.getBottom()) {
            setBottom(canvas.getBottom());
            vY = -vY;
        }
    }
    // Рисуем мячик
    @Override
    void render(GameCanvas canvas, Graphics g) {
        g.setColor(color);
        g.fillOval((int) getLeft(), (int) getTop(),
                (int) getWidth(), (int) getHeight()
        );
    }
}