public class WhileExamples {
  public static void main(String args[]) {
    int counter = 0;

    while (counter < 5) {
    System.out.println("contador = " + counter);
    counter++;
    }

    do {
      System.out.println("counter = " + counter);
      counter++;
    } while (counter < 5);

  }
}
