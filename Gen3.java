public class Gen3 {
    public static void main(String[] args) {
        int min = Integer.parseInt(args[0]);
		int max = Integer.parseInt(args[1]);
				
		int rand1 = (int)(min + Math.random() * (max-min));
		int rand2 = (int)(min + Math.random() * (max-min));
		int rand3 = (int)(min + Math.random() * (max-min));
		
		System.out.println(rand1);
		System.out.println(rand2);
		System.out.println(rand3);
		
        System.out.println("The minimal generated number was " + Math.min(rand1, Math.min(rand2,rand3)));
    }
}