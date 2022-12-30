package Desafios;

import java.util.Scanner;

public class LeituraGertrudes {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            int paginas = leitor.nextInt();
            int paginasLidas = 3;

            System.out.println(paginas / paginasLidas + " dias");
        }
    }
}
