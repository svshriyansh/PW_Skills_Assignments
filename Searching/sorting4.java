//Find out how many pass would be required to sort the following array in decreasing order
// using bubble sort
// Input Array {3,5,1,6,0}
package Searching;

public class sorting4 {
    public static int bubbleSort(int[] arr) {
        int passes = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean swap = false;
            for (int j = 0 + i; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    passes += 1;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
        return passes;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 1, 6, 0 };
        int pass = bubbleSort(arr);
        System.out.println("Total passes are" + pass);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
