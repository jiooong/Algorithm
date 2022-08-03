import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int minNum = (num1>num2) ? num2 : num1 ;
        int resultNum = 1;

        for(int i=2; i<=minNum; i++){
            if((num1%i==0) && (num2%i==0)){
                resultNum*=i;
                num1 = num1/i;
                num2 = num2/i;
            }
        }

        for(int i=2; i<=resultNum; i++){
            if((num1%i==0) && (num2%i==0)){
                resultNum*=i;
                num1 = num1/i;
                num2 = num2/i;
            }
        }

        int secondresultNum = resultNum * num1 * num2;

        System.out.println(resultNum);
        System.out.println(secondresultNum);
    }
}
