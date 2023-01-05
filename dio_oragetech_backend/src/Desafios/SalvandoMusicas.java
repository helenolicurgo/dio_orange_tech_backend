package Desafios;

import java.util.Scanner;

public class SalvandoMusicas {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            String arquivoDoPc = leitor.next();

            char[] ext = new char[3];
            arquivoDoPc.getChars(arquivoDoPc.length() - 3, arquivoDoPc.length(), ext, 0);
            String action = String.copyValueOf(ext).equals("mp3") ? "Salvar" : "Deletar";
            System.out.println(action);
        }
    }
}
