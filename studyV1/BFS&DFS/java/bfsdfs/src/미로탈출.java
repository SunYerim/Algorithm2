// logic_최단경로 문제니까 bfs로 풀어야겠다는 생각이 먼저 듬.
//
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
public class 미로탈출 {
    public static int[][] maze;
    public static int n, m;

    // dx, dy 이동방향
    public static int[] dx = {1, -1, 0, 0};
    public static int[] dy = {0, 0, 1, -1};

    public static int bfs(int x, int y) {
        Queue<Integer> q = new LinkedList<>();
        int count = 1;
        q.add(x);
        q.add(y);

        maze[x][y] = 0; // 방문처리
        int now_x, now_y;
        while (!q.isEmpty()) {
            x = q.poll();
            y = q.poll();
            maze[x][y] = 0; // 방문처리

            for (int i = 0; i < 4; i++) {
                now_x = x + dx[i];
                now_y = y + dy[i];

                if (now_x < 1 || now_x > n || now_y < 1 || now_y > m) {
                    continue; // 미로의 범위를 벗어나는 경우
                }

                if (maze[now_x][now_y] == 1 && (now_x > x || now_y > y)) {
                    count++;
                    q.add(now_x);
                    q.add(now_y);
                }
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        maze = new int[n+1][m+1];

        for (int i = 1; i <= n; i++) {
            String[] text = br.readLine().split("");

            for (int j = 1; j <= m; j++) {
                maze[i][j] = Integer.parseInt(text[j-1]);
            }
        }
        br.close();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("count :"+String.valueOf(bfs(1,1)));
        bw.close();

    }

}
