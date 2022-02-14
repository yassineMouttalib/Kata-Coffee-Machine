import domain.*;
import domain.message.*;

public class CoffeeMachine {
    public static void main(String[] args) {
        Order order = new Order(Drink.COFFEE);
        System.out.println(order.toString());
        order.addSugar();
        System.out.println(order.toString());
        System.out.println(order.getMessage().getText());
    }
}
