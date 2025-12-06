package java1;

public class MultipleOfThree {

    // User defined method
    public static void printMultiples(int arr[]) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                count++;
            }
        }

        System.out.println("Total elements divisible by 3 = " + count);
    }

    public static void main(String[] args) {

        int arr[] = {3, 5, 9, 10, 12};  // sample array

        printMultiples(arr); // method call
    }
}
