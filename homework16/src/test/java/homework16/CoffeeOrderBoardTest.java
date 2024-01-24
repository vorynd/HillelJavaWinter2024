package homework16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CoffeeOrderBoardTest {
    private CoffeeOrderBoard sut = new CoffeeOrderBoard();

    @Test
    public void testDeliverOperationShouldReturnPreviouslyAddedOrder() {
        //GIVEN
        sut.add("Joe");

        //WHEN
        Order order = sut.deliver();

        //THEN
        Assertions.assertNotNull(order);
        Assertions.assertEquals(0, order.getOrderNumber());
        Assertions.assertEquals("Joe", order.getClientName());
    }

    @Test
    public void testDeliverWithIndexOperationShouldReturnOrderWithExactIndex() {
        //GIVEN
        sut.add("Joe");
        sut.add("Moe");
        sut.add("Pit");

        //WHEN
        Order order = sut.deliver(1);

        //THEN
        Assertions.assertNotNull(order);
        Assertions.assertEquals(1, order.getOrderNumber());
        Assertions.assertEquals("Moe", order.getClientName());
    }

    @Test
    public void testDeliverShoulThrowExeptionIfNoOrdersAdded() {
        //WHEN
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
            Order order = sut.deliver();
        });
    }

    @Test
    public void testDeliverShouldReturnNullIfNoOrderwithSuchIndex() {
        //GIVEN
        sut.add("Joe");
        sut.add("Moe");
        sut.add("Pit");

        //WHEN
        Order order = sut.deliver(5);

        //THEN
        Assertions.assertNull(order);
    }

}
