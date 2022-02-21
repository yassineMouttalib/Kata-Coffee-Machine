import domain.*;
import org.junit.*;

import static org.junit.Assert.*;

public class OrderTest {

    @Test
    public void teaOrderTest() throws Exception {
        Order order = new Order(Drink.TEA);
        String instructions = order.toString();
        assertEquals("T::", instructions);
    }

    @Test
    public void coffeeOrderTest() throws Exception {
        Order order = new Order(Drink.COFFEE);
        String instructions = order.toString();
        assertEquals("C::", instructions);
    }

    @Test
    public void ChocolateOrderTest() throws Exception {
        Order order = new Order(Drink.CHOCOLATE);
        String instructions = order.toString();
        assertEquals("H::", instructions);
    }

    @Test
    public void chocolateWithOneSugarTest() throws Exception {
        Order order = new Order(Drink.CHOCOLATE);
        order.addSugar();
        String instructions = order.toString();
        assertEquals("H:1:0", instructions);
    }

    @Test
    public void orangeJusOrderTest() throws Exception {
        Order order = new Order(Drink.ORANGE_JUICE);
        String instructions = order.toString();
        assertEquals("O::", instructions);
    }

    @Test
    public void extraHotTeaWithNoSugarTest() throws Exception {
        Order order = new Order(Drink.TEA);
        order.setExtraHot();
        String instructions = order.toString();
        assertEquals("Th::", instructions);
    }

    @Test
    public void extraHotChocolateWithOneSugarTest() throws Exception {
        Order order = new Order(Drink.CHOCOLATE);
        order.setExtraHot();
        order.addSugar();
        String instructions = order.toString();
        assertEquals("Hh:1:0", instructions);
    }

    @Test
    public void extraHotCoffeeWithTwoSugarTest() throws Exception {
        Order order = new Order(Drink.COFFEE);
        order.setExtraHot();
        order.addSugar();
        order.addSugar();
        String instructions = order.toString();
        assertEquals("Ch:2:0", instructions);
    }
}