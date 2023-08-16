/*logic
    1. 우선 이진탐색으로 풀어야된다는 생각으로 문제에 접근함.
    2. 각 떡의 길이를 입력받고, sort 정렬을 시킴.
    3. 적어도 M만큼의 떡 길이를 얻어야한다 했으므로, 높이 H를 sort 정렬시킨 떡 list에서 BinarySearch로 높이 비교해가면서 찾아가면 되지 않을까?
    */
import java.util.*;
public class ddeokbokgi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // n, m 입력받음
        int n = sc.nextInt();
        int m = sc.nextInt();

        // 떡의 높이를 받음.
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // 정렬
        Arrays.sort(arr);

        // binarySearch 수행
        int start = 0;
        int end = 99999;

        int result = 0;
        while (start <= end) {
            int sum = 0;
            int middle = (start + end) / 2;
            for (int i = 0; i < n; i++) {
                // h로 설정된 높이 => 각 떡이 잘렸을때의 길이 계산
                if (arr[i] > middle)
                    sum += arr[i] - middle;
            }
            // 떡 양이 m만큼 충족이 안 되는 경우 ( 더 잘려야됨)
            if (sum < m) {
                end = middle - 1;
            }
            // 떡의 양이 오버되는 경우 (최대한 덜 잘리는 경우 찾아야됨.)
            else {
                result = middle; // 최대한 덜 잘렸을때
                start = middle + 1;
            }
        }

        System.out.println(result);
    }
}
