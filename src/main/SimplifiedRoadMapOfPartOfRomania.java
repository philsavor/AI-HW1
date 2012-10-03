package main;


/**
 * Represents a simplified road map of Romania. The initialization method is
 * declared static. So it can also be used to initialize other specialized
 * subclasses of {@link ExtendableMap} with road map data from Romania. Location
 * names, road distances and directions have been extracted from Artificial
 * Intelligence A Modern Approach (2nd Edition), Figure 3.2, page 63. The
 * straight-line distances to Bucharest have been taken from Artificial
 * Intelligence A Modern Approach (2nd Edition), Figure 4.1, page 95.
 * 
 * @author Ruediger Lunde
 */
public class SimplifiedRoadMapOfPartOfRomania extends ExtendableMap {

	public SimplifiedRoadMapOfPartOfRomania() {
		initMap(this);
	}

	// The different locations in the simplified map of part of Romania
	public static final String ORADEA = "Oradea";
	public static final String ZERIND = "Zerind";
	public static final String ARAD = "Arad";
	public static final String TIMISOARA = "Timisoara";
	public static final String LUGOJ = "Lugoj";
	public static final String MEHADIA = "Mehadia";
	public static final String DOBRETA = "Dobreta";
	public static final String SIBIU = "Sibiu";
	public static final String RIMNICU_VILCEA = "RimnicuVilcea";
	public static final String CRAIOVA = "Craiova";
	public static final String FAGARAS = "Fagaras";
	public static final String PITESTI = "Pitesti";
	public static final String GIURGIU = "Giurgiu";
	public static final String BUCHAREST = "Bucharest";
	public static final String NEAMT = "Neamt";
	public static final String URZICENI = "Urziceni";
	public static final String IASI = "Iasi";
	public static final String VASLUI = "Vaslui";
	public static final String HIRSOVA = "Hirsova";
	public static final String EFORIE = "Eforie";

	/**
	 * Initializes a map with a simplified road map of Romania.
	 */
	public static void initMap(ExtendableMap map) {
		// mapOfRomania
		map.clear();
		map.addBidirectionalLink(ORADEA, ZERIND, 71.0);
		map.addBidirectionalLink(ORADEA, SIBIU, 151.0);
		map.addBidirectionalLink(ZERIND, ARAD, 75.0);
		map.addBidirectionalLink(ARAD, TIMISOARA, 118.0);
		map.addBidirectionalLink(ARAD, SIBIU, 140.0);
		map.addBidirectionalLink(TIMISOARA, LUGOJ, 111.0);
		map.addBidirectionalLink(LUGOJ, MEHADIA, 70.0);
		map.addBidirectionalLink(MEHADIA, DOBRETA, 75.0);
		map.addBidirectionalLink(DOBRETA, CRAIOVA, 120.0);
		map.addBidirectionalLink(SIBIU, FAGARAS, 99.0);
		map.addBidirectionalLink(SIBIU, RIMNICU_VILCEA, 80.0);
		map.addBidirectionalLink(RIMNICU_VILCEA, PITESTI, 97.0);
		map.addBidirectionalLink(RIMNICU_VILCEA, CRAIOVA, 146.0);
		map.addBidirectionalLink(CRAIOVA, PITESTI, 138.0);
		map.addBidirectionalLink(FAGARAS, BUCHAREST, 211.0);
		map.addBidirectionalLink(PITESTI, BUCHAREST, 101.0);
		map.addBidirectionalLink(GIURGIU, BUCHAREST, 90.0);
		map.addBidirectionalLink(BUCHAREST, URZICENI, 85.0);
		map.addBidirectionalLink(NEAMT, IASI, 87.0);
		map.addBidirectionalLink(URZICENI, VASLUI, 142.0);
		map.addBidirectionalLink(URZICENI, HIRSOVA, 98.0);
		map.addBidirectionalLink(IASI, VASLUI, 92.0);
		// addBidirectionalLink(VASLUI - already all linked
		map.addBidirectionalLink(HIRSOVA, EFORIE, 86.0);
		// addBidirectionalLink(EFORIE - already all linked

		// distances and directions
		// reference location: Bucharest
		map.setPosition(ARAD, 91, 492);
		map.setPosition(BUCHAREST, 400, 327);
		map.setPosition(CRAIOVA, 253, 288);
		map.setPosition(DOBRETA, 165, 299);
		map.setPosition(EFORIE, 562, 293);
		map.setPosition(FAGARAS, 305, 449);
		map.setPosition(GIURGIU, 375, 270);
		map.setPosition(HIRSOVA, 534, 350);
		map.setPosition(IASI, 473, 506);
		map.setPosition(LUGOJ, 165, 379);
		map.setPosition(MEHADIA, 168, 339);
		map.setPosition(NEAMT, 406, 537);
		map.setPosition(ORADEA, 131, 571);
		map.setPosition(PITESTI, 320, 368);
		map.setPosition(RIMNICU_VILCEA, 233, 410);
		map.setPosition(SIBIU, 207, 457);
		map.setPosition(TIMISOARA, 94, 410);
		map.setPosition(URZICENI, 456, 350);
		map.setPosition(VASLUI, 509, 444);
		map.setPosition(ZERIND, 108, 531);
	}
}
