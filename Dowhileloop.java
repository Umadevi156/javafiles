package java1;
import java.util.Scanner;

public class Dowhileloop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		// TODO Auto-generated method stub
		int i=0;
		int pwd=0;
		do
		{
			System.out.println("password="+pwd);
			if(pwd==0) 
				System.out.println("Enter your password.");
			else
				System.out.println("Incorrect Password:" +"Enter your password again:");
			pwd=sc.nextInt();
			 i++;
			if(i==10)
				break;
			
			
		}while(pwd!=1234);
		System.out.println("Correct pwd");

	}

}
