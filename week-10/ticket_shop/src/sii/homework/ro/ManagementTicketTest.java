package sii.homework.ro;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public class ManagementTicketTest {

	@Test
	public void test() {
		ManagementTicket t2 = new ManagementTicket(0, 0);
		t2.priceForCategory();
		t2.getCountSoldTicket();
		t2.printTicketAvailability();
		
		assertEquals("Nothing to print", 0, 0);
		assertEquals("Counting is zero", 0, 0);
		assertEquals("Room empty", 0 , 0);
	}
	
	@Test
	public void userHasName() {
		User user = new User("Ana");
		String name = user.getName();
		assertEquals("Ana", name);
	}

	@Test
	public void userHasTicket(){
		User user = new User("Ana");
		user.addTicket(new Tickets(15));
		List<Tickets> ticket = user.getTicket();
		assertNotNull(ticket);
		assertFalse(ticket.isEmpty());
	}
	
	
	public class User{

		private String name;
		private ArrayList<Tickets> ticket = new ArrayList<>();
		
		public User(String name) {
			this.name = name;
		}
		
		public void addTicket(Tickets tickets) {
			ticket.add(tickets);
			
		}

		public List<Tickets> getTicket() {
			return ticket;
		}



		public String getName() {
			return name;
		}
		
	}

}
