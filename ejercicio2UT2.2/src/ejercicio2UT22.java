import java.util.Scanner;
public class ejercicio2UT22 {
    public static void main (String[] args) {
        //Declaración de variables y Scanner
        Scanner sc = new Scanner(System.in);
        int nota, i;
        //El bucle for se repite 5 veces con notas correctas y cuando están las 5 se termina
        for ( i = 1;i <= 5; i++) {
            //Dentro del bucle for se repite otro bucle que compruebe que la nota introducida es correcta
            do {
                System.out.print("Introduce una nota del 1 al 10: ");
                nota = sc.nextInt();
                sc.nextLine();
                //Si se ha introducido una nota incorrecta muestra un mensaje de error
                if (nota < 0 || nota > 10) {
                    System.out.println("Nota incorrecta.");
                }
            } while (nota < 0 || nota > 10);
            //Si hay alguna nota menor que 5 se finaliza la ejecución del bucle y muestra el mensaje de alumnos suspensos
            if (nota < 5) {
                System.out.println("Hay alumnos suspensos.");
                break;
            }
            if (i == 5) {
                System.out.println("No hay alumnos suspensos.");
            }
        }
    }
}
