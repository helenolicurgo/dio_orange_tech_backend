package ExerciciosAulas;

import java.util.Scanner;

public class Ex02Nota {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            byte nota;

            System.out.print("Entre com uma nota entre 0 e 10: ");
            nota = scanner.nextByte();

            while (nota < 0 || nota > 10) {
                System.out.print("Nota inválida. Digite novamente: ");
                nota = scanner.nextByte();
            }
        }
    }
}
