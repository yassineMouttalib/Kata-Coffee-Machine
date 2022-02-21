import domain.*;
import domain.money.*;
import interfaces.*;

public class CoffeeMachine {

    private final DrinkMaker drinkMaker;
    private final OrderReader orderReader;
    private final MoneyChecker moneyChecker;
    private final BeverageQuantityChecker beverageQuantityChecker;
    private final EmailNotifier emailNotifier;

    public CoffeeMachine(
            DrinkMaker drinkMaker,
            OrderReader orderReader,
            MoneyChecker moneyChecker,
            BeverageQuantityChecker beverageQuantityChecker,
            EmailNotifier emailNotifier
    ) {
        this.drinkMaker = drinkMaker;
        this.orderReader = orderReader;
        this.moneyChecker = moneyChecker;
        this.beverageQuantityChecker = beverageQuantityChecker;
        this.emailNotifier = emailNotifier;
    }

    public void serveOrder() {
        Order order = orderReader.readInput();
        Money difference = moneyChecker.getDifference(order);
        if (difference.getCents() < 0) {
            displayInsufficientFundsMessage(difference);
            return;
        }
        if(beverageQuantityChecker.isEmpty(order.getDrinkType().toString())) {
            emailNotifier.notifyMissingDrink(order.getDrinkType().toString());
            return;
        }
        String instructions = order.toString();
        drinkMaker.process(instructions);
    }

    //Tools
    private void displayInsufficientFundsMessage(Money difference) {
        String instructions = moneyChecker.insufficientFundsMessage(difference);
        drinkMaker.process(instructions);
    }
}
