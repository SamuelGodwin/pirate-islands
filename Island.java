
public class Island {

	private String name;
	private TreasureChest[] locations;
	
	public Island(String name, int locations) {
		
		this.name = name;
		this.locations = new TreasureChest[locations];
		
		this.locations[(int)(Math.random() * this.locations.length)] = new TreasureChest();
		
	}
	
	public TreasureChest dig(int digLocation) {
		
		if ( digLocation > 0 && digLocation < locations.length ) {
			
			TreasureChest dugChest = locations[digLocation];
			locations[digLocation] = null;
			return dugChest;
			
		} else {
		
			return null;
	    
		}
		
	}
	
	public String getName() {
		
		return name;
		
	}
	
	public int getBuryLocations() {
		
		return locations.length;
		
	}
	
}
