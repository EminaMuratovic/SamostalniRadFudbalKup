
public class Mark {
	private double speed;
	private double pass;
	private double kicking;
	private double head;
	
	/**
	 * creates  mark with all of the parameters
	 * @param speed double mark for the speed of the player
	 * @param pass double mark for the passing the ball of the player
	 * @param kicking double mark for the kicking of the player
	 * @param head double mark for the kicking by head of the player
	 */
	public Mark(double speed, double pass, double kicking, double head) {
		this.speed = speed;
		this.pass = pass;
		this.kicking = kicking;
		this.head = head;
	}

	/**
	 * gets mark for the speed of the player
	 * @return mark for the speed
	 */
	public double getSpeed() {
		return speed;
	}

	/**
	 * sets the mark for speed of the player
	 * @throws IllegalArgumentException("The player must have mark for speed.") if the speed is out of range 0-100
	 * @param speed double mark for speed
	 */
	public void setSpeed(double speed) {
		if(outOfRange(speed)) {
			throw new IllegalArgumentException("The player must have mark for speed.");
		}
		else this.speed = speed;
	}

	/**
	 * gets the mark for passing the ball of the player
	 * @return mark for passing the ball
	 */
	public double getPass() {
		return pass;
	}

	/**
	 * sets the mark for passing the ball of the player
	 * @throws IllegalArgumentException("The player must have mark for passing.") if the speed is out of range 0-100
	 * @param pass double mark for passing
	 */
	public void setPass(double pass) {
		if(outOfRange(pass)) {
			throw new IllegalArgumentException("The player must have mark for passing.");
		}
		else this.pass = pass;
	}

	/**
	 * gets the mark for kicking the ball of the player
	 * @return mark for kicking 
	 */
	public double getKicking() {
		return kicking;
	}

	/**
	 * sets the mark for kicking the ball of the player
	 * @throws IllegalArgumentException("The player must have mark for kicking the ball.") if the speed is out of range 0-100
	 * @param kicking double mark for kicking
	 */
	public void setKicking(double kicking) {
		if(outOfRange(kicking)) {
			throw new IllegalArgumentException("The player must have mark for kicking the ball.");
		}
		else this.kicking = kicking;
	}

	public double getHead() {
		return head;
	}

	/**
	 * sets the mark for kicking the ball with head of the player
	 * @throws IllegalArgumentException("The player must have mark for kicking the ball with head.") if the speed is out of range 0-100
	 * @param head double mark for kicking the ball with head
	 */
	public void setHead(double head) {
		if(outOfRange(head)) {
			throw new IllegalArgumentException("The player must have mark for kicking the ball with head.");
		}
		else this.head = head;
	}
	
	/**
	 * checks if the number is out of range
	 * @param number double given number
	 * @return true or false (number < 0 || number > 100)
	 */
	private boolean outOfRange(double number) {
		return number < 0 || number > 100;
	}
	
	/**
	 * returns a string representation of the object
	 */	
	public String toString() {
		String str = "";
		str += "\nMark for speed: " + speed;
		str += "\nMark for passing: " + pass;
		str += "\nMark for kicking the ball: " + kicking;
		str += "\nMark for kicking the ball with head: " + head;
		
		return str;
	}
	
	/**
	 * checks if all of the marks are the same
	 * @param other Mark other marks
	 * @return true or false
	 */
	public boolean equals(Mark other) {
		if(this.speed == other.speed && this.pass == other.pass && this.kicking == other.kicking && this.head == other.head)
			return true;
		return false;
	}
	

}
