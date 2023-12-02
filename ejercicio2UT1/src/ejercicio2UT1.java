import java.util.Scanner;
public class ejercicio2UT1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int y, a, b, c, x;

        System.out.print("Introduce el valor de a: ");
        a = sc.nextInt();
        System.out.print("Introduce el valor de b: ");
        b = sc.nextInt();
        System.out.print("Introduce el valor de c: ");
        c = sc.nextInt();
        System.out.print("Introduce el valor de x: ");
        x = sc.nextInt();

        y = (a * (x * x)) + (b * x) + c;
        System.out.println("El valor de y es: " + y);
    }
}
