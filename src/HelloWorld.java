
import java.util.Scanner;

//MI CLASE DE JAVA - PRIMERA CLASE
public class HelloWorld {

    public static void main(String args[]) {

        String usuario = "Jhosep";

        String titulo = "Ingeniero";

        String union = usuario + " " + titulo;

        System.out.println("union = " + union);

        //<----------------------->
        var i = 2;
        var j = 4;

        System.out.println(i + j);
        System.out.println(i + j + usuario);

        //CONTEXTO CADENA - si la variable a imprimir comienza con una cadena 
        // entonces lo demas tambien lo toma como cadena por entre concatena.
        System.out.println(usuario + i + j);

        // Cuando se le agrega el parentesis , este modifica la priodidad por 
        // entre suma primero y luego hace el contexto cadena.
        System.out.println(usuario + (i + j));

        //<---------------------------------------------->
        // CARACTERES ESPECIALES EN JAVA
        String nombre = "Jhosep Adolfo";

        //salto de linea
        System.out.println("nombre: \n" + nombre);
        //tabuladores
        System.out.println("nombre: \t " + nombre);
        //retroceso
        System.out.println("nombre = \b\b" + nombre);
        //comilla simple
        System.out.println("nombre = '" + nombre + "'");
        //comilla doble
        System.out.println("nombre = \"" + nombre + "\"");

        //CLASE SCANNER PARA PEDIR DATOS DE INGRESO
        System.out.println("Escribir tu nombre : ");
        Scanner consola = new Scanner(System.in);
        String name = consola.nextLine();
        System.out.println("usuario = " + name);

        System.out.println("Escribir tu profesion : ");
        String profesion = consola.nextLine();
        System.out.println("profesion = " + profesion);

    }
}
