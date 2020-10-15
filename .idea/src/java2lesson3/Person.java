package java2lesson3;

public class Person {

    protected String surname;


    Person(String surname){
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person" +
                " " + surname;
    }
}
