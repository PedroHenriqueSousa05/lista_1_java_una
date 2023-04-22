import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor, informe uma temperatura em graus Fahrenheit: ");
        double num1 = scanner.nextFloat();
        
        double conversao = ((num1 - 32) / 1.8);
        scanner.close();
        
        System.out.println("A temperatura informa convertida em graus centígrados é: " + conversao);

    }
}

