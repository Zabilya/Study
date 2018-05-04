import java.math.BigInteger;

/**
 * Класс поиска числа Фибоначчи по номеру, вводимому пользователем
 * @author Заболотний Илья
 */
public class FibonacciAPI {

    /**
     * Поле возвращаемого числа фибоначчи
     */
    BigInteger fibonacciNumber;

    /**
     * Метод ищет число Фиббоначчи по номеру
     * Ограничения передаваемого параметра: >0 && <201
     *
     * При выходе за рамки ограничение передаваемого параметра
     * выбрасывается IllegalArgumentException
     *
     * @param fibonacciPosition - номер числа Фибоначчи
     * @return fibonacciNumber - искомое число Фибоначчи
     */
    public BigInteger findFibonacciNumber(Integer fibonacciPosition){

        if (fibonacciPosition == null){
            throw new IllegalArgumentException("передан параметр == null");
        }
        if (fibonacciPosition < 0) {
            throw new IllegalArgumentException("вы ввели отрицательное число");
        }
        else if (fibonacciPosition == 0){
            return new BigInteger("0");
        }
        else if (fibonacciPosition < 3){
            return  new BigInteger("1");
        }
        else if (fibonacciPosition > 200){
            throw new IllegalArgumentException("вы ввели число большее 200");
        }

        BigInteger number1 = new BigInteger("1");
        BigInteger number2 = new BigInteger("1");

        for (int i = 3; i <= fibonacciPosition; i++) {
            fibonacciNumber = number1.add(number2);
            number1 = fibonacciNumber;
            number2 = fibonacciNumber.subtract(number2);
        }

        return fibonacciNumber;
    }
}
