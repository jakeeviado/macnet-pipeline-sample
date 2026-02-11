/**
 * Calculator Class - AI Generated Sample
 * Provides basic arithmetic operations
 */
public class Calculator {
    
    /**
     * Add two numbers together
     * 
     * @param a First number
     * @param b Second number
     * @return Sum of a and b
     */
    public static double add(double a, double b) {
        double result = a + b;
        return result;
    }
    
    /**
     * Subtract second number from first number
     * 
     * @param a First number
     * @param b Second number
     * @return Difference of a and b
     */
    public static double subtract(double a, double b) {
        double result = a - b;
        return result;
    }
    
    /**
     * Multiply two numbers together
     * 
     * @param a First number
     * @param b Second number
     * @return Product of a and b
     */
    public static double multiply(double a, double b) {
        double result = a * b;
        return result;
    }
    
    /**
     * Divide first number by second number
     * 
     * @param a First number (numerator)
     * @param b Second number (denominator)
     * @return Quotient of a and b
     * @throws ArithmeticException if b is zero
     */
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        double result = a / b;
        return result;
    }
    
    /**
     * Calculate the power of a number
     * 
     * @param base The base number
     * @param exponent The exponent
     * @return base raised to the power of exponent
     */
    public static double power(double base, double exponent) {
        double result = Math.pow(base, exponent);
        return result;
    }
    
    /**
     * Calculate the square root of a number
     * 
     * @param number The number to calculate square root for
     * @return Square root of the number
     * @throws IllegalArgumentException if number is negative
     */
    public static double squareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of negative number");
        }
        double result = Math.sqrt(number);
        return result;
    }
    
    /**
     * Main method - Example usage
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        // TODO: Demonstrate calculator functions
        
        // Initialize variables
        double num1 = 10.0;
        double num2 = 5.0;
        
        // Perform operations
        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));
        System.out.println("Division: " + divide(num1, num2));
        System.out.println("Power: " + power(num1, 2));
        System.out.println("Square Root: " + squareRoot(num1));
    }
}
