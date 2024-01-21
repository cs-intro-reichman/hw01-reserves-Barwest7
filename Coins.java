public class Coins {
    public static void main(String[] args) {
        int userInput = Integer.parseInt(args[0]);
		int quarters = 0;
		int cents = 0;
		quarters = userInput / 25;
		cents = userInput % 25;
        System.out.println("Use " + quarters + " quarters and " + cents + " cents.");
    }
}