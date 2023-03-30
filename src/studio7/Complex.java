package studio7;

public class Complex {
    private double real;
    private double imaginary;
    
    /**
	 * Constructs a complex with its type.
	 *
	 * @param real         Real type of complex.
	 * @param imaginary    Imaginary type of complex.
	 */
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    
    /**
	 * Returns the sum.
	 *
	 */
    public Complex add(Complex other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new Complex(newReal, newImaginary);
    }
    
    /**
	 * Returns the product.
	 *
	 */
    public Complex multiply(Complex other) {
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(newReal, newImaginary);
    }

    public String toString() {
        return this.real + " + " + this.imaginary + "i";
    }
}

