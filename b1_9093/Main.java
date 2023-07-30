package b1_9093;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private int n;
    private BufferedReader br;
    private StringTokenizer st;
    public static void main(String[] args) throws Exception {
        Main Main = new Main();
        Main.method();
    }
    public void method() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br. readLine());
            int token = st.countTokens(); //토큰 수 고정해야 하더라..!
            char[][] arr = new char[token][];

            for(int j = 0; j < token; j++) {
                arr[j] = st.nextToken().toCharArray();
                //System.out.println(Arrays.toString(arr[j]));
            }
        }
    }

}
