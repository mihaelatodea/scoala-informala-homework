package ro.sci.tileshop;

/**
 * This class is abstract and implements the interface Tile in order to calculate the area of a tile piece. 
 * @author misha
 *
 */
public abstract class AbstractRectangularTile implements Tile {
	
	private double length;
	private double width;
	private double price;

	/**
	 * Constructor for the class to help parse the parameters.
	 * @param priceforstile
	 * @param sTileLenght
	 * @param sTileWidth
	 */
	public AbstractRectangularTile(double priceforstile, double sTileLenght, double sTileWidth) {
		length = sTileLenght;
		width = sTileWidth;
		price = priceforstile;
		
	
	}
	
	/**
	 * Method for the implementation of the area's tile piece.
	 * 
	 */
	@Override
	public double calculateArea() {
		return this.getLength() * this.getWidth();
	}

	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}

	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * @return the priceforstile
	 */
	public double getPrice() {
		return price;
	}

	
}
