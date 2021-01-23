import java.util.Random;

public class Pirate {

	private String name;
	private GoldCoin[] purse = new GoldCoin[10];
	private Island[] map = new Island[11];

	
	
	
	public Pirate(String name){
		
		this.name = name;
	}
	
	
	public Island search(String nameOfIslandThatContainsTreasure){
		
		//The pirate then searches for an Island on their map with this name.
		for (Island island : map ) {
			
			//If an island with this name is not found on the pirate's map, then a negative result is returned, otherwise the result is the correct Island.
			if (island.getName() != nameOfIslandThatContainsTreasure){
				return null;
			}
			else {
				
				//Island temp = map[suppliedInt];
				
			
				//return null;
			}
		}
		return null;
	}
	
	public boolean getTreasure() {
		
		Island island = new Island("island1");
		
		/*
		// for each location in the locations array from Island class
		for (TreasureChest location : locations ) {

			//so maybe dig should be static!
			if (island.dig() == null){
				
				return false;
			}
		
			else {
				
				do {
				//takeOneGoldCoin() method also static?
				TreasureChest.takeOneGoldCoin();
				//and places these coins into their own purse
				
				}
				while (locations.length != 0);	//until all of the GoldCoins are taken,
			}
		}
		*/
		//Once this is done, the treasure is obtained, and the result is positive.
	
		return false;
	}


	public void speak(String phrase){
		Random rnd = new Random();
		//i = rnd.nextInt(5);
		String[] suffixes = {", arrr!", ", shiver me timbers!", ", avast!", ", ahoy, matey!", ", yo, ho ho!"};
		System.out.println(phrase + suffixes[rnd.nextInt(5)]);

	}

	public void setName(String name) {
		this.name = name;
	}
	
}
