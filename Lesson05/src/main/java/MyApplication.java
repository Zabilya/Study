import java.util.Scanner;

/**
 * Класс main для класса FibonacciAPI
 * @author Заболотний Илья
 */
public class MyApplication {
    public static void main(String[] args) {

        FibonacciAPI fibonacciAPI = new FibonacciAPI();
        Scanner scanner = new Scanner(System.in);
        /**
         * Переменная, в которую запишется введенный пользователем
         * номер числа Фибоначчи
         */
        int fibonacciPosition;

        System.out.println("Введите номер числа Фибоначчи");

        fibonacciPosition = scanner.nextInt();

        System.out.println(fibonacciAPI.findFibonacciNumber(fibonacciPosition));

    }
}
