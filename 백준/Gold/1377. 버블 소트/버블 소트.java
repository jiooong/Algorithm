import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Data implements Comparable<Data>{

    int idx;
    int number;

    public Data(int idx, int number){
        this.idx = idx;
        this.number = number;
    }

    @Override
    public int compareTo(Data o){
        return this.number - o.number;
    }

}

public class Main {
    public static void main(String[] ars) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        Data[] data = new Data[num];

        for(int i=0; i<num; i++) {
            data[i] = new Data(i, Integer.parseInt(br.readLine()));
        }

        Arrays.sort(data); // 오름차순 정렬이 된다

        int max = 0;
        for(int i=0; i<num; i++){
            //정렬된애의 첫번쨰 인덱스 에서 제일 앞에꺼를 뺴라 ??
            if(data[i].idx - i > max){
                max = data[i].idx - i;
            }
        }
        System.out.println(max + 1);


    }
}
