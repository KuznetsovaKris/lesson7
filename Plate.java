package lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n){
        while(n > food){
            System.out.println("Недостаточно, чтобы накормить кота.");
            addFood();
        }
        food -= n;
    }

    public void addFood(){
        this.food += 500;
        System.out.println("Добавлено 500 г. корма.");
    }

    public void info() {
       System.out.println(String.format("В тарелке %sг. корма.", food));
    }

}
