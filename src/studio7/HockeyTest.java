package studio7;

public class HockeyTest {
    public static void main(String[] args) {
        // Create two instances of HockeyPlayer
        HockeyPlayer player1 = new HockeyPlayer("Yunchang Xie", 2, "Right", "Right");
        HockeyPlayer player2 = new HockeyPlayer("Anthony Yu", 7, "Left", "Left");

        // Record games for each player
        player1.recordGame(2, 1);
        player1.recordGame(1, 3);
        player2.recordGame(0, 2);
        player2.recordGame(3, 0);

        // Print out the player objects using the toString() method
        System.out.println("Player 1: " + player1);
        System.out.println("Player 2: " + player2);

        // Test the getTotalPoints() and getPointsPerGame() methods
        System.out.println("Player 1 total points: " + player1.getTotalPoints());
        System.out.println("Player 1 points per game: " + player1.getPointsPerGame());
        System.out.println("Player 2 total points: " + player2.getTotalPoints());
        System.out.println("Player 2 points per game: " + player2.getPointsPerGame());
    }
}
