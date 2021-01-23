public class TreasureChest {

	//A TreasureChest can hold 11 GoldCoins; a value that is fixed for all chests.
	//a treasure chest can hold 11 gold coins
	
	private GoldCoin[] treasureChest = new GoldCoin[10];
	
	// Static method can be accessed without an object being created of the class.
	public GoldCoin takeOneGoldCoin(){ 
		int temp = 0;
		GoldCoin coinTaken = new GoldCoin();
		int i = 0;
		//rather than using 'for each' because more freedom with an individual i
		while (i < 10) {
			
			if (treasureChest[i] == null){
				temp = i+1;
			}
			else if (i == 0) {
				temp = 0;
			}
		}
		if (temp > 9){
			temp = 9;
		}
		i++;
		coinTaken = treasureChest[temp];
		treasureChest[temp] = null;
		return coinTaken;
	}
	
	/*
		//WHILE there are still coins in the chest.....
		for  (GoldCoin coin : treasureChest ) {//for each of the 11 places in the chest
			for (GoldCoin coin : treasureChest ) {
		
				//if coin not null, take coin and set it equal null. otherwise move onto next coin until through all of the coin slots in the chest
			}
		}
	*/

}