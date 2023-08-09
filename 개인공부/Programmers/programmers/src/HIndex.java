import java.util.*;

public class HIndex {
    public static void main(String[] args) {
        int citations[] = {3, 0, 6, 1, 5};

        int answer = 0;
        for (int i = 0; i < citations.length; i++){
            if (citations[i] >= 3)
                answer += 1;
        }

        System.out.println(answer);

    }
}
