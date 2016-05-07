package ro.sci.tileshop;

/**
 * The program is the management for a Tile Shop. It sells tile for the surface and by piece and also by split surface.
 * This program uses the next parameters: surfaceToCover, priceforsTile, sTileLenght, sTileWidth, sTileEdge.
 * The output of the program is the cost for each surface to be covered individually by surface or by pieces 
 * or by a split between them or by isosceles right triangle tile pieces.
 * The values for the parameters are in centimeters and are by type doubles.
 * 
 * @author misha
 *
 */
public class Main {

	
	public static void main(String[] args) {
		double surfaceToCover = 100;
		double priceforsTile = 5;
		double sTileLenght = 6;
		double sTileWidth = 4;
		double sTileEdge = 3;
		
		double sTileCost = calculatesTileCost(surfaceToCover, priceforsTile, sTileLenght, sTileWidth);
		
		System.out.println("1. cost for covering the surface with S type tiles : " + sTileCost);
		 
		double pTileCost = calculatePTileCost(surfaceToCover, priceforsTile, sTileLenght, sTileWidth);
		System.out.println("2. cost for covering the surface with P type tiles : " + pTileCost);
		
		double splitCost = calculatePTileCost(surfaceToCover/ 2, priceforsTile, sTileLenght, sTileWidth) +
				           calculatesTileCost(surfaceToCover/ 2, priceforsTile, sTileLenght, sTileWidth);
		System.out.println("3. cost for covering the surface with the combination S type tiles and P type tiles : " + splitCost);
		
		double PTTileCost = calculatePTTileCost(surfaceToCover, priceforsTile, sTileEdge);
		System.out.println("4. cost for covering the surface with PT type tiles : " + PTTileCost);

	}
	
  /**
   * Method to calculate PT Tile Cost.
   * @param surfaceToCover
   * @param priceforsTile
   * @param sTileEdge
   * @return
   */
	private static double calculatePTTileCost(double surfaceToCover, double priceforsTile,double sTileEdge) {
		Tile ptTypeTile = new PTTile(priceforsTile, sTileEdge);
	    return ptTypeTile.calculatePrice(surfaceToCover, priceforsTile); 
	}

    /**
     * Method to calculate P Tile Cost.
     * @param surfaceToCover
     * @param priceforsTile
     * @param sTileLenght
     * @param sTileWidth
     * @return
     */
	private static double calculatePTileCost(double surfaceToCover, double priceforsTile, double sTileLenght, double sTileWidth) {
		Tile pTypeTile = new PTile(priceforsTile, sTileLenght, sTileWidth);
	    return pTypeTile.calculatePrice(surfaceToCover, priceforsTile);
	}
	
    /**
     * Method to calculate S Tile Cost.
     * @param surfaceToCover
     * @param priceforstile
     * @param sTileLenght
     * @param sTileWidth
     * @return
     */
	public static double calculatesTileCost(double surfaceToCover, double priceforstile, double sTileLenght, double sTileWidth) {
		Tile sTypeTile = new STile(priceforstile, sTileLenght, sTileWidth);
	    return sTypeTile.calculatePrice(surfaceToCover, priceforstile);
		
	       
	}
	

}
