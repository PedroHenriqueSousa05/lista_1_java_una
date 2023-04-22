import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro valor: ");
        double val1 = scanner.nextDouble();

        System.out.println("Informe o segundo valor: ");
        double val2 = scanner.nextDouble();

        System.out.println("Informe o terceiro valor: ");
        double val3 = scanner.nextDouble();
        
        double mediaAr = (val1 + val2 + val3) / 3;
        double mediaGeo = Math.sqrt((val1 * val2 * val3));
        double mediaHar = 3 / ((1 / val1) + (1 / val2) + (1 / val3));

        scanner.close();
        System.out.printf("Média aritmética: %.2f  \nMédia geométrica: %.2f  \nMédia Harmônica: %.2f", mediaAr, mediaGeo, mediaHar);
    }
}
