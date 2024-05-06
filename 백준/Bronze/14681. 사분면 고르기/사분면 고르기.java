import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        if (0 < x ) {
            if (0 < y ) {
                System.out.println(1);
            } else if (0 > y ) {
                System.out.println(4);
            } else if (y == 0) {
                System.out.println(1);
            }
        } else if (0 > x ) {
            if (0 < y ) {
                System.out.println(2);
            } else if (0 > y ) {
                System.out.println(3);
            } else if (y == 0) {
                System.out.println(2);
            }
//        }else if(x==0){
//            if(0<y && y<=5){
//                System.out.println(1);
//            }else if(0>y && y>=-5){
//                System.out.println(4);
//            }else if(y==0){
//                System.out.println(1);
//            }
//        }
        }
    }
}
