package java1;

class MultiplesOfFive {
    
    // User-defined method
    static void printMultiples(int arr[]) {
        int count = 0;

        for (int num : arr) {
            if (num % 5 == 0) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static void main(String[] args) {
        int arr[] = {10, 7, 25, 8, 12}; // sample array
        printMultiples(arr);
    }
}