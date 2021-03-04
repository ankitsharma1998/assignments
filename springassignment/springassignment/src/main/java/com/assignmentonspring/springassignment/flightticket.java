package com.assignmentonspring.springassignment;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class flightticket implements tickets {
    public String boardingpass(String source,String destination){
        System.out.println("Boarding pass generated");
        return " flight ticket booked from " + source +" to " +destination;
    }
}

