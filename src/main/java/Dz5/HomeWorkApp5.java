package Dz5;

import java.util.Scanner;
public class HomeWorkApp5<arrayDude, dudes> {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Employee[] dude = new Employee[5];
        dude[0] = new Employee("Петрович П.П","Супергерой","tutti1@.tu", 890099999, 17000, 35);
        dude[1] = new Employee("Семёныч С.С.","Суперзлодей","tutti2@.tu", 890088888, 16300, 54);
        dude[2] = new Employee("Иваныч И.И.","Суперчувак","tutti3@.tu", 890077777, 55000, 18);
        dude[3] = new Employee("Галиновна Г.Г.","Суперзвезда","tutti4@.tu", 890055555, 66000, 77);
        dude[4] = new Employee("Степановка С.С.","Суперноваязвезда","tutti5@.tu", 890011111, 12000, 15);

        for (int i = 0; i < dude.length; i++)
            if (dude[i].getAge() > 40) dude[i].print();

    }
}
