package Dz4;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp4 {
// X O

    static String[][] field;    //инициализация игрового поля, хранит пустоту

    public static void main(String[] args) {
        initField();
        showField();

        while (!isFinishedGame()) {
            movePlayer();
            showField();
            movePC();
            showField();
        }
    }

    public static void initField() {
        field = new String[3][3];            //инициализируем поле
        for (int i = 0; i < field.length; i++)
            for (int j = 0; j < field[0].length; j++)
                field[i][j] = ".";
    }

    public static void showField() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void movePlayer() {                 // движение игрока

        Scanner sc = new Scanner(System.in);          // создание сканера принимающего вводные данные с клавы

        boolean isNotFinishedMove = true;             // создание переменной isNotFinishedMove, подразумевает закончился ход или нет

        try {
            while (isNotFinishedMove) {
                System.out.print("Выберите строку и столбец куда нужно ходить:");
                int x = sc.nextInt() - 1;                                        // ввод данныех в консоль
                int y = sc.nextInt() - 1;                                        // ввод данныех в консоль
                if (x >= 0 && x < field.length && y >= 0 && y < field.length) {      // первая проверка, не выбрали ли мы плохие данныые
                    if (!field[x][y].equals("X") && !field[x][y].equals("O")) {      // дополнительная проверка на то сходил ли туда ПС или сам игрок
                        field[x][y] = "X";
                        isNotFinishedMove = false;
                    } else {
                        System.out.println("Тут уже сделан ход");
                        return;
                    }
                } else {
                    System.out.println("Вы ушли за пределы поля");
                }
            }
        } catch (Exception e) {
            System.out.println("Вы ввели неправильные данные");
        }

    }


    public static boolean isFinishedGame() {

        int countFreeSpace = 0;

        for (String[] arr : field)
            for (String elem : arr)
                if (elem.equals("."))
                    countFreeSpace += 1;

        if ((field[0][0].equals("X") && field[0][1].equals("X") && field[0][2].equals("X"))
                || (field[1][0].equals("X") && field[1][1].equals("X") && field[1][2].equals("X"))
                || (field[2][0].equals("X") && field[2][1].equals("X") && field[2][2].equals("X"))
                || (field[0][0].equals("X") && field[1][0].equals("X") && field[2][0].equals("X"))
                || (field[0][1].equals("X") && field[1][1].equals("X") && field[2][1].equals("X"))
                || (field[0][2].equals("X") && field[1][2].equals("X") && field[2][2].equals("X"))
                || (field[0][0].equals("X") && field[1][1].equals("X") && field[2][2].equals("X"))
                || (field[0][2].equals("X") && field[1][1].equals("X") && field[2][0].equals("X"))
        ) {
            System.out.println("Игрок победил");
            return true;
        } else if ((field[0][0].equals("O") && field[0][1].equals("O") && field[0][2].equals("O"))
                || (field[1][0].equals("O") && field[1][1].equals("O") && field[1][2].equals("O"))
                || (field[2][0].equals("O") && field[2][1].equals("O") && field[2][2].equals("O"))
                || (field[0][0].equals("O") && field[1][0].equals("O") && field[2][0].equals("O"))
                || (field[0][1].equals("O") && field[1][1].equals("O") && field[2][1].equals("O"))
                || (field[0][2].equals("O") && field[1][2].equals("O") && field[2][2].equals("O"))
                || (field[0][0].equals("O") && field[1][1].equals("O") && field[2][2].equals("O"))
                || (field[0][2].equals("O") && field[1][1].equals("O") && field[2][0].equals("O"))
        ) {
            System.out.println("Компьютер победил");
            return true;
        } else if (countFreeSpace == 0) {
            System.out.println("Ничья");
            return true;
        } else {
            return false;
        }
    }


    public static void movePC() {

        Random random = new Random();

        boolean isNotFinishedMove = true;

        while (isNotFinishedMove) {
            int x = random.nextInt(field.length);
            int y = random.nextInt(field.length);
            if (!field[x][y].equals("X") && !field[x][y].equals("O")) {
                field[x][y] = "O";
                isNotFinishedMove = false;
            }

        }
        System.out.println("Компьютер сделал ход");

    }


}
