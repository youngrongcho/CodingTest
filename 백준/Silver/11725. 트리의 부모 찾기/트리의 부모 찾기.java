import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static int N;
    public static boolean[] visited;
    public static ArrayList<Integer>[] tree;
    public static int[] answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언

        //초기화
        N = Integer.parseInt(br.readLine());
        visited = new boolean[N + 1];
        tree = new ArrayList[N + 1];
        answer = new int[N + 1];

        for (int i = 0; i <= N; i++) {
            tree[i] = new ArrayList<>();
        }

        //트리 구성
        StringTokenizer stringTokenizer;
        for (int i = 1; i <= N - 1; i++) {
            stringTokenizer = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(stringTokenizer.nextToken());
            int E = Integer.parseInt(stringTokenizer.nextToken());
            tree[S].add(E);
            tree[E].add(S);
        }

        //DFS
        DFS(1);
        for (int i = 2; i <= N; i++) {
            System.out.println(answer[i]);
        }
    }

    public static void DFS(int node) {
        visited[node] = true;
        for (int n : tree[node]) {
            if (!visited[n]) {
                answer[n] = node;
                DFS(n);
            }
        }
    }
}