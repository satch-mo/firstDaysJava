public class Star {
    public static void main(String[] args) {
        String firstName = "Anakin";
        String lastName = "Skywalker";
        double birthYear = 41.9d;
        String home = "Tatooine";
        double height = 6.167979d;
        double weight = 185.188d;
        double purse = 150.0d;
//        System.out.println(purse);
        purse = purse - 24.3;
//        System.out.println(purse);
        purse = purse - 45;
//        System.out.println(purse);
        purse = purse * 2;
//        System.out.println(purse);
        purse = purse * .1;
        System.out.println(purse);

        String handleColor = "Black";
        String bladeColor = "Purple";
        bladeColor = "Blue";

        if (handleColor == "Black" & bladeColor == "Purple")
            System.out.println("This one's mine!");
        else
            System.out.println("Pass");

        String shipName = "Millennium Falcon";

        if (shipName.equals("Millennium Falcon"))
            System.out.println("Let's go");
         else
            System.out.println("I better hide somewhere");

         // cantina
        double cost = 3.00d;
        boolean isRecommended = true;
        double drinkCost = .50d;
        int drinkSize = 32;

        if (cost < 5 && isRecommended) {
            System.out.println("I'll take it the item");
        }

        if ((drinkCost < 1) && (drinkSize > 24)) {
            System.out.println("I'll take the drink");
        }
    }
}
