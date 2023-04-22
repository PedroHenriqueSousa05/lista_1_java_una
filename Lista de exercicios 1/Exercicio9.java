import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe um número de segundo: ");
        float num1 = scanner.nextInt();

        float horas = num1 / 3600;
        float minutos = (num1 % 3600) / 60;
        
        
        scanner.close();
        System.out.printf("O numero iquivale a %.2f horas e %.2f minutos", horas, minutos);

    }
}
