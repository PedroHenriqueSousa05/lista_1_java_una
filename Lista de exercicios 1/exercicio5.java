import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        double horas = scanner.nextDouble();
        
        System.out.print("Digite o valor recebido por hora de trabalho: ");
        double valorHora = scanner.nextDouble();
        
        System.out.print("Digite o valor do salário família: ");
        double salarioFamilia = scanner.nextDouble();
        
        System.out.print("Digite o número de filhos com idade menor que 14 anos: ");
        int numeroFilhos = scanner.nextInt();
        
        double salarioBruto = (horas * valorHora) + (salarioFamilia * numeroFilhos);
        
        System.out.println("O salário bruto de " + nome + "a ser recebido: " + salarioBruto);
        
        scanner.close();
    }   
}
