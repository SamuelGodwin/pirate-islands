import java.util.Scanner;

public class TreasureHunt {

	public static void main(String[] args) {

		Island[] map = { new Island("Nassau", 12), new Island("Havana", 12), new Island("St Kitts", 12) };
		
		Pirate pirate = new Pirate("Captain Chapman", map);
		
		Scanner in = new Scanner(System.in);
		
		String userInput;
		
		do {
			
			Pirate.speak("Enter island name: ");
			
			userInput = in.nextLine();
			
			if ( !userInput.equals("Stop") ) {
				
				if ( pirate.search(userInput) != null ) {
					
					if ( pirate.getTreasure(pirate.search(userInput)) ) {
						
						Pirate.speak("Found treasure on: " + userInput);
						Pirate.speak("Coins in purse : " + pirate.totalCoins());
						
					} else {
						
						Pirate.speak("No treasure found on " + userInput);
						
					}
					
				} else {
					
					Pirate.speak("No island found with name: " + userInput);
					
				}
			
			}
			
		} while ( !userInput.equals("Stop") );
		
		in.close();
		
	}
	
}
