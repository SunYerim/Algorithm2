import java.util.*;
public class CountSort {
    public static void main(String[] args) {
        int arr[] = {7, 5, 9, 0, 3, 1, 6, 2, 9, 1, 4, 8, 0, 5, 2};
        int n = arr.length;
        // 0 부터 9까지 총 10개 숫자 count 담을 배열 생성
        int cnt[] = new int[10];

        for (int i = 0; i < n; i++){
            cnt[arr[i]] += 1;
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < cnt[i]; j++) {
                System.out.print(i + " ");
            }
        }
    }
}
