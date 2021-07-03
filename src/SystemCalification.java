import java.util.Scanner;

public class SystemCalification {
  public static void main(String args[]) {
    Scanner consola = new Scanner(System.in);
    System.out.println("Proporciona un valor entre 0 y 10: ");
    int value = Integer.parseInt(consola.nextLine());
    String calification = "Valor desconocido";

    switch (value) {
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5: {
        calification = "F";
        break;
      }

      case 6: {
        calification = "D";
        break;
      }

      case 7: {
        calification = "C";
        break;
      }
      case 8: {
        calification = "B";
        break;
      }
      case 9:
      case 10: {
        calification = "A";
        break;
      }
    }

    // Si esta entre 9 y 10 imprimir: A
    if (value >= 9 && value <= 10)
      calification = "A";
    // Si esta entre 8 y menor a 9 imprimir: B
    else if (value >= 8 && value < 9)
      calification = "B";
    // Si esta entre 7 y menor a 8 imprimir: C
    else if (value >= 7 && value < 8)
      calification = "C";
    // Si esta entre 6 y menor a 7 imprimir: D
    else if (value >= 6 && value < 7)
      calification = "D";
    // Si esta entre 0 y menor a 6 imprimir: F
    else if (value >= 0 && value < 6)
      calification = "F";
    // Si no esta en el rago, imprimir: Valor desconocido
    else
      System.out.println("Valor desconocido");

    System.out.println("Calificacion : " + calification);

  }
}
