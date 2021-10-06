package Dz6;

public class DOG extends Animal implements Run, Swim{

    public DOG(String name, int age) {
        this.setName(name);
        this.setAge(age);
        System.out.println(count = "Пёс родился, назвали - " + getName());
    }

    public DOG(String name) {
        this.setName(name);
        this.setAge(0);
        System.out.println(count = "Пёс родился, назвали - " + getName());
    }
    private final int MAX_Run = 500;
    private final int MAX_Swim = 10;

    @Override
    public void run(int m) {
        if ((m >= 0) && (m <= MAX_Run))
            System.out.println(getName() + " " + "пробежел зачем-то киллометров " + m);
        else System.out.println(getName() + " " + "устал бежать на 500 мерах и пошёл домой. Пока!");

    }
    @Override
    public void swim(int m) {
        if ((m >= 0) && (m <= MAX_Swim))
            System.out.println(getName() + " " + "проплыл где-то киллометров " + m);
        if (m > MAX_Swim)
            System.out.println(getName() + " " + "устал плыть и пошёл домой. Пока!");
    }



}
