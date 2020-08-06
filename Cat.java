package lesson7;

public class Cat {
   final private String name;
   private int appetite;
   private int satiety;
   final private int feedingTime;

    public String getName() { return name; }
    public int getSatiety() { return satiety; }
    public int getAppetite() { return appetite; }

    public Cat(String name, int appetite, int feedingTime) {
        this.name = name;
        this.appetite = appetite;
        this.feedingTime = feedingTime;
        this.satiety = 0;
    }

    public void eat(Plate p){
        p.decreaseFood(appetite);
        System.out.println(String.format("%s наелся.", name));
        satiety += feedingTime;
    }

}
