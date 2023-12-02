import java.util.Scanner;
public class ejercicio4UT1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int hormiga, aranya, cochinilla, totalPatas;

        System.out.print("Introduce el número de hormigas: ");
        hormiga = sc.nextInt();
        System.out.print("Introduce el número de arañanas: ");
        aranya = sc.nextInt();
        System.out.print("Introduce el número de cochinillas: ");
        cochinilla = sc.nextInt();

        totalPatas = (hormiga * 6) + (aranya * 8) + (cochinilla * 14);
        System.out.println("El número total de patas es: " + totalPatas);

    }
}
