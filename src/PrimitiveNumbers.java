
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
public class PrimitiveNumbers {

    public static void main(String args[]) {

        // TIPOS PRIMITIVOS Y NUMERICOS ENTEROS
        byte numeroByte = 10;
        byte numeroByteI = (byte) 129;
        System.out.println("\nnumeroByteImpreciso = " + numeroByteI);
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Valor minimo Byte : " + Byte.MIN_VALUE);
        System.out.println("Valor maximo Byte : " + Byte.MAX_VALUE);

        short numeroShort = 11;
        short numeroShortI = (short) 32768;
        System.out.println("\nnumeroShortI = " + numeroShortI);
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Valor minimo Short : " + Short.MIN_VALUE);
        System.out.println("Valor maximo Short : " + Short.MAX_VALUE);

        int numeroInt = 10;
        int numeroIntI = (int) 2147483648L;
        System.out.println("\nnumeroInt = " + numeroInt);
        System.out.println("numeroIntI = " + numeroIntI);
        System.out.println("Valor minimo Int : " + Integer.MIN_VALUE);
        System.out.println("Valor maximo Int : " + Integer.MAX_VALUE);

        long numeroLong = 10;
        long numeroLongI = (long) 9223372036854775808F;
        System.out.println("\nnumeroLong = " + numeroLong);
        System.out.println("numeroLongI = " + numeroLongI);
        System.out.println("Valor minimo Long : " + Long.MIN_VALUE);
        System.out.println("Valor maximo Long : " + Long.MAX_VALUE);

        // TIPOS PRIMITIVOS TIPO FLOTANTE
        float numeroFloat = 10.0F;
        float numeroFloatI = (float) 3.4028236E38D;
        System.out.println("\nnumeroFloat = " + numeroFloat);
        System.out.println("numeroFloatI = " + numeroFloatI);
        System.out.println("Valor minimo float : " + Float.MIN_VALUE);
        System.out.println("Valor maximo float : " + Float.MAX_VALUE);

        double numeroDouble = 10;
        double numeroDoubleI = 1.7976931348623157E308;
        System.out.println("\nnumeroDouble = " + numeroDouble);
        System.out.println("numeroFloatI = " + numeroDoubleI);
        System.out.println("Valor minimo double : " + Double.MIN_VALUE);
        System.out.println("Valor maximo double : " + Double.MAX_VALUE);

        // TIPOS CON VAR Y TIPOS PRIMITIVOS
        var numeroEntero = 10;
        System.out.println("\nnumeroEntero = " + numeroEntero);

        var numerDouble = 10.0;
        System.out.println("numerDouble = " + numerDouble);

        var numerFloat = 10.0F;
        System.out.println("numeroFloat = " + numerFloat);

        // TIPOS PRIMITIVOS CHAR
        char miCaracter = 'a';
        System.out.println("\nmiCaracter = " + miCaracter);

        char varChar = '\u0021';
        System.out.println("varChar = " + varChar);

        char varCharDecimal = 33;
        System.out.println("varCharDecimal = " + varCharDecimal);

        var miCaracter2 = 'a';
        System.out.println("\nmiCaracter2 = " + miCaracter2);

        var varChar2 = '\u0021';
        System.out.println("varChar2 = " + varChar2);

        var varCharDecimal2 = (char) 33;
        System.out.println("varCharDecimal2 = " + varCharDecimal2);

        // TIPO PRIMITIVO BOOLEAN
        boolean isInside = false;
        boolean isAuthenticated = false;
        String emailSaved = "jhosepgc14@gmail.com";
        String passwordSaved = "Jgc140798";

        // pequeño ejercicio con if and else para probar los tipos booleans

        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese su correo : ");
        String email = consola.nextLine();
        System.out.println("Dígite su contraseña : ");
        String password = consola.nextLine();

        if (!"".equals(email.trim()) && email.equals(emailSaved) && !"".equals(password.trim())
                && password.equals(passwordSaved)) {
            isInside = true;
            isAuthenticated = true;
        }

        if (isAuthenticated && isInside) {
            System.out.println("Bienvenido : " + email);
            System.out.println("\nisAuthenticated = " + isAuthenticated);
        } else {
            System.out.println("Credenciales inválidas o no existen.");
        }

        consola.close();
    }
}
