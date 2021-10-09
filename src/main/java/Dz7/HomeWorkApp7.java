package Dz7;

public class HomeWorkApp7 {
    public static void main(String[] args) {
        CAT[] cats = {new CAT("Рыжик", 5),
                      new CAT("Мурка", 5),
                      new CAT("Рулька", 5),
                      new CAT("Сосиска", 5),
                      new CAT("Редиска", 5)
        };

        PLATE plate = new PLATE(100);

        for (CAT cat : cats){
            cat.eat(plate);
            cat.info();
        }
    }

}
