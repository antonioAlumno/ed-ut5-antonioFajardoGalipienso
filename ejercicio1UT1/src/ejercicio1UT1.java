import java.util.Scanner;
public class ejercicio1UT1 {
    public static void main(String[] args) {
        float c1, c2, c3, c4, s, p;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la primera calificación: ");
        c1 = sc.nextFloat();
        System.out.print("Introduce la segunda calificación: ");
        c2 = sc.nextFloat();
        System.out.print("Introduce la tercera calificación: ");
        c3 = sc.nextFloat();
        System.out.print("Introduce la cuarta calificación: ");
        c4 = sc.nextFloat();

        s = c1 + c2 + c3 + c4;
        p = s/4;

        System.out.println("El promedio es: " + p);
    }
}
