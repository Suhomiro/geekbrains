import java.util.Random;
import java.util.Scanner;

public class TicTacTo {
    // существительные ( переменные )
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = 'O';
    private static final char DOT_HUMAN1 = 'Z';
    private static final char DOT_AI1 = 'S';
    private static final char DOT_EMPTY = '.';
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();
    private static char[][] field;
    private static int fieldSizeX;
    private static int fieldSizeY;

    //init field
    //поле
    private static void initField() {
        fieldSizeY = 5;
        fieldSizeX = 5;
        field = new char[fieldSizeY][fieldSizeX];
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                field[y][x] = DOT_EMPTY;
            }
        }
    }

    // printField
    // дизайн поля
    private static void printField() {
        System.out.print("+");
        for (int i = 0; i < fieldSizeX * 2 + 1; i++)
            System.out.print((i % 2 == 0) ? "-" : i / 2 + 1);
        System.out.println();

        for (int i = 0; i < fieldSizeY; i++) {
            System.out.print(i + 1 + "|");
            for (int j = 0; j < fieldSizeX; j++)
                System.out.print(field[i][j] + "|");
            System.out.println();
        }

        for (int i = 0; i <= fieldSizeX * 2 + 1; i++)
            System.out.print("-");
        System.out.println();
    }

    // humanTurn
    // пользавателя ход
    private static void humanTurn() {
        int x;
        int y;
        do {
            System.out.print("Введите число от 1 до 5 через пробел что бы сделать ход 'X' >>> ");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isCellValid(x, y) || !isCellEmpty(x, y));
        field[y][x] = DOT_HUMAN;
    }
    // метод для второго хода пользавателя второй фишкой
    private static void humanTurn1() {
        int x;
        int y;
        do {
            System.out.print("Введите число от 1 до 5 через пробел что бы сделать ход 'Z' >>> ");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isCellValid(x, y) || !isCellEmpty(x, y));
        field[y][x] = DOT_HUMAN1;
    }
    //  проверка на пустую ячейку
    private static boolean isCellEmpty(int x, int y) {
        return field[y][x] == DOT_EMPTY;
    }

    // проверка на занятую ячеку
    private static boolean isCellValid(int x, int y) {
        return x >= 0 && x < fieldSizeX && y >= 0 && y < fieldSizeY;
    }

    // aiTurn
    // компа ход
    private static void aiTurn() {
        int x;
        int y;

        do {
            x = RANDOM.nextInt(fieldSizeX);
            y = RANDOM.nextInt(fieldSizeY);
        } while (!isCellEmpty(x, y));
        field[y][x] = DOT_AI;
    }
    // метод на ход второй фишкой компа
    private static void aiTurn1() {
        int x;
        int y;

        do {
            x = RANDOM.nextInt(fieldSizeX);
            y = RANDOM.nextInt(fieldSizeY);
        } while (!isCellEmpty(x, y));
        field[y][x] = DOT_AI1;
    }

    // checkWin
    // переделать метод !!! не справился но пытался
    private static boolean checkWin(char check) {
        int count = 1;

        for (int i = 0; i < field.length; i++) {
            for(int j = 0; j < field.length; j++){
                if(field[i][j] == check);
                count++;
            }

        }
        for(int i = 0; i < field.length; i++){
            for (int j = 0; j < field.length; j++){
                if(field[j][i] == check);
                count++;

            }

        }
        for (int i = 0; i < field.length; i++){
            if(field[i][i] == check);
            count++;

        }
        for(int i = 0; i < field.length; i++){
            if(field[i][field.length - i -1] == check);
            count++;
        }

        if(count == check); return true;


    }

    //checkDraw
    // проверка на нич.
    private static boolean checkDraw () {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (isCellEmpty(x, y)) return false;
            }
        }
        return true;
    }

    // cтарт
    public static void main (String[]args){
        while (true) {

            initField();
            printField();
            while (true) {
                humanTurn();
                printField();
                if (gameChecks(DOT_HUMAN, "Human win")) break;
                aiTurn();
                printField();
                if (gameChecks(DOT_AI, "Computer win")) break;
                humanTurn1();
                printField();
                if (gameChecks(DOT_HUMAN1, "Human win")) break;
                aiTurn1();
                printField();
                if (gameChecks(DOT_AI1, "Computer win")) break;
            }
            System.out.println("Play again?");
            if (!SCANNER.next().equals("Y"))
                break;
        }
    }
    // метод вывода в консоль кто выйграл
    private static boolean gameChecks ( char dot, String s){
        if (checkWin(dot)) {
            System.out.println(s);
            return true;
        }
        if (checkDraw()) {
            System.out.println("draw!");
            return true;
        }
        return false;
    }
}
