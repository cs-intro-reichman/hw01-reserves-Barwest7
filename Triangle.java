public class Triangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		boolean isTriangle = false;
		isTriangle = a < b + c && b < a + c && c < b + a;
        System.out.println(a  + ", " + b  + ", " + c + ": " + isTriangle);
    }
}