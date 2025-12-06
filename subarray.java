package java1;

import java.util.Scanner;

class subarray {
	public static void subset(int b[], int f, int e) {

		int[] b2 = new int[e - f];
		for (int i = 0; i < b2.length; i++) {
			if (i > f && i < e) {
				for (int j = 0; j < f - e; j++) {
					b2[j] = b[i];
				}
			}
		}
		for (int i = 0; i < b2.length; i++) {
			System.out.println(b[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an array 5 elements");
		int[] b = new int[5];
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}
		int a=sc.nextInt();
		int f=sc.nextInt();
		int e=sc.nextInt();
	
		 subset(b,f,e);
				

	}

}
