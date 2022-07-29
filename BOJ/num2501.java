import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        int num1 = Integer.parseInt(st.nextToken());

        ArrayList<Integer> arr = new ArrayList<Integer>();

        for(int i=1; i<=num; i++){
            if(num%i == 0){
               arr.add(i);
            }
        }

        if(arr.size()>=num1){
            System.out.println(arr.get(num1-1));
        }else {
            System.out.println(0);
        }
    }
}
