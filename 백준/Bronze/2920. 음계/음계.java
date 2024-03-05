import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] arr;
    static int count = 8;
    public static String DFS(int n, String answer){
        if (n == 8) {
            return answer;
        }
        if(n < count){
            answer += arr[n]+"";
            return DFS(n+1, answer);
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        arr = new int[str.length];
        for(int i=0; i<str.length; i++){
            arr[i] = Integer.parseInt(str[i]);
        }

        String asc = "12345678";
        String des = "87654321";

        String ans = DFS(0, "");

        if(ans.equals(asc)){
            System.out.println("ascending");
        }else if(ans.equals(des)){
            System.out.println("descending");
        }else {
            System.out.println("mixed");
        }
    }
}