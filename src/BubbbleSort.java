public class BubbbleSort {
    public static void main(String[] args) {
        int[] arr = {9,13,6,12,2,3,7,4};
        bubleSort(arr);
    }



    // Sắp xếp theo thứ tự tăng dần
    private static void bubleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if(arr[j] < arr[j + 1]) {
                    swap(arr[j], arr[j + 1]);
                }
            }
        }
    }

    private static void swap(int num1, int num2) {
        if(num1 > num2) {
            int tmp = num1;

        }
    }
}
