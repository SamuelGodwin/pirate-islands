import java.util.Random;

public class Island {

	private String name;

	//they are all TreasureChest types so if one has not been passed a TreasureChest, it will be null. this is how I will check with it, whether there is a chest.
	private TreasureChest[] locations = new TreasureChest[19];

	public Island(String name){
		this.name = name;
		// When an Island is first created, a TreasureChest should be buried at one of these locations, chosen at random by the program
		Random rnd = new Random();
		//i = rnd.nextInt(6);
	
		locations[rnd.nextInt(6)] = new TreasureChest();
	}
	
	
	public TreasureChest dig(int suppliedInt){
		
		//Appropriate steps should be taken to ensure that the integer supplied corresponds to one of the available 
		//locations on the island, and if it does not, then, again, no chest should be returned (1 mark). 
		if ( 0 <= suppliedInt && suppliedInt < locations.length) {
		
			//if the location is not null, that means a treasure chest was put here
			if (locations[suppliedInt] != null){
				
				//If, after digging, a location contains a treasure chest, this should be removed from the island and returned as a result of the dig
			
				TreasureChest temp = locations[suppliedInt];
				
				//remove the treasure chest from the island
				locations[suppliedInt] = null;
			
				return temp;
			}
			
			//If a location does not contain a buried treasure chest, then, naturally, no chest should be returned
			else {
				
				return null;
			}
		}
		
		else {
			//then, again, no chest should be returned
			return null;
		}
	}
	

	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getName() {
		
		return name;
	}
	
	
}