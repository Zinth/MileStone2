
/** Program: Mile Stone 2: NFLPlayerClass
* File: DriverMethod.java
* Summary: This class is designed test the functionality of the NFLPlayer class.
* Author: Chris Hyde
* Date: November 17, 2017 
**/

public class DriverMethod {

	public static void main(String[] args) {
		// Run the driver method. 
		driver();

	}
	
	
	//Method Driver - A method to test functionality of the NFLPlayer Class
	public static void driver() {
		// Test the no-args constructor : only test with no-args
		NFLPlayers playerNoArg = new NFLPlayers();
		
		// Test the constructor with args (firstName, lastName, team, position, weight, age, heightFeet, heightInchs, yearsPlayed, teamNumber, gamesWon, gamesMissed, proBowls)
		NFLPlayers playerArgs = new NFLPlayers("John", "Smith", "Silly Nanies", "Running Back", 210, 24, 6, 2, 3, 54, 27, 5, 0);
		
		//Test the toString override without arguments
		System.out.println(playerNoArg + "\n\n");
		
		//Test the toString override with arguments
		System.out.println(playerArgs + "\n\n");
		
		//Test Setter for gamesWon and Getters for gamesWon and gameLost
		playerArgs.setGamesWon(6);
		System.out.println("playerArgs gamesWon: " + playerArgs.getGamesWon() + "\n");
		System.out.println("playerArgs gamesLost: " + playerArgs.getGamesLost() + "\n");
		
		//Test changing number of seasonsPlayed
		playerArgs.setSeasonsPlayed(2);
		System.out.println("playerArgs seasonsPlayed: " + playerArgs.getSeasonsPlayed() + "\n");
		
		//Test changing number of teamNumber
		playerArgs.setTeamNumber(34);
		System.out.println("playerArgs teamNumber: " + playerArgs.getTeamNumber() + "\n");
		
		//Test changing number of seasonsPlayed
		playerArgs.setWeight(210);
		System.out.println("playerArgs weight: " + playerArgs.getWeight() + "\n");
		
		//Test changing number of seasonsPlayed
		playerArgs.setGamesMissed(13);
		System.out.println("playerArgs gamesMissed: " + playerArgs.getGamesMissed() + "\n");
		
		//Test to make sure total number of games calculated right by getting the result a different way.
		if (playerArgs.getGamesPlayed() == playerArgs.getGamesWon() + playerArgs.getGamesLost()) {
			System.out.println("The getGamesPlayed getter functions correctly: " + playerArgs.getGamesPlayed() + "total games played\n");
		}
		else {
			// Print an error if not correct. 
			System.out.println("ERROR: The getGamesPlayed getter functions incorrectly" + "\n");
		}
		
		//Test setters for and getters for Name.
		String tempName = playerArgs.getFirstName() + " " + playerArgs.getLastName();// place holder for the original name
		playerArgs.setFirstName("Alan"); //setter for changing the name
		playerArgs.setLastName("Collins");
		System.out.println(tempName + " name has been changed to " + playerArgs.getFirstName() + " " + playerArgs.getLastName() +"\n"); //output result
		
		// Test setter for and getter for Name.
		String tempTeam = playerArgs.getTeam(); // place holder for the original team
		playerArgs.setTeam("The Ravens"); //setter for changing the team
		System.out.println(tempTeam + " name has been changed to " + playerArgs.getTeam() + "\n"); //output result
		
		//Test the overridden toString() again with changes
		System.out.println(playerArgs);
		
	}

}
