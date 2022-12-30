package Desafios;

import java.util.Scanner;

public class LojinhaDoces {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            int doce = leitor.nextInt();

            System.out.println("O cliente obteve " + doce * 2 + " doces");
        }
    }
}
