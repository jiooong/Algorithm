import com.sun.source.tree.Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]); // 입국심사대의 수
        long M = Long.parseLong(str[1]); // 사람의 수

        long[] arr = new long[N];
        for(int i=0; i<N; i++){
            arr[i]= Long.parseLong(br.readLine());
        }

        Arrays.sort(arr);

        long min = 1;
        long max = arr[arr.length-1] * M;
        long answer = max;

        // 걸리는 시간을 기준으로 이분탐색
        while(min <= max){
            long middle = (min + max)/2;
            long num = 0;
            for(int i=0; i<arr.length; i++){
                num += middle/arr[i]; // 몇명씩 처리가능한지
                if(num>=M){break;}
            }
            // 같은 값이 나오면 최소값
            if(num<M){
                min = middle + 1;
            }else{
                answer = middle;
                max = middle - 1;
            }
        }

        System.out.println(answer);
    }
}
