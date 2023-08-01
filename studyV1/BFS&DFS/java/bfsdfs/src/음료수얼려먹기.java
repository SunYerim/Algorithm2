import java.util.*;
public class 음료수얼려먹기 {

    public static int n, m;
    public static int[][] graph = new int[1000][1000];

    // DFS로 특정노드 방문 & 연결된 모든 노드들 방문.(상하좌우)
    public static boolean dfs(int x, int y) {
        // 우선, 범위 벗어나면 실행 불가능하기때문에 배제시킨다.
        if (x <= -1 || x >= n || y <= -1 || y >= m) {
            return false;
        }
        // 현재 노드 방문 안 했으면,
        if (graph[x][y] == 0) {
            // 방문 처리를 한다.
            graph[x][y] = 2;

            dfs(x-1, y);
            dfs(x, y-1);
            dfs(x+1, y);
            dfs(x, y+1);
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        // 입력받을때 Scanner
        Scanner sc = new Scanner(System.in);

        // n, m 을 공백을 기준으로 구분하여 입력을 받는다.
        n = sc.nextInt();
        m = sc.nextInt();

        sc.nextLine(); // 버퍼 지우기

        // 2차원 리스트 맵 정보 입력 받음.
        for (int i = 0; i < n; i++){
            String str = sc.nextLine();
            for (int j = 0; j < m; j++) {
                graph[i][j] = str.charAt(j) - '0';
            }
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dfs(i, j)) {
                    result += 1;
                }
            }
        }
        System.out.println(result);
    }
}
