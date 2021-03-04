package com.assignmentonspring.springassignment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ticketbooking {
    private tickets tic;
@Autowired
    public ticketbooking(tickets tic) {
        this.tic=tic;
    }

    public String ticketbooking(String source, String destination){
        String ticket=tic.boardingpass(source,destination);
        return ticket;
    }
}

