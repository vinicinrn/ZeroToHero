import java.util.Locale;
import java.util.Scanner;

public class TreinoA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double xA, xB, xC;
        double yA, yB, yC;

        System.out.println("Entre com as medidas do triângulo A: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Entre com as medidas do triângulo B: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB + xC)/2;
        double areaX = Math.sqrt(p*(p-xA)*(p-xB)*(p-xC));
        double p = (yA + yB + yC)/2;
        double areaY = Math.sqrt(p*(p-yA)*(p-yB)*(p-yC));

        System.out.printf("Area do triângulo A: %.2f%n", areaX);
        System.out.printf("Area do triângulo B: %.2f%n", areaY);

        if(areaX > areaY){
            System.out.println("Triangulo A tem maior área!");
        } else {
            System.out.println("Triangulo Y tem maior área!");
        }

        sc.close();
    }
}
