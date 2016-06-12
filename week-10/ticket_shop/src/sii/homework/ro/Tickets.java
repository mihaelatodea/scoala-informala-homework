package sii.homework.ro;

/**
 * This class contains the number ticket that the buyers buy.
 * 
 * @author misha
 *
 */

public class Tickets {
    
	private int numberTicket;
	
	public Tickets(int numberTicket){
		this.numberTicket= numberTicket;

	}

	/**
	 * @return the numberTicket
	 */
	public int getNumberTicket() {
		return numberTicket;
	}

	/**
	 * @param numberTicket the numberTicket to set
	 */
	public void setNumberTicket(int numberTicket) {
		this.numberTicket = numberTicket;
	}

}
