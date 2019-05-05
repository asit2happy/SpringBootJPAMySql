package com.infotech.book.ticket.app;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.infotech.book.ticket.app.entities.Ticket;
import com.infotech.book.ticket.app.service.TicketBookingService;

@SpringBootApplication
public class TicketBookingManagementAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketBookingManagementAppApplication.class, args);
		
	}

}

