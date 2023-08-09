/*
 logic
    - 우선 문제 자체만 두고 봤을때는, 이해하는데는 큰 무리가 없었음
    - 우선 문제 예시를 봤을때, i=j인 경우와 아닌 경우를 나누어서 풀어야겠다고 떠올랐음.
    - 단계별로 코딩해보자.
        [ ] array와 commands 2차원 배열 그리고 i, j를 입력받음
        [ ] commands 첫번째 배열부터 순회하며 i, j 조건에 따라 정답을 도출시키고, answer 배열에 append 시킨다.
        [ ] commands의 다른 배열 역시 위와 동일한 방법으로 실행 시킴.
    */
import java.util.*;
public class K번째수 {

    public static int findKthElement(int[] arr, int i, int j, int k) {
        int newArr[] = Arrays.copyOfRange(arr, i-1, j);
        Arrays.sort(newArr);
        int kthElement = newArr[k-1];

        return kthElement;
    }

    public static void main(String[] args) {
        // 정답으로 return 시킬 배열 생성
        int answer[] = new int[3];

        int arr[] = {1, 5, 2, 6, 3, 7, 4};



        // 2차원 배열
        int [][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        for (int i = 0; i < 3; i++){
            int kthElement = findKthElement(arr, commands[i][0], commands[i][1], commands[i][2]);

            answer[i] = kthElement;
        }

        // 2차원 배열 각 행 순회
        for (int i = 0; i < 3; i++){
            System.out.print(answer[i] + " ");


        }

    }
}
