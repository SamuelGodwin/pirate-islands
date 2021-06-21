import java.util.ArrayList;

public class TreasureChest {
	
	private GoldCoin[] coins;
	public static final int COINS_IN_CHEST = 18;
	private int lastCoin;
	
	public TreasureChest() {
		
		coins = new GoldCoin[COINS_IN_CHEST];
		
		for ( int coin = 0; coin < COINS_IN_CHEST; coin++ ) {
			
			coins[coin] = new GoldCoin();
			
		}
		
		lastCoin = coins.length - 1;
		
	}
	
	public GoldCoin takeOneGoldCoin() {
		
		if ( lastCoin >= 0 ) {
		
			GoldCoin coinToTake = coins[lastCoin];
			coins[lastCoin--] = null;
			return coinToTake;
		
		} else {
			
			return null;
			
		}
		
	}
	
}