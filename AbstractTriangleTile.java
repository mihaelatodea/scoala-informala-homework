/**
 * 
 */
package ro.sci.tileshop;

/**
 * This class is abstract and implements the interface Tile in order to calculate the area of a tile piece for isosceles right triangle.
 * @author misha
 *
 */
public abstract class AbstractTriangleTile implements Tile {
	
	private double price;
	private double edge;
	
	
	/**
	 * Constructor for price and edge to be parse later as parameters.
	 * @param priceforstile
	 * @param sTileEdge
	 */
	public AbstractTriangleTile(double priceforstile, double sTileEdge) {
		edge = sTileEdge;
		price = priceforstile;	
	}
	
	/**
	 * Method to calculate the area's tile piece for isosceles right triangular tiles.
	 * 
	 */
	public double calculateArea() {
		return (this.getEdge() * this.getEdge()) / 2;
	}


	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @return the edge
	 */
	public double getEdge() {
		return edge;
	}

}
