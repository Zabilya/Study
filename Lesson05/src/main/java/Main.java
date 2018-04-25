public class Main {
    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        int num = fib.chooseNumber();
        System.out.println(fib.findFibo(num));
    }
}
