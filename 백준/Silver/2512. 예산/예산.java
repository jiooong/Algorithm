
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        long[] arr = new long[N];
        long max = 0;
        for(int i=0; i<N; i++){
            arr[i] = Long.parseLong(str[i]);
            max = Math.max(arr[i], max);
        }
        long K = Long.parseLong(br.readLine());

        long start = 1;
        long end = max;
        long answer = 0;
        while(start<=end){
            long middle = (start + end)/2;
            int count = 0;
            for(int i=0; i<N; i++){
                if(middle<=arr[i]){
                    count+=middle;
                }else{
                    count+=arr[i];
                }
            }
            if(count <= K){
                answer = middle;
                start = middle + 1;
            }else{ //count<=N
                end = middle - 1;
            }
        }

        if(answer == 0){
            answer = max;
        }
        System.out.println(answer);

    }
}
