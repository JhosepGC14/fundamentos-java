package clases;

public class PruebaPersona {
  public static void main(String args[]) {
    Persona persona1 = new Persona();
    persona1.name = "Jhosep";
    persona1.lastName = "Guadalupe";
    persona1.desplegarInformacion();

    Persona persona2 = new Persona();
    System.out.println(persona1);
    System.out.println(persona2);
    persona2.desplegarInformacion();

    persona2.name = "Geyvi";
    persona2.lastName = "Ojeda";
    persona2.desplegarInformacion();
  }
}
