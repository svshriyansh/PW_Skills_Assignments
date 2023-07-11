//Given an array and an integer “target”, return the last occurrence of “target” in the array. If the target is
// not present return -1.
package LinearBinarySearch;

public class ques2 {
    public static int occurrence(int[] arr, int target) {
        int index = -1;
        int i = 0;
        while (i < arr.length - 1 & arr[i] <= target) {
            if (arr[i] == target) {
                index = i;
            }
            i += 1;
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 2, 3, 4, 4, 5, 6, 6, 6, 6 };
        int target = 14;
        int index = occurrence(arr, target);
        System.out.println(index);
    }
}
