import java.util.Scanner;

public class Exercicio1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite um outro valor: ");
        double num2 = scanner.nextDouble();

        double media = (num1 + num2) / 2;

        scanner.close();
        System.out.println("A média aritmética dos valores é: " + media );

    }
}
