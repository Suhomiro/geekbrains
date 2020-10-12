package java2lesson2;

import java.util.Arrays;

public class Main {

     static String string = "10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0";
     static String[][] stringArr;


    private static String[][] stringArray(String arr) throws RuntimeException {
        String[] arrayFirst = arr.split("\n");
         stringArr = new String[arrayFirst.length][arrayFirst.length];

        for (int i = 0; i < arrayFirst.length; i++) {
            String[] simple = arrayFirst[i].split(" ");
            try {
                for (int j = 0; j < simple.length; j++) {
                    stringArr[i][j] = simple[j];
                }
            }catch (IndexOutOfBoundsException e){
                if(stringArr.length > 4);
                System.out.println("Index of arrays is to long");
            }
        }return stringArr;
    }
    private static int stringToInt(String[][] arr)  {
        int[][] integerArr = new int[arr.length][arr.length];
        int result = 0;
        int reverse = 2;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                try {
                    integerArr[i][j] = Integer.valueOf(arr[i][j]);
                }catch (NumberFormatException e){
                    System.out.println("Array index have symbol");
                }
                    result = result + integerArr[i][j];
            }

        }return result / reverse;
    }

    public static void main(String[] args) {
        try {
            System.out.println(Arrays.deepToString(stringArray(string)));
            System.out.println(stringToInt(stringArr));
        } catch (RuntimeException e){
            System.out.println("Somthing go wrong");
        }
        }
    }
