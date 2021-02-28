package demo.domain;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    Order orderObj=new Order(85,"Books",45.8);
    @Test
    void getQuantity() {
        //when
        int quantity = orderObj.getQuantity();
        //then
        assertEquals(quantity,85);
    }
    @Test
    void setQuantity() {
        //given
        Order orderObj2 = new Order();
        //when
        Order returnObject = orderObj2.setQuantity(4);
        //then
        assertEquals(returnObject,orderObj2);
    }
    @Test
    void getItemName() {
        //when
        String name = orderObj.getItemName();
        //then
        assertEquals(name,"Books");
    }
    @Test
    void setItemName() {
        //given
        Order orderObj2 = new Order();
        //when
        Order returnObject = orderObj2.setItemName("books");
        //then
        assertEquals(returnObject,orderObj2);
    }
    @Test
    void getPrice() {
        //when
        double price = orderObj.getPrice();
        //then
        assertEquals(price,45.8);
    }
    @Test
    void setPrice() {
        //given
        Order orderObj2 = new Order();
        //when
        Order returnObject = orderObj2.setPrice(45.5);
        //then
        assertEquals(returnObject,orderObj2);
    }
    @Test
    void getPriceWithTex() {
        //given
        Order orderObj2 = new Order();
        orderObj2.setPriceWithTex(85.5);
        //when
        double priceWithTex = orderObj2.getPriceWithTex();
        //then
        assertEquals(priceWithTex,85.5);
    }
    @Test
    void setPriceWithTex() {
            //given
            Order orderObj2 = new Order();
            //when
            Order returnObject = orderObj2.setPriceWithTex(56.7);
            //then
            assertEquals(returnObject,orderObj2);
    }
}
