package domain;

public class Drink
{
    public static final Drink COFFEE =
            new Drink(DrinkType.COFFEE);

    public static final Drink TEA =
            new Drink(DrinkType.TEA);

    public static final Drink CHOCOLATE =
            new Drink(DrinkType.CHOCOLATE);

    private DrinkType drinkType;

    public Drink(DrinkType drinkType) {
        this.drinkType = drinkType;
    }

    public DrinkType getDrinkType() {
        return drinkType;
    }

}
