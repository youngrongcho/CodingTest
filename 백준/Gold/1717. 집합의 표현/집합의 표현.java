import java.io.*;
import java.util.*;

public class Main {
    public static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언

        //입력값 받기
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        //유니온 파인드 문제.

        //유니온 파인드 일차원 배열 만들기 및 루트 초기화
        arr = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            arr[i] = i;
        }

        //0 a b -> a와 b를 같은 집합으로 묶기(대표 노드끼리 연결)
        //1 a b -> a와 b가 같은 집합인지 확인 후 출력
        for (int i = 0; i < M; i++) {
            stringTokenizer = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(stringTokenizer.nextToken());
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());

            if (first == 0) {
                union(a, b);
            } else {
                if (checkSame(a, b)) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }

    private static void union(int a, int b) {
        a = find(a);
        b = find(b);
        if (a != b) {
            arr[b] = a;
        }
    }

    private static boolean checkSame(int a, int b) {
        a = find(a);
        b = find(b);
        return a == b;
    }

    private static int find(int a) {
        if (a == arr[a]) return a;
        else return arr[a] = find(arr[a]);
    }
}