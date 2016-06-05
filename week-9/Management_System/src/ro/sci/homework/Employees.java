package ro.sci.homework;

import java.util.Comparator;

/**
 * This class is where we have implemented the employees data.
 * 
 * @author Mihaela Todea
 */

public class Employees {
	
	private String name;
	private String position;
	private int seniority;
	private boolean parking;
	
	public Employees (String name, String position, int seniority, boolean parking){
		this.name=name;
		this.position= position;
		this.seniority= seniority;
		this.parking= parking;
		
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * @return the seniority
	 */
	public int getSeniority() {
		return seniority;
	}

	/**
	 * @return the parking
	 */
	public boolean isParking() {
		return parking;
	}
	
	public static Comparator<Employees> Seniority = new Comparator<Employees>() {

		@Override
		public int compare(Employees o1, Employees o2) {
			return o2.seniority - o2.seniority;
		}

	};

	public int compareTo(Employees o) {
		return (this.name).compareTo(o.name);
	}

}
