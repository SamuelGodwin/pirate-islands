import java.util.Scanner;

public class TreasureHunt {

	public static void main(String[] args) {
	
	
		Island[] map = new Island[3];
		map[0].setName("Dominica");
		map[1].setName("Nassau");
		map[2].setName("Havana");
		
		
		Pirate pirate = new Pirate("[pirate's name]");
		
		Scanner in = new Scanner(System.in);	
		
		TreasureChest[] locations = new TreasureChest[19];

		
		//A user should be able to continuously suggest the names of islands to the pirate, until they enter the word stop
		
		do {
			//	Prints message asking user to enter name for Scanner.
			pirate.speak("\nSuggest the name of an island to the pirate, who will then search for this island on their map for some gold for ye'! Enter 'stop' to exit at any time");
			
			if (in.nextLine().equals("stop") == false) {
				//	Takes 'String' input from user, and sets it to the 'name' field in the 'player' object
				if (pirate.search(in.nextLine()) == null){
					pirate.speak("The suggested island could not be found");
				}
				
				else if (pirate.search(in.nextLine()) != null ) {
					//getTreasure from this island ((If any is buried there))
				}
			
				//If a chest is found, print which island the chest was found upon, and the new total coins in the pirate's purse.

				//If a chest is not found, print that the suggested island did not contain any treasure.
				
				}
			
			else {
				//	break out of loop, the input from user is "stop".
				break;
			}
		}
		while (in.nextLine().equals("stop") == false);
	
	}

}
