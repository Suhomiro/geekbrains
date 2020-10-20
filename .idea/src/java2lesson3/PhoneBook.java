package java2lesson3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook extends HashMap {

    String phoneNumber;
    String eMail;

    PhoneBook(String eMail, String phoneNumber) {
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return
                "phoneNumber " + phoneNumber +
                        ", eMail " + eMail + "\n";
    }

   // public void hashMap(Map<Class, List<Class>> mapData) { Не могу понять как хешмап использовать в классе!!!


    }


