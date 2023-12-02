import java.util.Scanner;
public class ejercicio2UT2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        double raiz = 0, x;

        System.out.print("Introduce el valor de a: ");
        a = sc.nextInt();
        sc.nextLine();
        System.out.print("Introduce el valor de b: ");
        b = sc.nextInt();
        sc.nextLine();
        System.out.print("Introduce el valor de c: ");
        c = sc.nextInt();
        sc.nextLine();

        raiz = Math.pow(b, 2) - (4 * a * c);
        x = (-b + Math.sqrt(raiz)) / (2 * a);

        if (a == 0) {
            System.out.println("El denominador no puede ser 0");
        }
        if (raiz <= -1) {
            System.out.println("No existen soluciones reales");
        }
        if (a > 0 && raiz > 1) {
            System.out.println("Solución 1: " + x);
            System.out.println("Solución 2: " + -x);
        }
    }
}
