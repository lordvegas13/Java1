package Dz7;

public class CAT {

    private String name;
    private int appetite;
    private boolean hungry;

    public CAT(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = true;
    }

    public void eat(PLATE plate){
       if (hungry && plate.decreaseFood(appetite))
          hungry = false;
    }

    public void info(){
        String isHungry = !hungry ? "наетый" : "голодненький";
        System.out.println(name + ": " + isHungry);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }
}
