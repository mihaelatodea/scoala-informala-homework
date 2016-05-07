package ro.sci.tileshop;
/**
 * This is the interface that we use to establish the main methods that are to be used in the program later.
 * 
 * @author misha
 *
 */
public interface Tile {

	/**
	 * Method for calculating the price for the surface that is needed to be cover with different type of tiles.
	 * @param surfaceToCover
	 * @param priceforstile
	 * @return
	 */
	double calculatePrice(double surfaceToCover, double priceforstile);
	 
	/**
	 * Method for calculating the area for a tile piece that are used for covering the surface needed.
	 * @return
	 */
	double calculateArea();

}
