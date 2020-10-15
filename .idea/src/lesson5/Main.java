package lesson5;

public class Main {
    public static void main(String[] args){
        Cat A = new Cat("Кот Рыжик", 2, 200);
        Cat A1 = new Cat("Кот Барсик", 3,300);
        Dog B = new Dog("Cобака Долматиниц", 1.5F, 500, 10);
        Dog B1 = new Dog("Собака Лабрадор", 2.5F, 600, 15);

        A.Run(150);
        A1.Run(290);
        A.Jumps(1.9F);
        A1.Jumps(2.7F);
        B.Run(480);
        B1.Run(570);
        B.Jumps(1.3F);
        B1.Jumps(2.4F);
        B.Swim(8);
        B1.Swim(13);
    }
}
