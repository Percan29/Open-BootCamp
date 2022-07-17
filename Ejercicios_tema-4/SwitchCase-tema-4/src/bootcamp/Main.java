package bootcamp;

public class Main {
  public static void main(String[] args) {
    var station = "cool";
    switch (station) {
      case "SUMMER":
        System.out.println("Is " + station);
        break;
      case "WINTER":
        System.out.println("Is " + station);
        break;
      case "FALL":
        System.out.println("Is " + station);
        break;
      case "SPRING":
        System.out.println("Is " + station);
      default:
        System.out.println("This is not a season: " + station);
    }
  }
}
