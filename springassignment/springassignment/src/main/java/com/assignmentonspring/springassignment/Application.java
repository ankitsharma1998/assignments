package com.assignmentonspring.springassignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(Application.class, args);
		ticketbooking bookedticket=context.getBean(ticketbooking.class);
		String ticketbooked =bookedticket.ticketbooking("delhi","tristan da cunha");
		System.out.println(ticketbooked);
	}
}
