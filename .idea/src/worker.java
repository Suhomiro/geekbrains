public class worker {
    String name;
    int salary;
    int age;
    int id;


    public  int getID(){
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setName() {
        this.name = name;
    }

    public void setAge() {
        this.age = age;
    }

    worker(String name, int salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.id = idNumber();
    }


    public int idNumber() {
        worker[] arr = new worker[5];
        id = 00000;
        for (int i = 0; i < arr.length; i++) {
            id = id + i;
        } id++;
        return id;                         // Думал сдесь присвоить как то сразу ИД номер но не вышло!
    }
}






