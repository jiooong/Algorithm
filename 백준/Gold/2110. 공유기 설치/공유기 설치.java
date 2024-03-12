import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int C = Integer.parseInt(arr[1]);

        int[] num = new int[N];
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(num);

        int start = 1; // 최소거리
        int end = num[N-1]-num[0]; // 최대거리

        int result = 0;
        while(start <= end){

            int be = num[0]; // 시작
            int middle = (end+start)/2;
            int count = 1;
            for(int i=1; i<N; i++){
                if(num[i] - be >= middle){
                    count++;
                    be = num[i];
                }
            }

            if(count >= C){
                result = middle;
                start = middle+1; // 간격이 좁아서 넓혀야해 -> 큰수로 나눠야하고
            }else{
                end = middle-1; // 간격이 넓어서 줄여야함 -> 작은수로 나눠야해
            }
        }

        System.out.println(result);
    }
}