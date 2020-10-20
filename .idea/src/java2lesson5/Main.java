package java2lesson5;

import java.util.Arrays;

public class Main extends Thread {

    static final int size = 10000000;
    static final int h = size / 2;
    private static float[] array = new float[size];

    public static void method1 (float[] arr){
        long start = System.currentTimeMillis();
        for(int i = 0; i < arr.length; i++){
        arr[i] = 1;
        arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long stop = System.currentTimeMillis();
        System.out.println("Massive initialization " + (stop - start) + " sec");
    }

    public static void method2 (float[] arr){
        long start = System.currentTimeMillis();
        float[] arr1 = new float[h];
        float[] arr2 = new float[h];
        System.arraycopy(arr,0,arr1,0, h );
        System.arraycopy(arr, h, arr2, 0, h);

        Main thread1 = new Main();
        thread1.start();

        for(int i = 0; i < arr1.length; i++){
            arr1[i] = 1;
            arr1[i] = (float)(arr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        thread1.interrupt();

        Main thread2 = new Main();
        thread2.start();
        for(int i = 0; i < arr1.length; i++){
            arr2[i] = 1;
            arr2[i] = (float)(arr2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        thread2.interrupt();
        System.arraycopy(arr1, 0, arr, 0, h);
        System.arraycopy(arr2, 0, arr, h, h);
        long stop = System.currentTimeMillis();
        System.out.println("Massive initialization with thread " + (stop - start) + " sec");
    }



    public static void main(String[] args) {
        method1(array);
        method2(array);

}
}