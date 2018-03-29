enum LunchType {
    A, B, C;
}

enum DrinkType {
    COFFEE,
    JUICE,
    TEA;
}

class LunchSet {
    private final LunchType lunch;
    private final DrinkType drink;

    public LunchSet(LunchType lunch, DrinkType drink) {
        this.lunch = lunch;
        this.drink = drink;
    }

    public String toString() {
        return "LunchType: " + this.lunch + ", " + "DrinkType: " + this.drink;
    }
}

public class Exam4Enum {
    public static void main(String[] args) {
        LunchSet order = new LunchSet(LunchType.B, DrinkType.TEA);
        System.out.println(order);
    }
}
