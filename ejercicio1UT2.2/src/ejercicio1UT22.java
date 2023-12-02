import java.util.Scanner;
public class ejercicio1UT22 {
    public static void main (String[] args){
        //Declaración de variables y Scanner
        Scanner sc = new Scanner(System.in);
        int numero, secreto;
        boolean rinde = false, acierta = false;
        secreto = 1 + (int) (Math.random() * 100);

        System.out.println(secreto);
        System.out.print("Introduce un número entre 1 y 100: ");
        numero = sc.nextInt();
        sc.nextLine();

        //Bucle que primero comprueba el número introducido antes y después se repite si no se cumplen las condiciones
        do {
            //primero comprobamos si se ha rendido o ha acertado a la primera y las cambia a true para ver si se tiene que repetir o no el bucle al final
            if (numero == -1) {
                System.out.println("Mala suerte. No has acertado el número secreto");
                rinde = true;
            }   else if  (numero == secreto) {
                System.out.println("Enhorabuena. El número secreto era " + secreto);
                acierta = true;
            }
            //Después si no se cumple ninguna si el número es más pequeño y no es -1 nos indica que secreto es mayor y nos pide otro número
            else if ( numero < secreto && numero != 1) {
                System.out.println("El número secreto es mayor al introducido");
                System.out.print("Introduce otro número: ");
                numero = sc.nextInt();
                sc.nextLine();
            }
            //Por último si el numero es mayor que secreto, nos lo indica y nos pide que introduzcamos otro número
            else if ( numero > secreto ) {
                System.out.println("El número secreto es menor al introducido");
                System.out.print("Introduce otro número: ");
                numero = sc.nextInt();
                sc.nextLine();
            }
        } while (!rinde && !acierta);
    }
}
