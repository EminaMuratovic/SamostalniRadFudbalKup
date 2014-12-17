
public class Player {
	private String name;
	private String surname;
	private int jerseyNum;
	private Mark[] marks;
	
	/**
	 * creates player with all of the parameters
	 * @param name String name of the player
	 * @param surname String surname of the player
	 * @param jerseyNum int jersey number
	 * @param marks Mark[] marks of the player
	 */
	public Player(String name, String surname, int jerseyNum, Mark[] marks) {
		this.name = name;
		this.surname = surname;
		this.jerseyNum = jerseyNum;
		this.marks = marks;
	}
	
	/**
	 * copies one player to another
	 * @param newPlayer Player second player
	 */
	public Player(Player newPlayer) {
		this.name = newPlayer.name;
		this.surname = newPlayer.surname;
		this.jerseyNum = newPlayer.jerseyNum;
		this.marks = newPlayer.marks;
	}
	
	/**
	 * gets the name of the player
	 * @return name of the player
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * gets the surname of the player
	 * @return surname of the player
	 */
	public String getSurname() {
		return surname;
	}
	
	/**
	 * gets the jersey number of the player
	 * @return jersey number
	 */
	public int getJerseyNum() {
		return jerseyNum;
	}
	
	/**
	 * gets the marks of the player
	 * @return marks of the player
	 */
	public String getMarks() {
		String str = "";
		for(int i = 0; i < marks.length; i++)
			str += marks[i].toString();
		return str;
	}
	
	/**
	 * returns a string representation of the object
	 */
	public String toString() {
		String str = "";
		str += "\nName: " + name;
		str += "\nSurname: " + surname;
		str += "\nJersey number: " + jerseyNum;
		for(int i = 0; i < marks.length; i++)
			str += marks[i].toString();
		return str;
	}
	
	/**
	 * checks if all of the players from the second team are the same as in the first team
	 * @param other Player players from the second team
	 * @return true or false
	 */
	public boolean equals(Player other) {
		int counter = 0;
		if(this.name.equals(other.name) && this.surname.equals(other.surname) && this.jerseyNum == other.jerseyNum) {
			for(int i = 0; i < marks.length; i++){
				if(marks[i].equals(other.marks[i]))
					counter++;
			}
			if(counter == marks.length)
				return true;
		}
		return false;
	}

}
