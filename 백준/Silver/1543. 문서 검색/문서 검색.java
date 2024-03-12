import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String find = br.readLine();

        int start = 0;
        int end = str.length() - find.length();
        int count = 0;
        while(start <= end) {
            int middle = start + find.length();
            if(str.substring(start, middle).equals(find)){
                start += find.length();
                count++;
            }else{
                start += 1;
            }
        }

        System.out.println(count);

    }
}