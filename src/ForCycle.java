public class ForCycle {
  public static void main(String args[]) {

    inicio: for (int counter = 0; counter < 5; counter++) {
      if (counter % 2 != 0) {
        continue inicio; // ir a la siguiente iteracion
      }
      System.out.println(counter);
    }

    for (int counter = 0; counter < 5; counter++) {
      if (counter % 2 == 0) {
        System.out.println(counter);
        break;
      }
    }

  }
}
