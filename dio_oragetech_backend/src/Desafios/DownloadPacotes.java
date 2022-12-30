package Desafios;

import java.util.Scanner;

public class DownloadPacotes {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            int tamanho = leitor.nextInt();
            String contador = "/";

            for (int i = 1; i <= tamanho; i++) {
                System.out.print(contador);
            }
        }
    }
}
