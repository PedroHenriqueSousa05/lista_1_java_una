import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o salário do vendedor: ");
        double salario = scanner.nextDouble();
        
        System.out.print("Digite o valor total das vendas deste vendedor no mês: ");
        double vendas = scanner.nextDouble();

        System.out.print("Digite o percentual do valor de vendas que o funcionario recebe: ");
        double pencentual = scanner.nextDouble();

        double valorVendas = (vendas * pencentual) / 100;

        System.out.println("O salário total do vendedor é: " + (salario + valorVendas));
        scanner.close();
    }
}
