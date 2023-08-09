import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String arr[] = new String[numbers.length];
        // int 배열 -> string 배열로 변환
        for (int i = 0; i < arr.length; i++){
            arr[i] = String.valueOf(numbers[i]);
        }

        // String 배열을 정렬하는데 사용할 Comparator 인터페이스
        Arrays.sort(arr, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2) {
                return (s2 + s1).compareTo(s1+s2);
            }
        });
        // 정렬된 String 배열을 하나의 문자열
        for (int i = 0; i < arr.length; i++){
            answer += arr[i];
        }
        // 0으로 시작하는 문자열이면 0처리
        if (answer.startsWith("0")) {
            answer = "0";
        }
        return answer;
    }
}