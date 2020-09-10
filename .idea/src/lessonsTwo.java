import java.util.Arrays;

public class lessonsTwo {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        mainNumber(arr);
        int[] arr2 = new int[8];
        inputNumber(arr2);
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        findNumber(arr3);
        int[] arr4 = {3, 5, 1, 6, 7}; // 4 задание ?????
        maxNumber(arr4);
        minNumber(arr4);
        int[][] diagonal = new int[3][3];
        for (int i = 0; i < diagonal.length; i++) {
            diagonal[i][i] = 1;
        }
        int diagonale2 = diagonal.length - 1;
        for (int j = 0; j < diagonal.length; j++) {
            diagonal[j][diagonale2 - j] = 1;
        }
        System.out.println(Arrays.deepToString(diagonal));



    }





    private static void mainNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else arr[i] = 0;
        }
    }

    private static void inputNumber(int[] arr) {
        int[] numbers = {1, 4, 7, 10, 13, 16, 19, 22};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = numbers[i];
        }
    }

    private static void findNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
    }

    private static void maxNumber(int[] arr) {
        int max = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
        }
    }

    private static void minNumber(int[] arr) {
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
    }

    private static boolean checkBalance(int[] arr) {

        for(int i = 0; i < arr.length; i++) {
            int result = arr[i] + i;
            if (arr[i] == i) {
            }
        } return true;
            } // 6 не сделал


        }




