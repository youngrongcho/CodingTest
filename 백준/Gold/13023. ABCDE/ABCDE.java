import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    //친구 관계를 인접리스트로 표현
    static List<Integer>[] friends;
    static boolean[] visited;
    static boolean arrive;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        //초기화
        friends = new ArrayList[N];
        visited = new boolean[N];
        arrive = false;

        for (int i = 0; i < N; i++) {
            friends[i] = new ArrayList<>();
        }

        //엣지 연결
        for (int i = 0; i < M; i++) {
            stringTokenizer = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(stringTokenizer.nextToken());
            int e = Integer.parseInt(stringTokenizer.nextToken());
            friends[s].add(e);
            friends[e].add(s);
        }

        //5명이 이어져 있으면 1 반환
        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                DFS(i, 1);
                if (arrive) break;
            }
        }
        if (arrive) System.out.println("1");
        else System.out.println("0");
    }

    public static void DFS(int i, int depth) {
        if (depth == 5 || arrive) {
            arrive = true;
            return;
        }
        visited[i] = true;
        for (int num : friends[i]) {
            if (!visited[num]) {
                DFS(num, depth + 1);
            }
        }
        visited[i] = false;
    }
}