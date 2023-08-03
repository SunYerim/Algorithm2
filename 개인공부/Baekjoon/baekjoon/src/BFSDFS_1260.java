// logic
//  1. dfs -> 재귀 or stack , bfs -> 큐로 LinkedList
//  2.
import java.util.*;
import java.io.*;

public class BFSDFS_1260 {
    // StringBuilder ->
    static StringBuilder sb = new StringBuilder();
    // 방문했나 안했나 판정 위한 배열
    static boolean[] visited;
    static int[][] arr;

    static int N, M, V;
    // bfs
    static Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        arr = new int[N+1][M+1];
        visited = new boolean[N+1];

        for (int i = 0; i < M; i++){
            StringTokenizer str = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());

            // 인접행렬 방식
            arr[a][b] = arr[b][a] = 1;
        }

        dfs(V);
        sb.append("\n");
        visited = new boolean[N+1];

        bfs(V);

        System.out.println(sb);

    }

    public static void dfs (int V) {
        visited[V] = true; // 방문처리 하고
        sb.append(V + " ");

        for (int i = 0; i <= N; i++) {
            if (arr[V][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }


    }

    public static void bfs (int V) {
        q.add(V);
        visited[V] = true;

        while (!q.isEmpty()) {
            V = q.poll();
            sb.append(V + " ");

            for (int i = 1; i <= N; i++) {
                if (arr[V][i] == 1 && !visited[i]) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }


}
