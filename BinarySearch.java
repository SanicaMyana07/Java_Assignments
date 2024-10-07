package Recursion;

public class BinarySearch {
    public int binaryS(int arr[], int left, int right, int target) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
                return binaryS(arr,0, mid -1, target);
            }
            if (arr[mid] < target) {
                return binaryS(arr,mid + 1,arr.length-1, target);
            }
        }
        return -1;
    }



    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        BinarySearch obj1 = new BinarySearch();
        int Result = obj1.binaryS(arr, 0, arr.length - 1, 8);

        if (Result == -1) {
            System.out.println("Incorrect");
        } else {
            System.out.println("Target found at " + Result);
        }
    }
}


