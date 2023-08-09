// keyPoint: 자신보다 작으면, swap 시키면 된다.
import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
        int n = 10;
        int arr[] = {7, 5, 9, 0,  3, 1, 6, 2, 4, 8};

        for (int i = 0; i < n; i++){
            for (int j = i; j > 0; j--){
                if (arr[j] < arr[j-1]){
                    // swap 시킨다.
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }
                else
                    break;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
