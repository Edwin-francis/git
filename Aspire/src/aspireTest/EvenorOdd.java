package aspireTest;
import java.util.*;

public class EvenorOdd {
	public static void main(String [] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check weather it is odd or even : ");
		n = sc.nextInt();
		if(n%2==0) {
			System.out.println("The number is :"+n+ " is even");
		}
		else {
			System.out.println("The number is :"+n+ " is Odd");
		}
		sc.close();
	}

}
