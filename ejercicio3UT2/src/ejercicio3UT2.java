import java.util.Scanner;
public class ejercicio3UT2 {
    public static void main (String[] args) {

        final String USUARIO_CORRECTO = "usuario";
        final String CONTRASENA_CORRECTA = "contrasena123";
        boolean contrasenaCorrecta = false, usuarioCorrecto = false;
        String usuario, contrasena;
        Scanner sc = new Scanner(System.in);

        System.out.println("Sistema de Autentificación\n");
        System.out.print("Ingrese su nombre de usuario: ");
        usuario = sc.nextLine();
        System.out.print("Ingrese su contraseña: ");
        contrasena = sc.nextLine();

        if (USUARIO_CORRECTO.compareTo(usuario) == 0) {
            usuarioCorrecto = true;
        }
        if (CONTRASENA_CORRECTA.compareTo(contrasena) == 0) {
            contrasenaCorrecta = true;
        }
        if (usuarioCorrecto  && contrasenaCorrecta ) {
            System.out.println("¡Bienvenido, usuario!");
        }
        if (!usuarioCorrecto  && !contrasenaCorrecta ) {
            System.out.println("Acceso denegado.");
        } else if (!usuarioCorrecto ) {
            System.out.println("Usuario incorrecto.");
        } else if (!contrasenaCorrecta ) {
            System.out.println("Contraseña incorrecta.");
        }


    }
}
