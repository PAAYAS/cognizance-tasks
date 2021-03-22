package java_;
import java.util.Scanner;
public class elephant {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);// object for scanner class
		
		System.out.println("Enter the coordinate of the friend's house: ");
		int x=sc.nextInt(); // User input
		
		int n;// Minimum no of steps
		
		if (x<=5) {
			System.out.println("1");
		}
		else {
			if(x%5==0) {
				n=x/5;
				System.out.println("The minimum no of steps: "+n);
			}
			else {
				n=x/5+1;
				System.out.println("The minimum no of steps: "+n);
			}
		}

	}

}
