
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jhosep_PC
 */
public class ExerciseTypeConversion {

    public static void main(String args[]) {

        String edad = "20";
        int numberEdad = Integer.parseInt(edad);

        System.out.println("numberEdad = " + (numberEdad + 1));

        String valorPi = "3.1416";
        double numberValorPi = Double.parseDouble(valorPi);
        System.out.println("numberValorPi = " + numberValorPi);

        var consola = new Scanner(System.in);
        // System.out.println("Proporciona tu edad : ");
        // numberEdad = Integer.parseInt(consola.nextLine());
        // System.out.println("numberEdad = " + numberEdad);

        String edadTexto = String.valueOf(11);
        System.out.println("edadTexto = " + edadTexto);

        char caracter = "Hola Mundo".charAt(0);
        System.out.println("caracter = " + caracter);

        System.out.println("Proporcione un caracter : ");
        caracter = consola.nextLine().charAt(1);

        System.out.println("caracter = " + caracter);

        consola.close();
    }

}
