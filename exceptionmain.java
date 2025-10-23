

public class exceptionmain {
  public static void divideNumbers(int dividend, int divisor) {
    if (divisor == 0) {
      throw new ArithmeticException("Division by zero");
    }
    int result = dividend / divisor;
    System.out.println("Result: " + result);
  }

  public static void calculate(int dividend, int divisor) {
    try {
      divideNumbers(dividend, divisor);
    } catch (ArithmeticException e) {
      throw new RuntimeException("Error in calculate() method", e);
    }
  }

  public static void main(String[] args) {
    int dividend = 10;
    int divisor = 0;

    try {
      calculate(dividend, divisor);
    } catch (RuntimeException e) {
      System.out.println("Caught RuntimeException: " + e.getMessage());
      System.out.println("Original cause: " + e.getCause());
    }
  }
}
