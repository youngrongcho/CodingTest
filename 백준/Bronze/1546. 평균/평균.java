import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언
        int count = Integer.parseInt(br.readLine()); //String
        String[] grades = br.readLine().split(" ");//String

        List<Integer> gradeList = Arrays.stream(grades).map(Integer::parseInt).collect(Collectors.toList());
        Integer max = Collections.max(gradeList);

        double average = gradeList.stream().mapToDouble(i -> i).map(i -> i / max * 100).average().getAsDouble();

        System.out.println(average);
    }
}