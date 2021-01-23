public class GoldCoin {

	private static int coins;
	private final int coinNumber;
	
	public GoldCoin() {
	
		coinNumber = coins++;
	
	}

	public int getCoins(){
		return coins;
	}
	public int getCoinNumber(){
		return coinNumber;
	}
		
}
