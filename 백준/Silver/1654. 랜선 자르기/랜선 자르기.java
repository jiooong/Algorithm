import com.sun.source.tree.Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int K = Integer.parseInt(str[0]);
        int N = Integer.parseInt(str[1]);

        long[] arr = new long[K];
        long max = 0;
        for(int i=0; i<K; i++){
            arr[i] = Long.parseLong(br.readLine());
            max = Math.max(arr[i], max);
        }

        // 최대 랜선의 길이를 구해라
        // N 보다 크거나 같아야한다. ! upperbound

        long start = 1;
        long end = max;
        long answer = 0;
        while(start<=end){
            long middle = (start + end)/2;
            int count = 0;
            for(int i=0; i<K; i++){
                count += arr[i]/middle;
            }
            if(count >= N){
                answer = middle;
                start = middle + 1;
            }else{ //count <=N
                end = middle - 1;
            }
        }

        System.out.println(answer);

    }
}
