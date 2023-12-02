import java.util.Scanner;
public class ejercicio3UT1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        float primera, segunda, tercera, total;

        System.out.print("Introduce la primera distancia: ");
        primera = sc.nextFloat();
        System.out.print("Introduce la segunda distancia: ");
        segunda = sc.nextFloat();
        System.out.print("Introduce la tercera distancia: ");
        tercera = sc.nextFloat();

        total = (primera / 10) + segunda + (tercera * 100);
        System.out.println("La distancia total es: " + total);
    }
}
