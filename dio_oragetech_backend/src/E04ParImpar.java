import java.util.Scanner;

public class E04ParImpar {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Entre com a quantidade de números: ");
            final int quantidadeNumeros = scanner.nextInt();

            int count = 0, par = 0, impar = 0;
            do {

                System.out.print("Entre com um número: ");
                int numero = scanner.nextInt();
                count++;

                if (numero % 2 == 0) {
                    par++;
                } else {
                    impar++;
                }

            } while (count < quantidadeNumeros);
            System.out.println("Foram digitados " + par + " números pares");
            System.out.println("Foram digitados " + impar + " números ímpares");
        }
    }
}
