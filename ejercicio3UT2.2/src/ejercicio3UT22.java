//Pide por teclado un número n y dibuja un triángulo rectángulo de n elementos de lado, utilizando para ello asteriscos (*)
import java.util.Scanner;
 class ejercicio3UT22 {
    public static void main(String[] args) {
        //declaración de variables y Scanner
        Scanner sc = new Scanner(System.in);
        int n;
        //Pedir el número por teclado
        System.out.print("Introduce un número: ");
        n = sc.nextInt();
        sc.nextLine();
        //bucles que imprimen la cantidad de * introducidos por teclado, el primer bucle for imprime la cantidad de lineas y el segundo imprime el número de asteriscos
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
