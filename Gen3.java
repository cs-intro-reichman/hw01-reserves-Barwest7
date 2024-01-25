public class Gen3 {
    public static void main(String[] args) {
        double min = Double.parseDouble(args[0]);
		double max = Double.parseDouble(args[1]);
		
		int range = (int)(max - min);
		
		int rand1 = (int)((Math.random() * range) + min);
		System.out.println(rand1);
		
		int rand2 = (int)((Math.random() * range) + min);
		System.out.println(rand2);
		
		int rand3 = (int)((Math.random() * range) + min);
		System.out.println(rand3);
		
        System.out.println("The minimal generated number was " + Math.min(rand1, Math.min(rand2,rand3)));
    }
}