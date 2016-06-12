package sii.homework.ro;

/**
 * This application is a Ticket Shop for an event. It contains the ticket, management for the tickets and test.
 * There are n number of tickets and n+13 buyers. It has 3 categories for 3 type of tickets. The selling of tickets it will start from the 3rd category and will continue with the second and then the first that is the most expensive category.
 * The price per category are: -3rd - 50 lei;
 *                             -2nd - 80 lei;
 *                             -1st - 120 lei.
 * The application will have 2 exceptions. One is when the tickets from one of the category are sold out and the second is when there are no tickets available.
 * 
 * 
 * @author misha
 *
 */

public class Main {

	public static void main(String[] args) {
		
		ManagementTicket t1 = new ManagementTicket(1500, 2000);
		while(!t1.Finished()){
	    try {
	    	t1.sellTicket();
	    } catch (CategoryTicketsSoldoutException e) {
           System.out.println("Nu mai sunt bilete la aceasta categorie.");
	    } catch (SoldoutException e) {
            System.out.println("Nu mai sunt bilete.");
	    }
		}
		
	    t1.priceForCategory();
		
		t1.printTicketAvailability();
		
		 
	
	}

}
