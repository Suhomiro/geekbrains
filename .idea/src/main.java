import com.sun.jmx.snmp.internal.SnmpAccessControlModel;

import java.util.Arrays;

public class main {

    public static void main(String[] args) {

        worker job = new worker("Arturs Suhomiro", 3000, 26);



        worker[] arrData = new worker[5];
        arrData[0]=new worker("Arturs Suhomiro",3000,26);
        arrData[1]=new worker("Aleksandr Puskin",5000,38);
        arrData[2]=new worker("Oleg Ivanov",2000,43);
        arrData[3]=new worker("Stepan Ivanov",1000,46);
        arrData[4]=new worker("Sergej Petrov",1500,23);

        bonusSalary(arrData);

        int middleSalary = 0;
        int middleAge = 0;
        for(int i = 0; i < arrData.length; i++){
            if (arrData[i].age > 40){
                System.out.println(arrData[i].getName() + " " + arrData[i].getAge() + " " + arrData[i].getID());
            }
            middleSalary = middleSalary + arrData[i].getSalary();
            middleAge = middleAge + arrData[i].getAge();
        }
        System.out.println("MIDDLE AGE>> " + middleAge / arrData.length + " " + "MIDDLE SALARY>> " + middleSalary / arrData.length);

    }

    private static void bonusSalary(worker[] arr){
        for(int i = 0; i < arr.length; i++){
            if (arr[i].age > 45){
                int bonus = arr[i].salary + 500;
                System.out.print(bonus);
                System.out.println(" " + arr[i].getName());
            }
        }
    }
}
