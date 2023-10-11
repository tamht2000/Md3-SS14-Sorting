package ra.bt1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        getArr();
        System.out.println(Arrays.toString(getArr()));
    }

    private static int[] getArr(){
        int arr[] = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }
}
