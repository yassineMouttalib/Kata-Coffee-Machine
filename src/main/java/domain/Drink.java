package domain;

import domain.money.*;

public class Drink
{
    public static final Drink TEA =
            new Drink(DrinkType.TEA,
                    new Money(40));
    public static final Drink COFFEE =
            new Drink(DrinkType.COFFEE,
                    new Money(60));
    public static final Drink CHOCOLATE =
            new Drink(DrinkType.CHOCOLATE,
                    new Money(50));
    public static final Drink ORANGE_JUICE =
            new Drink(DrinkType.ORANGE_JUICE,
                    new Money(60));
    // attributes
    private DrinkType drinkType;
    private Money price;

    public Drink(DrinkType drinkType, Money price) {
        this.drinkType = drinkType;
        this.price = price;
    }

    public DrinkType getDrinkType() {
        return drinkType;
    }

    public Money getPrice() {
        return price;
    }

}
