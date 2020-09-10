public class lessonsOne {
    public static void main(String[] args) {

        float result = count();
        System.out.println(result);

        boolean result2 = tryNumber();
        System.out.println(result2);

        numberFind();

        stringHello();

        //yearCount();


    }

    private static float count() {

        int a = 7;
        int b = 5;
        int c = 3;
        int d = 4;
        return a * (b + (c / d));

    } // 1 метод

    private static boolean tryNumber( ) {
        int a = 15;
        int b = 7;
        int c = 20; ////ввел еще одну переменную что бы можно было в последствии менять только ее.
        if ((a + b) <= c) {
            return true;
        } else {
            return false;
        }
    } // 2 метод

    private static void numberFind() {

        int a = 5;
        int positive = 0;
        if (a >= positive) {
            System.out.println(a + " Положительное число");
        } else System.out.println(a + " Отрицательное число");

    } // 3 метод

    private static String stringHello() {
        String name = "Артур";
        String result = "Привет " + name + "!";
        System.out.println(result);
        return (result);
    } // 4 метод

   // private static void yearCount(int year) {
     //   year = "";


    }  // 5 метод



