import java.util.Scanner;

public class VerificaLetraA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();
        scanner.close();

        int contadorA = contaLetraA(input);

        if (contadorA > 0) {
            System.out.println("A letra 'a' aparece " + contadorA + " vez(es) na string.");
        } else {
            System.out.println("A letra 'a' não aparece na string.");
        }
    }

    public static int contaLetraA(String str) {
        int contaLetra = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'A') {
                contaLetra++;
            }
        }
        return contaLetra;
    }
}