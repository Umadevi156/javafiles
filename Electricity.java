package java1;
import java.util.Scanner;


public class Electricity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Bill Amount:");
		int u=sc.nextInt();
		double bill=0;
		if(u<50) {
			bill=u*3.5;
		}else if(u <= 100) {
			bill=u*4.2;
		}else if(u <= 200) {
			bill=u*5.5;
		}else {
			bill=u*6.8;
			
		}
			
		System.out.println("bill amount="+bill);
		
		

	}

}
