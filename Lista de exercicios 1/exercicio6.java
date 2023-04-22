import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double base = scanner.nextDouble();
        
        double resultado = Math.log(numero1) / Math.log(base);
        
        System.out.println("Logaritmo de " + numero1 + " na base " + base + " = " + resultado);
        
        scanner.close();
    }
}
