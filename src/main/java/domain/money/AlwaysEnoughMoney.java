package domain.money;


import domain.*;
import interfaces.*;

public class AlwaysEnoughMoney implements MoneyChecker
{
    public Money getDifference(Order order) {
        return new Money(0);
    }
}
