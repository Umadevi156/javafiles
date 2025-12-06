package java1;

public class Ternary {

	public static void main(String[] args) {
		
		int a=10;
		int b=100;
		int c=300;
		int d=450;
		int e=690;
		String data=((a>b)&&(a>c)&&(a>d)&&(a>e))?a+"is largest value":((b>c)&&(b>d)&&(b>e))?b+"is largest value":((c>d)&&(c>e))?c+"is largest value":(d>e)?d+"is largest value":e+"largest value";
		System.out.println(data);
			
		
		// TODO Auto-generated method stub

	}

}
