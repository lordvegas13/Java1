package Dz3;

public class HomeWorkApp3 {
//1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

    public static void main(String[] args ) {



        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
            if(arr1[i] == 1){
                arr1[i] = 0;
            }
            else {
                arr1[i] = 1;
            }
        }
        System.out.println();
        System.out.println("Замена");
        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println("\n");

 //2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;

        int[] arr2 = new int[100];
        for (int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
            arr2[i] = i + 1;
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }


//3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        System.out.println("\n");


        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++){
            System.out.print(arr3[i] + " ");
            if (arr3[i] < 6){
                arr3[i] *=2;
            }
        }
        System.out.println(" ");
        for (int i = 0; i < arr3.length; i++){
            System.out.print(arr3[i] + " ");
        }

//4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
        System.out.println("\n");

        int n = 6;
        int [][] arr4 = new int[n][n];
        for (int i = 0; i < n; i++) {
            arr4[i][i] = 7;
            arr4[i][n - i - 1] = 9;
        }
        for (int i = 0; i < arr4.length; i++){
            for (int j = 0; j< arr4[i].length; j++){
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }
         System.out.println();

//6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
        int [] arr6 = {66666, 6666, 666, 6};
        int max = arr6[0];
        int min = arr6[0];
        for(int i = 0; i != arr6.length; i ++){
            if(arr6[i] > max){
                max = arr6[i];
            }
            if(arr6[i] < min){
                min = arr6[i];
            }
        }
        System.out.println(min + " " + max);
        System.out.println();




        arr5(3, 3);


    }
    //5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;

    public static int[] arr5(int len, int initialValue){
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
            System.out.println(arr[i]);

        }
        return arr;
    }
}


