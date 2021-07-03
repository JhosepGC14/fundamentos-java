
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
public class StoreBooks {

    public static void main(String args[]) {
        var consola = new Scanner(System.in);

        System.out.println("Proporciona el nombre: ");
        String nameBook = consola.nextLine();

        System.out.println("\nProporciona el id: ");
        int idBook = Integer.parseInt(consola.nextLine());

        System.out.println("\nProporciona el precio: ");
        double priceBook = Double.parseDouble(consola.nextLine());

        System.out.println("\nProporciona el envio gratuito (true / false) : ");
        boolean sendBook = Boolean.valueOf(consola.nextLine());

        System.out.println("\n" + nameBook + idBook);
        System.out.println("Precio : " + priceBook);
        System.out.println("Envio Gratuito : " + sendBook);
    }

}
