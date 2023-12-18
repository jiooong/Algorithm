import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
       	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        br.close();
        bw.write(s);
        bw.flush(); // 남은 값 출력 & 버퍼 초기화
        bw.close(); 
        
    }
}