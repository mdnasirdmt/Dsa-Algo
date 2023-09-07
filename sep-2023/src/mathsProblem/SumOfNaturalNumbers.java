package mathsProblem;
import java.util.*;
public class SumOfNaturalNumbers {

	public static void main(String[] args) {
//		int[] arr = { 1, 2, 3, 4, 5 };
		
		Scanner n= new Scanner(System.in);
		System.out.print(" Enter number to find sum of Natural number : ");
		int num= n.nextInt();
		int sum=0;
		for (int i = 1; i <=num; i++) {
			sum += i;
		}
		System.out.println(" Sum of natural numbers is : " + sum);

	}

}
