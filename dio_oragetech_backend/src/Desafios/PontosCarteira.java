package Desafios;

import java.util.Scanner;

public class PontosCarteira {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            int velocidade = leitor.nextInt();
            int multas = leitor.nextInt();
            String saida = "";

            if (velocidade <= 80) {
                multas += 0;
            } else {
                multas += 1;
            }

            if (multas >= 3) {
                saida = multas + " multas. Levou pontos na carteira";
            } else {
                saida = multas + " multas. Nao levou pontos na carteira";
            }
            System.out.println(saida);
        }
    }
}
