import java.util.Scanner;
public class Exercicio2 {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor, informe um número: ");
        float num1 = scanner.nextFloat();
        
        float porcentagem = (num1 * 10 / 100);
        scanner.close();
        
        System.out.println("O número informado acrescido de 10% é: " + (num1 + porcentagem));
        
    }
}
