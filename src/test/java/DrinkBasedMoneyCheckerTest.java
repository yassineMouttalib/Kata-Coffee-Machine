import domain.*;
import domain.money.*;
import interfaces.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.*;

import static org.junit.Assert.*;

@ExtendWith(MockitoExtension.class)
public class DrinkBasedMoneyCheckerTest
{

    private int insertedCents;
    private int drinkPriceCents;

    @Mock
    private MoneyReader moneyReader;

    @Test
    public void getDifferenceTest() throws Exception {
        Drink drink = Drink.COFFEE;
        int insertedCents = 90;
        final Order order = new Order(drink);
        final Money insertedMoney = new Money(insertedCents);
        drinkPriceCents = drink.getPrice().getCents();
        Mockito.when(moneyReader.readMoney()).thenReturn(insertedMoney);


        DrinkBasedMoneyChecker checker = new DrinkBasedMoneyChecker(moneyReader);
        assertEquals(new Money(insertedCents-drinkPriceCents), checker.getDifference(order));
    }


}
