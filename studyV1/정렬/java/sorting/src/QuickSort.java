import java.util.*;
public class QuickSort {
    public static void quickSort(int[] arr, int start, int end) {
        // 1. 원소가 1개인 경우
        if (start >= end)
            return;
        int pivot = start;
        int left = start + 1;
        int right = end;
        while (left <= right) {
            // 피벗보다 큰 데이터 찾을 때까지 반복
            while (left <= end && arr[left] <= arr[pivot])
                left++;
            // 피벗보다 작은 데이터 찾을 때까지 반복
            while (right > start && arr[right] >= arr[pivot])
                right--;
            // 엇갈렸을때 피벗이 엇갈린 시점에서의 작은 데이터 자리와 swap
            if (left > right) {
                int tmp = arr[pivot];
                arr[pivot] = arr[right];
                arr[right] = tmp;
            }
            // 엇갈리지 않은경우에서는 작은 데이터와 큰 데이터를 swap
            else {
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
            }
        }
        // 분할 이후에서도 각 배열에 대해서 quickSort 실행 시켜줌.
        quickSort(arr, start, right -1);
        quickSort(arr, right +1, end);

    }

    public static void main(String[] args) {
        int n = 10;
        int arr[] = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        quickSort(arr, 0, n-1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
