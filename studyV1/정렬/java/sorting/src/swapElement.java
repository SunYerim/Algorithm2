/*
*  logic
*   1. 입력 조건에서 요구하는 것들을 다 입력받음.
*   2-1. 처음에는 A배열 각 원소를 기준으로 B 원소들을 쭈욱 순회하면서 크기비교를 하려하였음.
*       - 그러나 이같은 경우 원소이 갯수가 많아지면? -> 시간복잡도가 증가할 거 같고, 효율적이지 않아보였음.
*   2-2. 그래서 어차피, A배열 원소들의 총합이 커야하므로, 각 배열을 sort 적용 시킴.
*       - A배열의 원소가 B배열의 원소와 같거나 클 경우에만 swap이 가능하므로, 빠른 계산을 위해서 A를 오름차순, B를 내림차순
*         (A를 내림차순 정렬한다 생각하니 별반 다를 것이 없음. & 최대 비교횟수가 제한되어 있음!)
*   3. 그럼 끝이난다.*/
import java.util.*;
public class swapElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Integer[] b = new Integer[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        // a -> 오름차순, b -> 내림차순
        Arrays.sort(a);
        Arrays.sort(b, Collections.reverseOrder());

        // 첫번째 인덱스부터 확인하며 K번까지 비교해본다.
        for (int i = 0; i < k; i++) {
            // a가 b보다 작으면 swap
            if (a[i] < b[i]) {
                int tmp = a[i];
                a[i] = b[i];
                b[i] = tmp;
            }
            // 위의 경우 제외
            else
                break;
        }

        // 결과
        int total = 0;
        for (int i =0; i < n; i++) {
            total += a[i];
        }
        System.out.println(total);
    }
}
