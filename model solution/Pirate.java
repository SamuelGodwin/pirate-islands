public class Pirate {
	
	private String name;
	private GoldCoin[] purse;
	private Island[] map;
	private int nextIndex;
	
	public Pirate(String name, Island[] map) {
		
		this.name = name;
		this.map = map;
		purse = new GoldCoin[1000];
		
	}
	
	public Island search(String name) {
		
		for ( Island currentIsland : map ) {
		
			if ( currentIsland.getName().equalsIgnoreCase(name.toLowerCase()) ) {
				
				return currentIsland;
				
			}
		
		}
		
		return null;
		
	}
	
	
	public boolean getTreasure(Island island) {
		
		for ( int location = 0; location < island.getBuryLocations(); location++ ) {
			
			TreasureChest dugChest = island.dig(location);
			
			if ( dugChest != null ) {
				
				extractCoins(dugChest);
				return true;
				
			}
			
		}
		
		return false;
		
	}
	
	private void extractCoins(TreasureChest treasureChest) {
		
		for ( int coin = 0; coin < TreasureChest.COINS_IN_CHEST; coin++ ) {
			
			GoldCoin extractedCoin = treasureChest.takeOneGoldCoin();
			
			if ( extractedCoin != null ) {
				
				purse[nextIndex++] = extractedCoin;
				
			}
			
		}
		
	}
	
	public int totalCoins() {
		
		return nextIndex;
				
	}
	
	public static void speak(String phrase) {
		
		String[] phrases = { ", arr!", ", shiver me timbers!" };
		
		System.out.println(phrase + phrases[(int)(Math.random() * phrases.length)]);
		
	}
	
}
