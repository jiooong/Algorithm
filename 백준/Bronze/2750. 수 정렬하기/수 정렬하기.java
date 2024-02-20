import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[Integer.parseInt(br.readLine())];

        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

  
        for(int j=0; j<arr.length; j++){
        for(int i=0; i<arr.length-j-1; i++){
            if(arr[i+1] < arr[i]){
                int num = arr[i]; // 현재 i값 
                arr[i] = arr[i+1];
                arr[i+1] = num;
            }
        }
        }

        for(int i : arr){
            System.out.println(i);
        }
    }
}
