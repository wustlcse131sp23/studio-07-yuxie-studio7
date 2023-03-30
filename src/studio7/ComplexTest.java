package studio7;

public class ComplexTest {
    public static void main(String[] args) {
        // Create two instances of Complex
        Complex complex1 = new Complex(3, 2);
        Complex complex2 = new Complex(1, 7);

        // Test the add() method
        Complex sum = complex1.add(complex2);
        System.out.println("Sum: " + sum);

        // Test the multiply() method
        Complex product = complex1.multiply(complex2);
        System.out.println("Product: " + product);
        
    }

}

