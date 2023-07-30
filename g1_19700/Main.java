package g1_19700;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private int n;
    BufferedReader br;
    HashMap<Integer, Integer> map = new HashMap<>();
    public static void main(String[] args) throws Exception {
        Main Main = new Main();
        // TODO Auto-generated method stub
        Main.method();
    }
    public void method() throws Exception {
         br = new BufferedReader(new InputStreamReader(System.in));
         n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            map.put(h, k);
        }
        List<Integer> keySet = new ArrayList<>(map.keySet());
        Collections.reverse(keySet);
        for (Integer key : keySet) {
            System.out.print("Key : " + key);
            System.out.println(", Val : " + map.get(key));
        }
        //arraylist
        List<Integer> team;
    }
}
