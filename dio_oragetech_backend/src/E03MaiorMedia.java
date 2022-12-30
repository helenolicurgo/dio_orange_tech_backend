import java.util.Scanner;

public class E03MaiorMedia {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numero, maior = 0, soma = 0;
            short count = 0;

            do {
                System.out.print("Entre com um número (Inteiro): ");
                numero = scanner.nextInt();
                count++;

                soma += numero;

                if (numero > maior) {
                    maior = numero;
                }

            } while (count < 5);

            System.out.println("O maior número é: " + maior);
            System.out.println("A média é: " + soma / 5);
        }
    }
}
