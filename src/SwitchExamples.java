public class SwitchExamples {
  public static void main(String args[]) {

    int number = 1;
    String numberText = "Valor desconocido";

    switch (number) {
      case 1: {
        numberText = "Numero uno";
        break;
      }

      case 2: {
        numberText = "Numero dos";
        break;
      }

      case 3: {
        numberText = "Numero tres";
        break;
      }

      case 4: {
        numberText = "Numero cuatro";
        break;
      }

      default: {
        numberText = "Caso no encontrado";
        break;
      }
    }

    System.out.println(numberText);

  }
}
