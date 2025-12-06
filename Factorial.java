package java1;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int fact = 1;

        for(int i = num; i >= 1; i--) {
            fact = fact * i;
        }

        System.out.println("Factorial of " + num + " = " + fact);

	}

}
