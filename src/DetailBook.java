
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
public class DetailBook {

    public static void main(String args[]) {

        Scanner consola = new Scanner(System.in);

        System.out.println("Ingrese el autor : ");
        String autor = consola.nextLine();

        System.out.println("Ingrese el titulo del libro : ");
        String titulo = consola.nextLine();

        System.out.println(titulo + " fue escrito por " + autor);

        consola.close();
    }

}
