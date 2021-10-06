package Dz6;

public class Main {
    public static void main(String[] args) {

        DOG dog = new DOG("Жучара", 5);
        dog.run(50);
        dog.swim(3);

        CAT cat = new CAT("Мурчало", 9);
        System.out.println("Введите дистанцию для плавания:");
        cat.run(15);
        cat.swim(0);




    }
}
