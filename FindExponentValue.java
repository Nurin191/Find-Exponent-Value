import java.util.Scanner;

    public class Solution {
		public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int m = input.nextInt();
		
		//a is always 3
		int a = 3;
		
		//Typecasting for y
		int y = (int) Math.pow(a, n + m);
				
	         System.out.println(y);
		
		
	}

}

