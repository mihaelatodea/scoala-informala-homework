package ro.sci.tileshop;

/**
 * This class is used to calculate the price for the surface to be cover with isosceles right triangle tile pieces.
 * @author misha
 *
 */
public class PTTile extends AbstractTriangleTile {

	/**
	 * Constructor for price and edge.
	 * @param priceforstile
	 * @param sTileEdge
	 */
	public PTTile(double priceforstile, double sTileEdge) {
		super(priceforstile, sTileEdge);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Overriding the method in the interface for this particular case of tile pieces.
	 */
	@Override
	public double calculatePrice(double surfaceToCover, double priceforstile) {
		return surfaceToCover/ super.calculateArea() * priceforstile;
	}



}
