import java.util.Scanner;
public class ejercicio1UT2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int dia, mes;

        System.out.print("Introduzca día: ");
        dia = sc.nextInt();
        sc.nextLine();
        System.out.print("Introduzca mes: ");
        mes = sc.nextInt();

        if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia <= 31)
            System.out.println("Fecha OK: " + dia + "//" + mes);
         else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11 ) && dia <= 30)
            System.out.println("Fecha OK: " + dia + "//" + mes);
         else if ( mes == 2 && dia <= 28)
            System.out.println("Fecha OK: " + dia + "//" + mes);
         else
             System.out.println("Fecha incorrecta");
    }
}
