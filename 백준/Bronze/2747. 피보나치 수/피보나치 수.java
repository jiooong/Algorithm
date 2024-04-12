import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static int[] check;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        check = new int[n+1];
        check[0] = 0;
        check[1] = 1;
        for(int i=2; i<=n; i++){
            check[i] = check[i-1] + check[i-2];
        }
        System.out.println(check[n]);
    }

}