
public class Team {
	private Player[] players;
	private String city;
	private String name;
	private Staff[] staff;
	private int numPlayers;
	private int numStaff;
	
	/**
	 * creates the team 
	 * @param name String name of the team
	 * @param city String name of the city the team comes from
	 */
	public Team(String name, String city) {
		this.name = name;
		this.city = city;
		players = new Player[11];
		staff = new Staff[2];
		numPlayers = 0;
		numStaff = 0;
	}
	
	/**
	 * copies one team to another
	 * @param newTeam Team second team
	 */
	public Team(Team newTeam) {
		this.name = newTeam.name;
		this.city = newTeam.city;
		this.players = newTeam.players;
		this.staff = newTeam.staff;
	}
	
	/**
	 * adds a player into the team
	 * @param player Player new player
	 */
	public void addPlayers(Player newPlayer) {
		players[numPlayers] = new Player(newPlayer);
		numPlayers++;
	}
	
	/**
	 * adds a member of the staff into the team
	 * @param newStaff Staff new member
	 */
	public void addStaff(Staff newStaff) {
		staff[numStaff] = new Staff(newStaff);
		
		if(numStaff == staff.length)
			resizeStaff();
		
	}
	
	/**
	 * resizes the length of the staff
	 */
	public void resizeStaff() {
		int newLength = 2 * this.staff.length;
		Staff[] temp = new Staff[newLength];
		for(int i = 0; i < staff.length; i++)
			temp[i] = staff[i];
		this.staff = temp;
	}
	
	/**
	 *  returns a string representation of the object
	 */
	public String toString() {
		String str = "";
		str += name;
		str += city;
		str += "\n";
		str += "Players: \n";
		for(int i = 0; i < numPlayers; i++)
			str += players[i].toString();
		str += "\nStaff: \n";
		for(int j = 0; j < numStaff; j++)
			str += staff[j].toString();
		
		return str;
	}
	
	public boolean equals(Team other) {
		int counterPlayers = 0;
		if(this.name.equals(other.name) && this.city.equals(other.city)) {
			for(int i = 0; i < players.length; i++)
				if(this.players[i].equals(other.players[i])) 
					counterPlayers++;
			if(counterPlayers == players.length)
				return true;
		}
		return false;
	}
	
	

}
