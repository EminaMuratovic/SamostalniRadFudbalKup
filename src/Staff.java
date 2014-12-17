
public class Staff {
	private String name;
	private String surname;
	private String mail;
	private String role;
	
	/**
	 * creates a member of staff 
	 * @param name String name of the member
	 * @param surname String surname of the member
	 * @param mail String mail of the member
	 * @param role String role of the member in the team
	 */
	public Staff(String name, String surname, String mail, String role) {
		this.name = name;
		this.surname = surname;
		this.mail = mail;
		this.role = role;
	}
	
	/**
	 * copies one member to another
	 * @param other Staff second member
	 */
	public Staff(Staff other) {
		this.name = other.name;
		this.surname = other.surname;
		this.mail = other.mail;
		this.role = other.role;
	}

	/**
	 * gets the name of a member
	 * @return name of a member
	 */
	public String getName() {
		return name;
	}

	/**
	 * sets the name of a member
	 * @throws IllegalArgumentException("The member must have a name!")
	 * @param name String name of a member
	 */
	public void setName(String name) {
		if(isEmpty(name.length()))
			throw new IllegalArgumentException("The member must have a name!");
		else this.name = name;
	}

	/**
	 * gets the surname of a member
	 * @return surname of a member
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * sets the surname of a member
	 * @throws IllegalArgumentException("The member must have a surname!")
	 * @param surname String surname 
	 */
	public void setSurname(String surname) {
		if(isEmpty(surname.length()))
			throw new IllegalArgumentException("The member must have a surname!");
		else this.surname = surname;
	}

	/**
	 * gets the mail of the member
	 * @return mail of the member
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * sets the mail of the member
	 * @throws IllegalArgumentException("The member must have an e-mail!")
	 * @param mail String mail of the member
	 */
	public void setMail(String mail) {
		if(isEmpty(mail.length()))
			throw new IllegalArgumentException("The member must have an e-mail!");
		else this.mail = mail;
	}

	/**
	 * gets the role in the team of the member
	 * @return role in the team
	 */
	public String getRole() {
		return role;
	}

	/**
	 * sets the role in the team of the member
	 * @throws IllegalArgumentException("The member must have a role")
	 * @param role String role in the team
	 */
	public void setRole(String role) {
		if(isEmpty(role.length()))
			throw new IllegalArgumentException("The member must have a role");
		else this.role = role;
	}
	
	/**
	 * checks if the string is empty
	 * @param length int length of the string
	 * @return true or false (length < 1)
	 */
	private boolean isEmpty(int length) {
		return length < 1;
	}
	
	/**
	 *  returns a string representation of the object
	 */
	public String toString() {
		String str = "";
		str += "\nName: " + name;
		str += "\nSurname: " + surname;
		str += "\nE-mail: " + mail;
		str += "\nRole in the team: " + role;
		return str;
	}
	
	/**
	 * checks if all of the members of the two teams are the same
	 * @param other Staff members of the second team
	 * @return true or false
	 */
	public boolean equals(Staff other) {
		if(this.name.equals(other.name) && this.surname.equals(other.surname) && this.mail.equals(other.mail) && this.role.equals(other.role))
			return true;
		return false;
	}
	
	
	

}
