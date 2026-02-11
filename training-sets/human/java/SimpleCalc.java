public class SimpleCalc {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) throws ArithmeticException {
        if (b == 0) throw new ArithmeticException("Division by zero");
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println("5 + 3 = " + add(5, 3));
        System.out.println("10 - 4 = " + subtract(10, 4));
        System.out.println("6 * 7 = " + multiply(6, 7));
        try {
            System.out.println("8 / 2 = " + divide(8, 2));
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }
    }
}
