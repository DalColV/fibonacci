import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para verificação: ");
        int number = scanner.nextInt();

        if (isFibonacci(number)) {
            System.out.println(number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(number + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean isFibonacci(int n) {
        int a = 0, b = 1;
        while (b < n) {
            int temp = b;
            b += a;
            a = temp;
        }
        return b == n;
    }
}
