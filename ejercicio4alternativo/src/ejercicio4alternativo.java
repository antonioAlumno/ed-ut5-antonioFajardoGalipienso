import java.util.Scanner;

public class ejercicio4alternativo {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int cheesse, doble, triple, totalQueso;

        System.out.print("Introduce el número de cheesseburguers: ");
        cheesse = sc.nextInt();
        System.out.print("Introduce el número de doble cheesseburguers: ");
        doble = sc.nextInt();
        System.out.print("Introduce el número de triple cheesseburguers: ");
        triple = sc.nextInt();

        totalQueso = cheesse + (doble * 2) + (triple * 3);
        System.out.println("El número total de Queso es: " + totalQueso);

        }
    }

