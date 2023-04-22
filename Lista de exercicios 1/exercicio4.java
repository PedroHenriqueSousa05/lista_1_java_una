import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor, informe o valor do capital: ");
        double capital = scanner.nextDouble();
        
        System.out.print("Por favor, informe o prazo de aplicação em meses: ");
        int prazo = scanner.nextInt();
        
        System.out.print("Por favor, informe a taxa de juros mensal: ");
        double taxa = scanner.nextDouble();
        
        //double montante = capital * Math.pow(1 + taxa, prazo);
        
        scanner.close();
        
        System.out.println("Montante a ser recebido: " + (capital * Math.pow(1 + taxa, prazo)));
    }
}
