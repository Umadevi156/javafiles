package java1;

class AdjacentEqualCount {

    public static void main(String[] args) {
        int arr[] = {5, 5, 2, 3, 3, 3, 7};

        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            }
        }

        System.out.println("Count = " + count);
    }
}
