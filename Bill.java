package java1;
import java.util.Scanner;


public class Bill {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Total Bill Amount:");
		double amount=sc.nextInt();
		double discount=0;
		if(amount>1000) {
			discount=amount*0.08;
			System.out.println("display discount amount:"+discount );
			System.out.println("display amount after dicount:"+(amount-discount) );
		}
		else if(amount>2000){
			discount=amount*0.15;
			System.out.println("display discount amount:"+discount );
			System.out.println("display amount after dicount:"+(amount-discount) );
		}
		
		else {
			discount=0.00;
			System.out.println("display discount amount:"+discount );
			System.out.println("display amount after dicount:"+(amount-discount ));
		}
		}
		// TODO Auto-generated method stub

	}


