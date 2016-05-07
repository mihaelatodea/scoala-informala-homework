package ro.sci.tileshop;

/**
 * This class calculates the price for the surface to be cover with tile pieces sold by surface.
 * 
 * @author misha
 *
 */

public class STile extends AbstractRectangularTile {
	
	/**
	 * Constructor for price and length and width.
	 * @param priceforstile
	 * @param sTileLenght
	 * @param sTileWidth
	 */
	public STile(double priceforstile, double sTileLenght, double sTileWidth) {
		super(priceforstile, sTileLenght, sTileWidth);
		// TODO Auto-generated constructor stub
	}
    
	/**
	 * Overriding the method in the interface for this particular case of covering the surface using only
	 *  the surface to be cover and price for s tile pieces as parameters.
	 *  
	 */
	@Override
	public double calculatePrice(double surfaceToCover, double priceforstile) {
		return surfaceToCover * priceforstile;
	}

}
