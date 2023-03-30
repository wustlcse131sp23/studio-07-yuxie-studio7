package studio7;

public class Die {
	private int n;

	// Constructor
	public Die(int initn) {
		n = initn;
	}

	// Flip
	public int filp() {
		int a = (int) (Math.random()* n + 1);
		return a;
	}

	public static void main(String[] args) {
		Die p1 = new Die(6);
		System.out.print(p1.filp());
	}
}