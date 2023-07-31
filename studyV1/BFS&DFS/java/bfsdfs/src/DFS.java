import java.util.*;

public class DFS {

    public static boolean[] visited = new boolean[9]; // 기본값으로 채워짐. 0 (하나도 방문하지 않은 것처럼 처리하기 위함.)
    // 2차원 배열리스트 선언
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

    // DFS 함수를 정의
    public static void dfs(int x) {
        // 현재 위치한 노드를 방문 처리한다.
        visited[x] = true;
        System.out.print(x + " ");
        // 방문 후 해당 노드와 연결된 다른 노드들을 재귀적으로 방문한다.
        for (int i = 0; i < graph.get(x).size(); i++) {
            int y = graph.get(x).get(i);
            // 만약 방문하지 않았으면, dfs 함수 재귀실행
            if (!visited[y])
                dfs(y);
        }
    }

    public static void main(String[] args) {
        // 일단 graph를 초기화함.
        for (int i = 0; i < 9; i++) {
            graph.add(new ArrayList<Integer>());
        }

        // 각 노드에 연결된 노드 정보를 저장한다.
        graph.get(1).add(2);
        graph.get(1).add(3);
        graph.get(1).add(8);

        graph.get(2).add(1);
        graph.get(2).add(7);

        graph.get(3).add(1);
        graph.get(3).add(4);
        graph.get(3).add(5);

        graph.get(4).add(3);
        graph.get(4).add(5);

        graph.get(5).add(3);
        graph.get(5).add(4);

        graph.get(6).add(7);

        graph.get(7).add(2);
        graph.get(7).add(6);
        graph.get(7).add(8);

        graph.get(8).add(1);
        graph.get(8).add(6);

        // 1번 노드부터 실행.
        dfs(1);
    }
}
