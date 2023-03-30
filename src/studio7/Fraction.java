package studio7;

public class Fraction {
	private int numerator;
	private int denominator;

	public Fraction(int inin, int inid) {
		numerator = inin ;
		denominator = inid ; 
	}

	// Add
	public Fraction add(Fraction b) {
		int de = b.denominator * denominator ;
		int nu = b.numerator * denominator + b.denominator * numerator;

		Fraction c = new Fraction(nu, de);
		return c; 
	}

	// Multiple
	public Fraction multiple(Fraction b) {
		int de = b.denominator * denominator ;
		int nu = b.numerator  * numerator;

		Fraction c = new Fraction(nu, de);
		return c; 
	}

	// Reciprocal 
	public Fraction reciprocal() {
		int de = numerator ;
		int nu = denominator;
		Fraction c = new Fraction(nu, de);
		return c; 
	}

	// Simplified
	public Fraction simplified() {

		while (numerator % 2 != 0 || numerator % 3 != 0 || denominator % 2 != 0 || denominator % 3 != 0 )
		{
			if(numerator % 2 == 0 && denominator % 2 == 0) {

				numerator = numerator/2;
				denominator = denominator /2 ;
			}

			if(numerator % 3 == 0 && denominator % 3 == 0) {
				numerator = numerator/3;
				denominator = denominator /3 ;
			}
		}
		Fraction c = new Fraction(numerator, denominator);
		return c;
	}
	// Test 
	public static void main(String[] args) {
		Fraction p1 = new Fraction(20, 30);
		Fraction p2 = new Fraction(7, 30);
		//System.out.print(p1.denominator);
		System.out.print(p1.add(p2).denominator);
		// System.out.print(p1.multiple(p2));
	}
}