import java.util.Locale;
import java.util.Scanner;
// executado a fim de teste
/* nota-se: existe uma condição para que o triângulo exista.
   task1 - adicionar condição de existência.
 */
public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangulo x, y;
        // instanciando objeto
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Entre com as medidas do triângulo A: ");
        x.a = sc.nextDouble(); //lendo e guardando
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Entre com as medidas do triângulo B: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double p = (x.a + x.b + x.c)/2;
        double areaX = Math.sqrt(p*(p-x.a)*(p-x.b)*(p-x.c));

        p = (y.a + y.b + y.c)/2;
        double areaY = Math.sqrt(p*(p-y.a)*(p-y.b)*(p-y.c));

        System.out.printf("Area do triângulo A: %.2f%n", areaX);
        System.out.printf("Area do triângulo B: %.2f%n", areaY);

        if(areaX > areaY){
            System.out.println("Triangulo A tem maior área!");
        } else {
            System.out.println("Triangulo B tem maior área!");
        }

        sc.close();
    }
}
