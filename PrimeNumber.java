package java1;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int number=sc.nextInt();
		boolean f= PrimeNumberfinder(number);
		if(f) {
			System.out.println("Prime Number.");

		}else {
			System.out.println("not a prime Number:");
	
		}
	}

    public static boolean PrimeNumberfinder(int number)
    {
    	boolean flag = false;
    	 if(number%2!=0) {
    		 flag = true;
    	 }
    	 return flag;
    }
}


