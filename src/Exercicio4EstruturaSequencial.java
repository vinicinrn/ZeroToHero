import java.util.Locale;
import java.util.Scanner;

public class Exercicio4EstruturaSequencial {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o numero de registro: ");
        double numeroRegistro = sc.nextDouble();

        System.out.println("Horas trabalhadas: ");
        double horasTrabalhadas = sc.nextDouble();

        System.out.println("Valor que recebe por hora: ");
        double valorHora = sc.nextDouble();

        double total = horasTrabalhadas * valorHora;
        System.out.println("O funcionário: " + numeroRegistro);
        System.out.println("Recebe salário: " + total + "reais");
    }
}

