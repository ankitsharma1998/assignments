package demo.service;

import demo.domain.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class EmailServiceTest {

    @Test
    void getInstance() {
        EmailService emailServiceObj = EmailService.getInstance();
        EmailService emailServiceObj2 = EmailService.getInstance();
        //then
        assertEquals(emailServiceObj,emailServiceObj2);
    }
    @Test
    void sendEmail() {
        EmailService emailServiceObj =new EmailService();
        Order orderObj = new Order();
        Executable executable=()->emailServiceObj.sendEmail(orderObj);
        assertThrows(RuntimeException.class, executable);
    }
    @Test
    void testSendEmail() {
        {
            EmailService emailServiceObj = new EmailService();
            Order orderObj = new Order();
            String cc = "Hi";
            boolean result = emailServiceObj.sendEmail(orderObj,cc);
            assertTrue(result);
        }
    }
}
