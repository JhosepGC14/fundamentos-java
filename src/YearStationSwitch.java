public class YearStationSwitch {
  public static void main(String args[]) {
    int month = 7;
    String station = "Estación desconocida";

    switch (month) {
      case 1:
      case 2:
      case 12: {
        station = "Invierno";
        break;
      }

      case 3:
      case 4:
      case 5: {
        station = "Primavera";
        break;
      }

      case 6:
      case 7:
      case 8: {
        station = "Verano";
        break;
      }

      case 9:
      case 10:
      case 11: {
        station = "Otoño";
        break;
      }
    }

    System.out.println(station);

  }
}
