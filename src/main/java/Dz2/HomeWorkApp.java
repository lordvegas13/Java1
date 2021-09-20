package Dz2;

public class HomeWorkApp {
    public static void main(String[] args) {
        int year = 2026;

        System.out.println(isSum(6, 7));
        isDaOrNo(-7);
        System.out.println(doFive(-7));
        methodC("ХЭЙ",7);
        methodF(year);

    }
//1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    static boolean isSum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20){
            return true;
        } else {
            return false;
        }
    }
//2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
    static void isDaOrNo(int a) {
        if(a < 0) {
            System.out.println("Число" + " " + "отрицательное");
        }
        if (a >=0) {
            System.out.println("Число" + " " + "положительное");
        }
    }
//3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

    static boolean doFive(int a) {
        if (a < 0) return true;
        return false;
    }
//4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз;

    public static void methodC(String str, int n ){
        for ( int i = 0; i < n; i ++){
            System.out.println(str);
        }
    }

//*5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static void methodF(int year){
        if(year%4==0 && year%100 !=0 || year%400==0){
            System.out.println("Год высокосный");
        }
        else {
            System.out.println("Год не высокосный");
        }
    }

}
