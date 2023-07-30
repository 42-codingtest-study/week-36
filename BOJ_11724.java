import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_11724 {

    private static ArrayList<Integer>[] arr;
    private static boolean[] visited;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        visited = new boolean[N + 1];
        arr = new ArrayList[N + 1];
        for (int idx = 1; idx < N + 1; idx++) {
            arr[idx] = new ArrayList<Integer>();
        }

        for (int idx = 0; idx < M; idx++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            arr[start].add(end);
            arr[end].add(start);
        }

        int count = 0;
        for (int idx = 1; idx < N + 1; idx++) {
            if (!visited[idx]) {
                count++;
                DFS(idx);
            }
        }
        System.out.println(count);
    }

    private static void DFS(int node) {
        if (visited[node])
            return ;
        visited[node] = true;
        for (int nextNode : arr[node]) {
            if (!visited[nextNode]){
                DFS(nextNode);
            }
        }
    }
}
