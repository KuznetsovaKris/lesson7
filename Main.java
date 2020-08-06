package lesson7;

public class Main {
    public static void main(String[] args) {

        feedTheCat();

    }

    public static void feedTheCat() {
        Cat[] cat = new Cat[4];
        cat[0] = new Cat("Барсик", 500, 3);
        cat[1] = new Cat("Пушок", 240, 2);
        cat[2] = new Cat("Патрик", 80, 10);
        cat[3] = new Cat("Стёпка", 50, 6);
        Plate plate = new Plate(500);

        for (Cat i : cat) {
            System.out.println(String.format("Накормим кота по имени %s.\nЕму необходимо %sг. корма.", i.getName(), i.getAppetite()));
            plate.info();
            i.eat(plate);
            System.out.println(String.format("Следующее кормление через %sч.", i.getSatiety()));
            System.out.println();
        }
    }
}
