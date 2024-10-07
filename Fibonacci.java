import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int valorTeste = scanner.nextInt();
        scanner.close();

        if (SequenciaFibonacci(valorTeste)) {
            System.out.println(valorTeste + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(valorTeste + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean SequenciaFibonacci(int valor) {
        if (valor == 0 || valor == 1) {
            return true;
        }

        int a = 0, b = 1;
        while (b < valor) {
            int next = a + b;
            a = b;
            b = next;
        }

        return b == valor;
    }
}
