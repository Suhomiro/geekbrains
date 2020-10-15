package java2lesson3;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    private static String text = "Наша компания поехала ловить форель на реку Пэдедзе, мы проезжали мимо реку Гауя, а также притоки реки Гауя где живет форель";


    public static String replaceSymbol(String string){
        String text = string.replaceAll(",","");
        return text;
    }




    public static void main(String[] args){
        String listText = replaceSymbol(text);

        ArrayList<String> list = new ArrayList<>(Arrays.asList(listText.split(" ")));
        System.out.println(list.toString());

        LinkedHashSet<String> set = new LinkedHashSet<>(Arrays.asList(listText.split(" ")));
        System.out.println(set);

        Map<Integer,List <String>> map = new HashMap<>();

        System.out.println(map.toString());



        PhoneBook book0 = new PhoneBook("sergejs@gmail.com", "22222222");
        PhoneBook book1 = new PhoneBook("arturs@gmail.com", "1111111111");
        PhoneBook book2 = new PhoneBook("anatolijs@gmail.com", "333333333");

        Map<Person, List<PhoneBook>> mapData = new LinkedHashMap<>();
        mapData.put(new Person("Alonso"),Arrays.asList(book0));
        mapData.put(new Person("Suhomiro"), Arrays.asList(book1));
        mapData.put(new Person("Riccardo"), Arrays.asList(book2));

        for(Map.Entry<Person, List<PhoneBook>> e : mapData.entrySet()) {
            System.out.println(e.getKey());
        }


           }



    }

