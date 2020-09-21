package lesson5;

public class Animal {
    float Jumps;
    float Run;
    String Name;
    float Swim;

    public Animal(String Name, float Jumps, float Run) {
        this.Name = Name;
        this.Jumps = Jumps;
        this.Run = Run;
    }

    public Animal(String Name, float Jumps, float Run, float Swim) {
        this.Name = Name;
        this.Jumps = Jumps;
        this.Run = Run;
        this.Swim = Swim;
    }


    void Jumps(float Height) {
        if (Height <= Jumps) {
            System.out.println(Name + " прыгает на высоту " + Height + "m");
        } else System.out.println(Name + " не может так высоко прыгать");
    }



    void Run(float Distance) {
        if (Distance <= Run) {
            System.out.println(Name + " пробежит " + Distance + "m");
        } else System.out.println(Name + " не может так далеко бежать");
    }

    void Swim(float Distance) {
        if (Distance <= Swim) {
            System.out.println(Name + " проплывет " + Distance + "m");
        } else System.out.println(Name + " не может так далеко плыть");

    }
}





