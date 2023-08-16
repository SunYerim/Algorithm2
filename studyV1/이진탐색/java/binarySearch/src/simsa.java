/* logic
    1. 뭔가 매개변수를 갱신하는? 그런 느낌으로 풀어야될 거 같은 문제
    2. 아님 나올 수 있는 모든 경우의수를 다 구해야되는 것인지.. -> 이건 아닌 듯
    3. 일단 시간 적게 걸리는 쪽으로 몰아넣는 게 효율적일 거 같다는 생각도 들었음.
    4. 일단 이진 탐색을 써야한다. -> 시간을 기준으로
    5. 시간의 최솟값을 구하는 문제이므로, 해당 시간에 몇 명의 인원이 심사를 받을수 있는지?로 binarySearch 구하면 됨?
			ㄴ 배열 받은 거 sort 시키고, 최소시간(left): 1초, 최장시간(high): m명 * 심사최대시간, middle: (left + high) / 2
			ㄴ umm.. */
import java.util.*;
public class simsa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);





    }

}