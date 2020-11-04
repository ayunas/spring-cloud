package com.udemy.bharath.ticketservice;

//import lombok.NonNull;
import org.springframework.lang.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tickets")
public class TicketController {

	@Autowired
	TicketRepo ticketRepo;

	@GetMapping
	public List<Ticket> getTickets() {
		return ticketRepo.findAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Ticket> getTicket(@PathVariable Long id) {
		Optional<Ticket> ticket = ticketRepo.findById(id);

		if (ticket.isEmpty()) {
			return new ResponseEntity("No ticket found with id : " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(ticket.get(), HttpStatus.OK);
	}

	@PostMapping
	public Ticket addTicket(@RequestBody Ticket ticket) {
		Ticket tkt = ticketRepo.save(ticket);
		System.out.println(tkt);
		return tkt;
	}
}