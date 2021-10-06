package Dz6;

public abstract class Animal {

    private String name;
    private int age;
    static String count = "Ничего нет";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(int age) {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
