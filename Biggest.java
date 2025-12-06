package java1;
import java.util.Scanner;

public class Biggest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the three Numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int largest;
		if((a>b)&&(a>c))
		{
			largest=a;
		}
		else if((b>a)&&(b>c)) {
			largest=b;
		}
		else{
			largest=c;
		}
		System.out.println("largest of three numbers:"+largest);
		int smallest;
		if((a<b)&&(a<c))
		{
			smallest=a;
		}
		else if((b<a)&&(b<c)) {
			smallest=b;
		}
		else{
			smallest=c;
		}
		System.out.println(" smallest of three numbers:"+smallest);
			
		
		
		
	
			

	}

}
