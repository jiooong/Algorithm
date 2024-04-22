/////////////////////////////////////////////////////////////////////////////////////////////
// 기본 제공코드는 임의 수정해도 관계 없습니다. 단, 입출력 포맷 주의
// 아래 표준 입출력 예제 필요시 참고하세요.
// 표준 입력 예제
// int a;
// double b;
// char g;
// String var;
// long AB;
// a = sc.nextInt();                           // int 변수 1개 입력받는 예제
// b = sc.nextDouble();                        // double 변수 1개 입력받는 예제
// g = sc.nextByte();                          // char 변수 1개 입력받는 예제
// var = sc.next();                            // 문자열 1개 입력받는 예제
// AB = sc.nextLong();                         // long 변수 1개 입력받는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
// 표준 출력 예제
// int a = 0;                            
// double b = 1.0;               
// char g = 'b';
// String var = "ABCDEFG";
// long AB = 12345678901234567L;
//System.out.println(a);                       // int 변수 1개 출력하는 예제
//System.out.println(b); 		       						 // double 변수 1개 출력하는 예제
//System.out.println(g);		       						 // char 변수 1개 출력하는 예제
//System.out.println(var);		       				   // 문자열 1개 출력하는 예제
//System.out.println(AB);		       				     // long 변수 1개 출력하는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.*;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
	public static void main(String args[]) throws Exception
	{        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        int T;
        T=Integer.parseInt(br.readLine());

        int[] arr = {2,3,5,7,11};
        
        for(int test_case = 1; test_case <= T; test_case++)
        {
int[] answer = new int[arr.length];
            int a = Integer.parseInt(br.readLine());
            while(a%2==0) {
                answer[0] += 1;
                a = a/2;
            }
            while(a%3==0) {
                answer[1] += 1;
                a = a/3;
            }
            while(a%5==0) {
                answer[2] += 1;
                a = a/5;
            }
            while(a%7==0) {
                answer[3] += 1;
                a = a/7;
            }
            while(a%11==0) {
                answer[4] += 1;
                a = a/11;
            }
            System.out.printf("#%d", test_case);
            for(int j=0; j< answer.length; j++){
                System.out.printf(" %d",answer[j]);
            }
        System.out.println();
    }
}
}
