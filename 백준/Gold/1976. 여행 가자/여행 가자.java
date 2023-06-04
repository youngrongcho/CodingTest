import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static int[][] matrix;
    public static int N, M;
    public static int[] root;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언

        //입력값 받기
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        //초기화 및 연결
        matrix = new int[N][N];
        StringTokenizer stringTokenizer;
        for (int i = 0; i < N; i++) {
            stringTokenizer = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                matrix[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }

        root = new int[N+1];
        for (int i = 1; i <= N; i++) {
            root[i] = i;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (matrix[i][j] == 1) unoin(i, j);
            }
        }

        String[] cities = br.readLine().split(" ");
        List<Integer> list = Arrays.stream(cities)
                .map(Integer::parseInt)
                .map(i -> find(i - 1))
                .distinct().collect(Collectors.toList());

        if(list.size()==1) System.out.println("YES");
        else System.out.println("NO");
    }

    private static void unoin(int i, int j) {
        i = find(i);
        j = find(j);
        if (i != j) root[j] = i;
    }

    private static int find(int i) {
        if (i == root[i]) {
            return i;
        } else return root[i] = find(root[i]);
    }
}