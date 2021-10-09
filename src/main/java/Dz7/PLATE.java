package Dz7;

public class PLATE {
    private int food;

    public PLATE(int food) {
        this.food = food;
    }

    public void addFood(int food){
        this.food += food;
    }

    public void info (){
        System.out.println("Количество еды " + food);
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    boolean decreaseFood(int n) {
        int diff = food - n;
        if (diff < 0) return false;
        food -= n;
        return true;
    }
}
