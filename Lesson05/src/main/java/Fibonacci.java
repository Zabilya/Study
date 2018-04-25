import java.util.Scanner;

public class Fibonacci {
    Scanner scanner = new Scanner(System.in);


    public int chooseNumber(){
        return scanner.nextInt();
    }

    public int findFibo(int number){
        int first = 1;
        int second = 1;
        int sum = 1;
        if (number <= 0)
            return 0;
        else if (number <= 2)
            return 1;
        for (int i = 3; i <= number; i++) {
            sum = first + second;
            first = sum;
            second = sum - second;

        }
        return sum;
    }
}
