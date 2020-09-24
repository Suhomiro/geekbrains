package lesson6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {




    public static void main(String[] args) {
        try {
            FileOutputStream text = new FileOutputStream("symbol.txt");
            FileOutputStream text1 = new FileOutputStream("symbol1.txt");
            FileOutputStream text2 = new FileOutputStream("symbol2.txt");
            String one = "I go to catch salmon this friday whith flyfishing";
            text.write(one.getBytes());
            text.close();
            String two = " on the river Gauja!!!";
            text1.write(two.getBytes());
            text1.close();
            String three = one + two;
            text2.write(three.getBytes());
            text2.close();
            FileInputStream in = new FileInputStream("symbol2.txt");
            String a = "Gauja";
            byte[] b = a.getBytes();
            byte[] c = new byte[(int) in.read()];
            for(int i = 0; i <= c.length; i++){
                if(b[i] == c[i]){
                    System.out.println(a);
                }
            }










        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
