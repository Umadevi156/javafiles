package java1;
import java.util.Scanner;

public class AgeCheking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age:");
		int age=sc.nextInt();
		if( age >= 0 && age <= 12) {
			System.out.println("Kid");
			}
		else if(age >= 13 && age <= 19) {
			System.out.println("Teenager");
		}
		else if(age >= 20 && age <= 40) {
			System.out.println("Youngster");
		}
		else if(age >= 40 && age <= 55) {
			System.out.println("Man");
		}
		else if(age >= 55 && age <= 70) {
			System.out.println("Old man");
		}
		else {
			
				System.out.println("Invalid Age");
			
		}
		
		

	}

}
