import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2023  {

    private static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        DFS(2, 1);
        DFS(3, 1);
        DFS(5, 1);
        DFS(7, 1);

    }

    private static void DFS(int num, int length) {
        if (length == N) {
            if (isPrime(num)) {
                System.out.println(num);
            }
            return ;
        }
        for (int idx = 0; idx <= 9; idx++) {
            if (idx % 2 == 0) {
                continue;
            }
            if (isPrime(num * 10 + idx)) {
                DFS(num * 10 + idx, length + 1);
            }
        }
    }

    private static boolean isPrime(int num) {
        for (int idx = 2; idx <= num / 2; idx++) {
            if (num % idx == 0)
                return false;
        }
        return true;
    }

//    private static void DFS(int num, int length) {
//        if (length == N) {
//            if (isPrime(num)) {
//                System.out.println(num);
//            }
//            return ;
//        }
//        for (int idx = 0; idx <= 9; idx++) {
//            if (idx % 2 == 0)
//                continue;
//            if (isPrime(num * 10 + idx)) {
//                DFS(num * 10 + idx, length + 1);
//            }
//        }
//    }
//
//    private static boolean isPrime(int num) {
//        for (int idx = 2; idx <= num/2; idx++) {
//            if (num % idx == 0)
//                return false;
//        }
//        return true;
//    }

}
