package java1;

public class Sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 6784;
        int sum = 0;

        while(num > 0) {
            int digit = num % 10;  
            sum = sum + digit;      
            num = num / 10;         
        }

        System.out.println("Sum of digits = " + sum);
    }
}

	


