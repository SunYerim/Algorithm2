/*
    1. n을 입력받고
    2. 배열에 저장.
    3. 정렬 라이브러리를 이용하여 내림차순 정렬 수행
    Q. 궁금증 -> 바로 Collections.reverse(numArr)이 안 되는 이유 =>

*/
import java.util.*;


public class 위에서아래로 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        // num크기 만큼의 배열 생성 후 정수 입력받아 리스트 저장
        Integer[] numArr = new Integer[num];

        for (int i = 0; i < num; i++){
            numArr[i] = sc.nextInt();
        }

        // 배열 내림차순 정렬
        Arrays.sort(numArr, Collections.reverseOrder());

        // 출력
        for (int i = 0; i < num; i++) {
            System.out.print(numArr[i] + " ");
        }

    }
}
