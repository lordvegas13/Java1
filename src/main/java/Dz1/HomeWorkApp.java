package Dz1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }

    public static void printThreeWords () {
        System.out.println ("Orange\n" + "Banana\n" + "Apple");
    }

    public static void checkSumSign() {
        int a = -7;
        int b = 6;
        if (a + b > 0) {
            System.out.println("чик пик! Сумма положительная");
        }
        else if (a + b < 0) {
            System.out.println("чик пик! Сумма отрицательная");
        }
    }

    public static void printColor()  {
        int value = 1000;
        if (value <= 0) {System.out.println("Красный гусь");}
        else if (value < 100) {System.out.println("Желтый гусь");}
        else if (value > 100) {System.out.println("Зеленый гусь");}
    }


    public static void compareNumbers() {
        int a = 11;
        int b = 6;
        if (a >= b) {System.out.println("a >= b");}
        else if (a < b) {System.out.println("a < b");}
    }

}
