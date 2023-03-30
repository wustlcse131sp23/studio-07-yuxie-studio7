package studio7;

public class HockeyPlayer {
	private String name;
	private int jerseyNumber;
	private String shootingHand;
	private String handedness;
	private int goals;
	private int assists;
	private int gamesPlayed;

	/**
	 * Constructs a hockey player object with the specified parameters.
	 *
	 * @param name         The player's name.
	 * @param jerseyNumber The player's jersey number.
	 * @param shootingHand The player's shooting hand.
	 * @param handedness   The player's handedness.
	 */
	public HockeyPlayer(String name, int jerseyNumber, String shootingHand, String handedness) {
		this.name = name;
		this.jerseyNumber = jerseyNumber;
		this.shootingHand = shootingHand;
		this.handedness = handedness;
		this.goals = 0;
		this.assists = 0;
		this.gamesPlayed = 0;
	}

	/**
	 * Records the player's performance after completing a game.
	 *
	 * @param goals   The number of goals scored in the game.
	 * @param assists The number of assists made in the game.
	 */
	public void recordGame(int goals, int assists) {
		this.goals += goals;
		this.assists += assists;
		this.gamesPlayed++;
	}

	/**
	 * Returns the total number of points earned by the player.
	 *
	 * @return The sum of goals and assists.
	 */
	public int getTotalPoints() {
		return this.goals + this.assists;
	}
	
	/**
	 * Returns the average number of points earned by the player per game.
	 *
	 * @return The average points per game, as a double.
	 */
	public double getPointsPerGame() {
		if (this.gamesPlayed == 0) {
			return 0.0;
		}
		return (double) getTotalPoints() / this.gamesPlayed;
	}
	
	/**
	 * Returns a string representation of the hockey player object.
	 *
	 * @return A string containing the player's name, jersey number, shooting hand, handedness, goals, assists, and games played.
	 */
	
	public String toString() {
		return "HockeyPlayer{" +
			"name='" + name + '\'' +
			", jerseyNumber=" + jerseyNumber +
			", shootingHand='" + shootingHand + '\'' +
			", handedness='" + handedness + '\'' +
			", goals=" + goals +
			", assists=" + assists +
			", gamesPlayed=" + gamesPlayed +
			'}';
	}
	
}
