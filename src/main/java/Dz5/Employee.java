package Dz5;
     /* 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
        2. Конструктор класса должен заполнять эти поля при создании объекта.
        3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
        4. Создать массив из 5 сотрудников.
        5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.*/

public class Employee {
    private String names;
    private String position;
    private String email;
    private int phone;
    private int salary;
    private int age;


    public Employee(String names, String position, String email, int phone, int salary, int age){
        this.names = names;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
        System.out.println("Создан");

    }
    public void print() {
        System.out.println(names + " " + position + " " + email + " " + phone + " " + salary + " " + age);
    }


    public String getNames(){
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
