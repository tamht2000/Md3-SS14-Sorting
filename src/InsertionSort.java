public class InsertionSort {
    public static void main(String[] args) {
        int[]arr = {9,13,6,12,2,3,7,4};
        inserttionSort(arr);
    }

    private static void inserttionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j >0 && arr[j-1] > arr[i] ; j--) {
//                swap(arr, j-1, j);
            }
        }
    }
}
