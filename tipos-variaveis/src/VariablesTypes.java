import java.util.Scanner;

public class VariablesTypes {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String $name = scanner.nextLine();
        Short $age = scanner.nextShort();
        System.out.println("Hello, " + $name + "\nYour age is: " + $age);
    }
}