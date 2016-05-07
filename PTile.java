package ro.sci.tileshop;

/**
 * In this class is calculated the price for the surface to cover with tile pieces sold by the piece.
 * @author misha
 *
 */
public class PTile extends AbstractRectangularTile {

	/**
	 * Constructor: 
	 * @param priceforstile
	 * @param sTileLenght
	 * @param sTileWidth
	 */
	public PTile(double priceforstile, double sTileLenght, double sTileWidth) {
		super(priceforstile, sTileLenght, sTileWidth);
	}

    /**
     * Method to calculate the price for the surface to be cover with tile pieces.
     */
	@Override
	public double calculatePrice(double surfaceToCover, double priceforstile) {
		return surfaceToCover / super.calculateArea() * priceforstile;
	}

}
