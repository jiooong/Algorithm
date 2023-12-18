import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        String a = st.nextToken();
        String b = st.nextToken();
        
        int sum = Integer.parseInt(a)+Integer.parseInt(b);
        System.out.printf("%s + %s = %d", a,b,sum);
    }
}