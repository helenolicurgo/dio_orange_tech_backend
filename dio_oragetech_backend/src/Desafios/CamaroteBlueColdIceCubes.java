package Desafios;

import java.util.Scanner;

public class CamaroteBlueColdIceCubes {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            int tamanhoDaFila = leitor.nextInt();
            int pessoasNoCamarote = tamanhoDaFila / 2;

            if (tamanhoDaFila % 2 != 0) {
                pessoasNoCamarote++;
            }
            System.out.println(pessoasNoCamarote + " pessoas no camarote");
        }
    }
}
