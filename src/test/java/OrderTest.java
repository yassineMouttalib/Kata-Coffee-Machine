import domain.*;
import org.junit.*;

import static org.junit.Assert.*;

public class OrderTest {

    @Test
    public void adaptsTea() throws Exception {
        Order order = new Order(Drink.TEA);
        String instructions = order.toString();
        assertEquals("T::", instructions);
    }

    @Test
    public void adaptsCoffee() throws Exception {
        Order order = new Order(Drink.COFFEE);
        String instructions = order.toString();
        assertEquals("C::", instructions);
    }

    @Test
    public void adaptsHotChocolate() throws Exception {
        Order order = new Order(Drink.CHOCOLATE);
        String instructions = order.toString();
        assertEquals("H::", instructions);
    }

    @Test
    public void adaptsHotChocolateWithOneSugar() throws Exception {
        Order order = new Order(Drink.CHOCOLATE);
        order.addSugar();
        String instructions = order.toString();
        assertEquals("H:1:0", instructions);
    }

}