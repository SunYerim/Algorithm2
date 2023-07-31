import java.util.*;
public class BFS {
    public static boolean[] visited = new boolean[9];
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

    // BFS 함수 정의 -> offer(): 데이터 추가, poll(): 데이터 삭제, peek(): 첫 번째 값 참조, clear(): 큐 초기화
    public static void bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        // 그리고 노드를 방문처리
        visited[start] = true;
        // 큐가 빌 때까지 반복한다.
        while (!q.isEmpty()) {
            // 큐에서 원소를 하나 뽑아 출력하고
            int x = q.poll();
            System.out.print(x + " ");
            // x와 연결된, 그러나 아직 방문하지 않은 원소들을 큐에 삽입한다.
            for (int i = 0; i < graph.get(x).size(); i++){
                int y = graph.get(x).get(i);
                if (!visited[y]) {
                    // 큐에 추가시키고
                    q.offer(y);
                    // 해당 노드는 방문처리 시킨다.
                    visited[y] = true;
                }
            }
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
        bfs(1);
    }

}
