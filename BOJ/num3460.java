import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseNum = Integer.parseInt(br.readLine());


        for(int i=1; i<=caseNum; i++){
            int Num = Integer.parseInt(br.readLine());
            List<Integer> list = new ArrayList<>();
            while(Num>0){
                list.add(Num%2);
                Num = Num / 2;
            }
            for(int j=0; j<list.size(); j++){
                if(list.get(j)==1){
                    System.out.print(j +" ");
                }
            }
        }
    }
}
