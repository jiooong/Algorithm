
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuilder sb =new StringBuilder();
        int[] arr = new int[num];
        for(int i=0; i<num; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Stack<Integer> stack = new Stack<>();
        int idx = 0;
        int number = 1;
        boolean result = true;
        for(int i=0; i<num; i++) {
            // 4,3,6,8,7,5 등등
            int count = arr[i];
            if (count >= number) {
                while (count >= number) {
                    stack.push(number++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            } else {
                int n = stack.pop();
                if (n > count) {
                    System.out.println("NO");
                    result = false;
                    break;
                } else {
                    sb.append("-\n");
                }
            }

        }
        if(result){
            System.out.print(sb.toString());
        }
    }
}

