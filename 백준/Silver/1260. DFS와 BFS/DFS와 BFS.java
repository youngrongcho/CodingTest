import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static List<Integer>[] A;
    static boolean[] visited;
    static List<Integer> dfsAnswer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        int V = Integer.parseInt(stringTokenizer.nextToken());

        //초기화
        dfsAnswer = new ArrayList<>();
        A = new ArrayList[N+1];
        visited = new boolean[N+1];

        for(int i=1; i<N+1; i++){
            A[i] = new ArrayList<>();
        }

        //양방향 엣지 연결
        for(int i=0; i<M; i++){
            stringTokenizer = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(stringTokenizer.nextToken());
            int E = Integer.parseInt(stringTokenizer.nextToken());
            A[S].add(E);
            A[E].add(S);
        }

        for(int i=1; i<N+1; i++){
            Collections.sort(A[i]);
        }

        List<Integer> dfs = DFS(V, dfsAnswer);
        visited = new boolean[N+1];
        List<Integer> bfs = BFS(V);

        System.out.println(dfs.toString().substring(1,dfs.toString().length()-1).replaceAll(",", ""));
        System.out.println(bfs.toString().substring(1,dfs.toString().length()-1).replaceAll(",", ""));
    }
    public static List<Integer> DFS(int v, List<Integer> dfsAnswer){
        if(visited[v]) {
            return dfsAnswer;
        }
        visited[v] = true;
        dfsAnswer.add(v);
        for(int i : A[v]){
            if(!visited[i]){
                DFS(i, dfsAnswer);
            }
        }
        return dfsAnswer;
    }
    public static List<Integer> BFS(int v){
        List<Integer> answer = new ArrayList<>();
        Queue queue = new LinkedList<Integer>();
        queue.add(v);
        visited[v] = true;

        while(!queue.isEmpty()){
            int poll = (int) queue.poll();
            for(int i : A[poll]){
                if(!visited[i]){
                    queue.add(i);
                    visited[i] = true;
                }
            }
            answer.add(poll);
        }
        return answer;
    }
}