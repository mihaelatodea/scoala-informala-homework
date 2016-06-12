package sii.homework.ro;

/**
 * This class contains the business logic for the Ticket Shop.
 * 
 */

import java.util.HashMap;
import java.util.Map;

public class ManagementTicket {

	private int numberTicketSold;
	private int numberTicket;
	private boolean soldout;
	private int buyersNumber;
	private int category1Sold;
	private int category2Sold;
	private int category3Sold;
	private int availableTicket;
	private int remainTicket;
	private int countSoldTicket = 0;

	private Map<String, Integer> ticket = new HashMap<String, Integer>();
	
	/**
	 * Class constructor.
	 * @param numberTicketSold
	 * @param numberTicket
	 */

	public ManagementTicket(int numberTicketSold, int numberTicket) {
		this.numberTicketSold = numberTicketSold;
		this.numberTicket = numberTicket;
		buyersNumber = 0;
		ticket.put("categoria 3", numberTicketSold * 50 / 100);
		ticket.put("categoria 2", numberTicketSold * 35 / 100);
		ticket.put("categoria 1", numberTicketSold * 15 / 100);
	}
	
	public boolean Finished() {
		return soldout;
	}

	public void priceForCategory() {
		category3Sold = (numberTicketSold - (numberTicketSold * 50 / 100)) - ticket.get("categoria 3");
		category2Sold = (numberTicketSold - (numberTicketSold * 65 / 100)) - ticket.get("categoria 2");
		category1Sold = (numberTicketSold - (numberTicketSold * 85 / 100)) - ticket.get("categoria 1");
		
        int totalsold = (category1Sold*120) + (category2Sold*80) + (category3Sold*50);
		
	    System.out.println("Valoarea biletelor vandute pe categoria 1: " + category1Sold*120);
		System.out.println("Valoarea biletelor vandute pe categoria 2: " + category2Sold*80);
		System.out.println("Valoarea biletelor vandute pe categoria 3: " + category3Sold*50);
	
		System.out.println("Valoarea totala a biletelor vandute este: " + totalsold);
	}

	/**
	 * @return the countSoldTicket
	 */
	public int getCountSoldTicket() {
		return countSoldTicket;
	}

	/**
	 * @param countSoldTicket
	 *            the countSoldTicket to set
	 */
	public void setCountSoldTicket(int countSoldTicket) {
		this.countSoldTicket = countSoldTicket;
	}
	
	/**
	 * Method for selling the ticket and has exceptions if the limit of tickets is passed.
	 * Here is the implementation for the 17-th buyer who buys 3 tickets.
	 * @throws CategoryTicketsSoldoutException
	 * @throws SoldoutException
	 */

	public void sellTicket() throws CategoryTicketsSoldoutException, SoldoutException {
		while (countSoldTicket < numberTicket) {
			buyersNumber++;

			if ((countSoldTicket < numberTicketSold * 50 / 100)) {

				availableTicket = ticket.get("categoria 3");
				if (buyersNumber / 17 == 0) {
					ticket.put("categoria 3", availableTicket - 3);
					countSoldTicket += 3;
				} else {
					ticket.put("categoria 3", availableTicket - 1);
					countSoldTicket += 1;
				}

				remainTicket = ticket.get("categoria 3");
				if (remainTicket == 0) {
					try {
						throw new CategoryTicketsSoldoutException("Category 3: sold out!");
					} catch (Exception e) {
						throw e;
					}
				}

				continue;
			}

			if ((countSoldTicket < numberTicketSold * 85 / 100) && (countSoldTicket >= numberTicketSold * 50 / 100)) {

				availableTicket = ticket.get("categoria 2");
				if (buyersNumber / 17 == 0) {
					ticket.put("categoria 2", availableTicket - 3);
					countSoldTicket += 3;
				} else {
					ticket.put("categoria 2", availableTicket - 1);
					countSoldTicket += 1;
				}

				remainTicket = ticket.get("categoria 2");
				if (remainTicket == 0)
					try {
						throw new CategoryTicketsSoldoutException("Category 2 : sold out!");
					} catch (Exception e) {
						throw e;
					}
				continue;
			}

			if ((countSoldTicket >= numberTicketSold * 85 / 100)) {

				availableTicket = ticket.get("categoria 1");
				if (buyersNumber / 17 == 0) {
					ticket.put("categoria 1", availableTicket - 3);
					countSoldTicket += 3;
				} else {
					ticket.put("categoria 1", availableTicket - 1);
					countSoldTicket += 1;
				}

				remainTicket = ticket.get("categoria 1");
				if (remainTicket == 0)
					try {
						throw new CategoryTicketsSoldoutException("Category 1 : sold out!");
					} catch (Exception e) {
						throw e;
					}
				continue;
			}
		}

		soldout = true;

		if (ticket.get("categoria 3") == 0 && ticket.get("categoria 2") == 0 && ticket.get("categoria 1") == 0)
			throw new SoldoutException("Sold out!");

	}
	
	/**
	 * Method to print all available tickets.
	 */

	public void printTicketAvailability() {
		System.out.println();
		for (Map.Entry<String, Integer> ticketInfo : ticket.entrySet()) {
			String value = ticketInfo.getKey();
			int key = ticketInfo.getValue();
			System.out.println("Ticket category: " + value + ", Available: " + key);
		}
	}
}
