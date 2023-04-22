import java.util.Scanner;

public class Exercicio8 {   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o número de veículos: ");
        int veiculos = scanner.nextInt();

        System.out.println("Informe o número de rodas: ");
        int rodas = scanner.nextInt();
        
        int numerocarros = rodas / 4;
        int numeroMotos = veiculos  - numerocarros;
        
        scanner.close();

        System.out.println("Neste estacionamento temos " + numerocarros + " carros e " + numeroMotos + " motos.");
        
    }   
}
