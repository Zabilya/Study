import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Заболотний Илья
 */
public class MyApplication {
    public static void main(String[] args) {

        FibonacciAPI fibonacciAPI = new FibonacciAPI();
        Scanner scanner = new Scanner(System.in);

        int fibonacciPosition;

        System.out.println("Введите номер числа Фибоначчи");

        fibonacciPosition = scanner.nextInt();

        long timer = System.nanoTime();
//        System.out.println(fibonacciAPI.findFibonacciNumber(fibonacciPosition));
//        System.out.println(fibonacciAPI.findFirst46FibonacciNumber(fibonacciPosition));
//        System.out.println(fibonacciAPI.findFirst92FibonacciNumber(fibonacciPosition));
        System.out.println(fibonacciAPI.recursivelyFindFibonacci(fibonacciPosition));
        long timer1 = System.nanoTime() - timer;
        System.out.println(timer1);


    }
}
