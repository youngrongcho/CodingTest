import java.io.*;
import java.util.*;

public class Main {
    public static ArrayList<Integer>[] A;
    public static boolean[] visited;
    public static int[] count;
    public static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언

        //입력값 받기
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        N = Integer.parseInt(stringTokenizer.nextToken());
        M = Integer.parseInt(stringTokenizer.nextToken());

        //초기화
        count = new int[N + 1];
        A = new ArrayList[N + 1];

        for (int i = 1; i <= N; i++) {
            A[i] = new ArrayList<>();
        }

        //양방향 엣지 연결
        for (int i = 0; i < M; i++) {
            stringTokenizer = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(stringTokenizer.nextToken());
            int E = Integer.parseInt(stringTokenizer.nextToken());
            A[S].add(E);
        }

        //탐색 통해서 확인 후, count 배열에 기록
        for (int i = 1; i <= N; i++) {
            visited = new boolean[N + 1];
            BFS(i);
        }

        int max = Arrays.stream(count).max().getAsInt();
        PriorityQueue<Integer> answer = new PriorityQueue<>();
        for (int i = 1; i <= N; i++) {
            if (count[i] == max) answer.add(i);
        }
        String str = "";
        for(int s : answer){
            str += s + " ";
        }
        System.out.println(str);
    }

    public static void BFS(int X) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(X);
        visited[X] = true;
        while (!queue.isEmpty()) {
            int now = queue.poll();
            for (int a : A[now]) {
                if (!visited[a]) {
                    queue.add(a);
                    visited[a] = true;
                    count[a]++;
                }
            }
        }
    }
}