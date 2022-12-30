import java.util.Scanner;

public class Ex01NomeIdade {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String nome;
            short idade;

            while (true) {
                System.out.println("Nome: ");
                nome = scanner.next();
                if (nome.equals("0")) {
                    break;
                }
                System.out.println("Idade: ");
                idade = scanner.nextShort();
                System.out.println("Bom dia " + nome + ", você tem " + idade);
            }
        }
    }
}
