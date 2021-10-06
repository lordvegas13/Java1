package Dz6;

public class CAT extends Animal implements Run, Swim {

    public CAT(String name, int age) {
       this.setName(name);
       this.setAge(age);
       System.out.println(count = "Кот родился, назвали - " + getName());
    }

    public CAT(String name) {
        this.setName(name);
        this.setAge(0);
        System.out.println(count = "Кот родился, назвали - " + getName());
    }
    private final int MAX_Run = 200;
    private final int MAX_Swim = 0;

    @Override
    public void run(int m) {
        if ((m >= 0) && (m <= MAX_Run))
                System.out.println(getName() + " " + "пробежел зачем-то киллометров " + m);
        else
        System.out.println(getName() + " " + "устал бежать на 20 мерах и пошёл домой. Пока!");
    }

    @Override
    public void swim(int m) {
        if (m != MAX_Swim)
                System.out.println(getName() + " " + "умер, т.к. не умеет плавать");

    }
}
