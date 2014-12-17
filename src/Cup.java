
public class Cup {	
	
	private int numTeams = 0;
	private Team[] Cup = new Team[5];
	
	/**
	 * In this main we are adding teams in the Cup
	 * Then we start the game
	 * First team plays with the last team
	 * The team who has the most poents wins, the other gets thrown out from the Cup
	 */
	public static void main(String[] args) {

		
		
		
	}

	
	/**
	 * adds a team in the Cup
	 * @param newTeam Team new Team
	 */
	public void addTeam(Team newTeam) {
		Cup[numTeams] = new Team(newTeam);
		numTeams++;
	}
	
	/**
	 * throws out the team from the Cup
	 * @param newTeam Team 
	 */
	public void throwOutTheTeam(Team newTeam) {
		for(int i = 0 ; i < numTeams; i++) {
			if(Cup[i].equals(newTeam)) {
				for(int j = 0; j < numTeams - 1; j++)
					Cup[j] = Cup[j+1];
				
			}
		}
	}
	
	/**
	 * creates whole Cup, gets every team in the cup
	 * @return Cup
	 */
	public Cup addTeamsIntoTheCup() {
		
		
		
	}

}
