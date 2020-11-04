
package com.udemy.bharath.ticketservice;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@NoArgsConstructor @AllArgsConstructor @ToString
@Getter @Setter
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	private String event;
	@NotNull private Long price;
	@NotNull private String status;
}

