import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int answer;
    static String[] DNA = {"A", "C", "G", "T"};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        Map<String, Integer> check = new HashMap<>();
        Map<String, Integer> current = new HashMap<>();
        String[] str = br.readLine().split("");

        st = new StringTokenizer(br.readLine());
        for(String s : DNA) {
            check.put(s, Integer.parseInt(st.nextToken()));
            current.put(s, 0);
        }

        for(int i = 0; i < P; i++)
            current.put(str[i], current.get(str[i]) + 1);
        valid(current, check);

        for(int i = 1; i <= str.length - P; i++) {
            current.put(str[i - 1], current.get(str[i - 1]) - 1);
            current.put(str[i + P - 1], current.get(str[i + P - 1]) + 1);
            valid(current, check);
        }
        System.out.println(answer);
        br.close();
    }

    private static void valid(Map<String, Integer> current, Map<String, Integer> check) {
        for(String s : DNA) {
            if(current.get(s) < check.get(s))
                return;
        }
        answer++;
    }
}