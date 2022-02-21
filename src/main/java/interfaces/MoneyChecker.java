package interfaces;

import domain.*;
import domain.money.*;

public interface MoneyChecker
{
    public default String insufficientFundsMessage(Money difference) {
        return "There are " + difference.format() + " missing";
    }

    Money getDifference(Order order);
}
