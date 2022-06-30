import java.util.Scanner;

class Mars {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("What is your astronaut's name");

    String name = input.nextLine();  // Get user input
    System.out.println("Oh, " + name + " is a nice name!");
    System.out.println("What is the color of their spacesuit?");

    String color = input.nextLine();  // Get user input
    System.out.println("WOW! " + color + " is a great spacesuit color!");
    System.out.println("What is the name of their pet?");

    String pet = input.nextLine(); // Get user input
    System.out.println(pet + " is an awesome pet name.");
    System.out.println("Where is your space destination?");

    String planet = input.nextLine();
    System.out.println("You sure are brave for wanting to go to " + planet + ". Good luck out there.");
    System.out.println("Have you ever been to " + planet + " before?");

    input.nextLine();
    System.out.println("I'm sure you will have fun! Safe travels.");
  }
}
