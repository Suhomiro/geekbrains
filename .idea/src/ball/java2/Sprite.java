package ball.java2;

import java.awt.*;

public class Sprite {
    // Переменные координат шариков в верхним левом углу для их отрисовки
    protected float x;
    protected float y;
    protected float halfWidth;
    protected float halfHeight;
    // Левая координата
    protected float getLeft() {
        return x - halfWidth;
    }
    protected void setLeft(float left) {
        x = left + halfWidth;
    }
    // Правая координата
    protected float getRight() {
        return x + halfWidth;
    }
    protected void setRight(float right) {
        x = right - halfWidth;
    }
    // Верхняя координата
    protected float getTop() {
        return y - halfHeight;
    }
    protected void setTop(float top) {
        y = top + halfHeight;
    }
    // Нижняя координата
    protected float getBottom() {
        return y + halfHeight;
    }
    protected void setBottom(float bottom) {
        y = bottom - halfHeight;
    }
    // Размер
    protected float getWidth() {
        return 2f * halfWidth;
    }
    protected float getHeight() {
        return 2f * halfHeight;
    }
    // Обновление обьекта
    void update(GameCanvas canvas, float deltaTime) {}
    // Отрисовывание
    void render(GameCanvas canvas, Graphics g) {}

}