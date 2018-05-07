import java.math.BigInteger;

/**
 * The Fibonacci number search class by the number entered by the user
 *
 * @author Заболотний Илья
 */
public class FibonacciAPI {

    /**
     *The method verify entered parameter
     *
     * @param fibonacciPosition - verifying parameter
     */
    private void verifyInputValue(Integer fibonacciPosition) {
        if (fibonacciPosition == null) {
            throw new IllegalArgumentException("the parameter == null");
        }
        if (fibonacciPosition < 0) {
            throw new IllegalArgumentException("you entered a negative number");
        } else if (fibonacciPosition > 200) {
            throw new IllegalArgumentException("you entered a number more then 200");
        }
    }

    /**
     * The method looks for the Fibonacci number by its position
     * Limits of the transmitted value: >0 && <47
     *
     * This method is the fastest method to find Fibonacci number in this class.
     *
     * If you go beyond the limits IllegalArgumentException will be thrown
     *
     * @param fibonacciPosition - position of required Fibonacci number
     * @return fibonacciNumber - required Fibonacci number
     */
    public int findFirst46FibonacciNumber(Integer fibonacciPosition) {
        verifyInputValue(fibonacciPosition);

        if (fibonacciPosition > 46){
            throw new IllegalArgumentException("This method has limits of the transmittesd value: <47");
        } else if (fibonacciPosition == 0){
            return 0;
        } else if (fibonacciPosition < 3){
            return 1;
        }

        int number1 = 1;
        int number2 = 1;
        int fibonacciNumber = 1;

        for (int i = 3; i <= fibonacciPosition; i++) {
            fibonacciNumber = number1 + number2;
            number1 = fibonacciNumber;
            number2 = fibonacciNumber - number2;
        }
        return fibonacciNumber;
    }

    /**
     * The method looks for the Fibonacci number by its position
     * Limits of the transmitted value: >0 && <93
     *
     * This method is not the fastest. If the position of Fibonacci number that you
     * are looking for is less than 47 use method findFirst46FibonacciNumber
     *
     * If you go beyond the limits IllegalArgumentException will be thrown
     *
     * @param fibonacciPosition - position of required Fibonacci number
     * @return fibonacciNumber - required Fibonacci number
     */
    public long findFirst92FibonacciNumber(Integer fibonacciPosition) {
        verifyInputValue(fibonacciPosition);

        if (fibonacciPosition > 92){
            throw new IllegalArgumentException("This method has limits of the transmittesd value: <93");
        } else if (fibonacciPosition == 0){
            return 0;
        } else if (fibonacciPosition < 3){
            return 1;
        }

        long number1 = 1;
        long number2 = 1;
        long fibonacciNumber = 1;

        for (int i = 3; i <= fibonacciPosition; i++) {
            fibonacciNumber = number1 + number2;
            number1 = fibonacciNumber;
            number2 = fibonacciNumber - number2;
        }
        return fibonacciNumber;
    }

    /**
     * The method looks for the Fibonacci number by its position
     * Limits of the transmitted value: >0 && <201
     *
     * The slowest method. If the position of Fibonacci number that you
     * are looking for is less than 93, use method findFirst92FibonacciNumber
     *
     * If you go beyond the limits IllegalArgumentException will be thrown
     *
     * @param fibonacciPosition - position of required Fibonacci number
     * @return fibonacciNumber - required Fibonacci number
     */
    public BigInteger findFibonacciNumber(Integer fibonacciPosition) {
        verifyInputValue(fibonacciPosition);

        if (fibonacciPosition == 0) {
            return new BigInteger("0");
        } else if (fibonacciPosition < 3) {
            return new BigInteger("1");
        }

        BigInteger number1 = new BigInteger("1");
        BigInteger number2 = new BigInteger("1");
        BigInteger fibonacciNumber = new BigInteger("1");

        for (int i = 3; i <= fibonacciPosition; i++) {
            fibonacciNumber = number1.add(number2);
            number1 = fibonacciNumber;
            number2 = fibonacciNumber.subtract(number2);
        }

        return fibonacciNumber;
    }

    /**
     * The method looks for the Fibonacci number by its position
     * with help of recursion
     * Limits of the transmitted value: >0 && <92
     *
     * Use this method to find numbers more then 50 only
     * when you want to kill your pc
     *
     * @param fibonacciPosition - position of required Fibonacci number
     * @return fibonacciNumber - required Fibonacci number
     */
    public long recursivelyFindFibonacci(int fibonacciPosition) {

        if (fibonacciPosition <= 2)
            return 1;
        long fibonacciNumber = recursivelyFindFibonacci(fibonacciPosition - 1)
                 + (recursivelyFindFibonacci(fibonacciPosition - 2));
        return fibonacciNumber;

    }
}
