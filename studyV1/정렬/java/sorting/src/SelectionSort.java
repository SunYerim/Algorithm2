import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        int n = 10;
        int arr[] = {7, 5, 9, 0,  3, 1, 6, 2, 4, 8};

        for (int i = 9; i > 0; i--) {
            int max_index = i; // 가장 큰 원소의 인덱스
            for (int j = 0; j < i; j++) {
                if (arr[max_index] < arr[j]) {
                    max_index = j;
                }
            }

            int tmp = arr[i];
            arr[i] = arr[max_index];
            arr[max_index] =tmp;
        }
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}