package domain.money;


import domain.*;
import interfaces.*;

public class DrinkBasedMoneyChecker implements MoneyChecker
{
    private MoneyReader moneyReader;

    public DrinkBasedMoneyChecker(MoneyReader moneyReader) {

        this.moneyReader = moneyReader;
    }

    public Money getDifference(Order order) {
        return new Money(
                moneyReader.readMoney().getCents() - order.getDrink().getPrice().getCents()
        );
    }
}
