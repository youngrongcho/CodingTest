import java.io.*;
import java.util.*;

public class Main {
    public static ArrayList<Integer>[] map;
    public static int[] visited;
    public static PriorityQueue<Integer> answer;
    public static int N, M, K, X;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언

        //입력값 받기
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        N = Integer.parseInt(stringTokenizer.nextToken());
        M = Integer.parseInt(stringTokenizer.nextToken());
        K = Integer.parseInt(stringTokenizer.nextToken());
        X = Integer.parseInt(stringTokenizer.nextToken());

        //초기화
        map = new ArrayList[N + 1];
        for (int i = 1; i < N + 1; i++) {
            map[i] = new ArrayList<>();
        }

        visited = new int[N + 1];
        for (int i = 1; i < N + 1; i++) {
            visited[i] = -1;
        }

        //엣지 연결
        for (int i = 0; i < M; i++) {
            stringTokenizer = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(stringTokenizer.nextToken());
            int E = Integer.parseInt(stringTokenizer.nextToken());
            map[S].add(E);
        }

        //X에서 출발하여 BFS 최단거리가 K인 도시를 오름차순으로 출력. 없으면 -1 출력.
        BFS(X);
        answer = new PriorityQueue();
        for(int i=0; i<=N; i++){
            if(visited[i]==K) answer.add(i);
        }

        if(answer.isEmpty()) System.out.println("-1");
        for(int a : answer){
            System.out.println(a);
        }
    }

    private static void BFS(int X) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(X);
        visited[X]++;

        while (!queue.isEmpty()) {
            int now = queue.poll();

            for (int i : map[now]) {
                if (visited[i] == -1) {
                    queue.add(i);
                    visited[i] = visited[now] + 1;
                }
            }
        }
    }
}