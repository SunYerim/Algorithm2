/*logic
    1. 이진탐색으로 실행 -> 정렬이 되어 있어야 함.
    2. 이진탐색 코드 구현으로 손님이 찾는 부품이 있는지 binarySearch 함수 실행
    */
import java.util.*;
public class bupoom {

    // binarySearch
    public static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int middle = (start + end) / 2;
            // target 값이 middle인 경우
            if (arr[middle] == target)
                return middle;
            else if (arr[middle] > target)
                end = middle -1;
            else
                start = middle + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N 입력 받기
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 이진탐색을 하려면 정렬이 되어야함.
        Arrays.sort(arr);

        // M 입력 받기
        int m = sc.nextInt();
        int[] targets = new int[m];
        for (int i = 0; i < m; i++) {
            targets[i] = sc.nextInt();
        }

        // 손님 원하는 부품 번호 존재 유무 binarySearch로 하나씩 확인함.
        for (int i= 0; i < m; i++) {
            // 부품 존재하니
            int existion = binarySearch(arr, targets[i], 0, n-1);
            if (existion != -1){
                System.out.print("yes ");
            }
            else {
                System.out.print("no ");
            }
        }
    }

}
