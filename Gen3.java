public class Gen3 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		int rand1 = (int)(a + Math.random() * (b-a));
		int rand2 = (int)(a + Math.random() * (b-a));
		int rand3 = (int)(a + Math.random() * (b-a));
		
		System.out.println(rand1);
		System.out.println(rand2);
		System.out.println(rand3);
		
        System.out.println("The minimal generated number was " + Math.min(rand1, Math.min(rand2,rand3)));
    }
}