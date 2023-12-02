import java.util.Scanner;
public class practia5RA5 {
    public static void main(String[] args){
        float grados;
        int diaMes;
        String nombreMes;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la temperatura: ");
        grados = sc.nextFloat();
        sc.nextLine();
        System.out.print("Introduce el nombre del mes: ");
        nombreMes = sc.nextLine();
        System.out.print("Introduce el día: ");
        diaMes = sc.nextInt();
        System.out.println("El " + diaMes + " de " + nombreMes + " hace una temperatura de " + grados + " grados.");
    }
}
