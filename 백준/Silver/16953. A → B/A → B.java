import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int b = 0;
    static int answer = -1;

    static void DFS(int a, int cnt) {
        if (a == b) {
            answer = cnt;
            return;
        } else if (a > b) {
            return;
        } else {
            cnt++;
            DFS(a * 2, cnt);
            try {
                int a1 = Integer.parseInt(a + "1");
                DFS(a1, cnt);
            } catch (NumberFormatException e) {
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b1 = Integer.parseInt(arr[1]);

        b = b1;

        DFS(a, 1);

        System.out.println(answer);
    }
}
