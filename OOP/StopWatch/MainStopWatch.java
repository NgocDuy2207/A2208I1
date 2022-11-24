package OOP.StopWatch;

import java.util.Arrays;

public class MainStopWatch {
    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("New Array: " + Arrays.toString(arr));
        return arr;
    }

    public static void main(String[] args) {
        int [] arr = new int [100000];
        for (int i = 0; i < arr.length;i++){
            arr[i] = (int) (Math.random()*10);
        }
        StopWatch watch = new StopWatch();
        watch.Start();
        selectionSort(arr);
        System.out.println("The time it take is: " + watch.getElapsedTime());
    }

}
