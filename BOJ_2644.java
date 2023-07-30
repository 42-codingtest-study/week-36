import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_2644 {

    private static ArrayList<Integer>[] arr;
    private static boolean[] visited;
    private static int target1;
    private static int target2;
    private static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        target1 = Integer.parseInt(st.nextToken());
        target2 = Integer.parseInt(st.nextToken());

        int M = Integer.parseInt(br.readLine());

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

        count = -1;
        DFS(target1, 0);
        System.out.println(count);
    }

    private static void DFS(int target, int depth) {
        if (visited[target])
            return;
        visited[target] = true;
        if (target == target2) {
            count = depth;
        }
        for (int nextNode : arr[target]) {
            if (!visited[nextNode]) {
                DFS(nextNode,  depth + 1);
            }
        }
    }

}
