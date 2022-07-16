package num11659;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

      int N = Integer.parseInt(stringTokenizer.nextToken());
      int M = Integer.parseInt(stringTokenizer.nextToken());


      long[] arr = new long[N+1]; //배열의 인덱스는 0부터 시작하기 때문에 +1을 해주어야한다.
      stringTokenizer = new StringTokenizer(bufferedReader.readLine());

      for(int i=1; i<=N; i++){
          arr[i] = arr[i-1]+Integer.parseInt(stringTokenizer.nextToken());
      }

      for(int j=0; j<M; j++){
          stringTokenizer = new StringTokenizer(bufferedReader.readLine());
          int s = Integer.parseInt(stringTokenizer.nextToken());
          int e = Integer.parseInt(stringTokenizer.nextToken());

          System.out.println(arr[e]-arr[s-1]);
      }


  }
}
