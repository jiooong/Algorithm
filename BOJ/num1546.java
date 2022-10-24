package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int A[] = new int[n];
        long max = 0;
        long sum=0;
        for(int i=0; i<n; i++){
            A[i]=scanner.nextInt();
            if(A[i]>max){
                max=A[i];
            }
            sum+=A[i];
        }
        System.out.println(sum*100.0/max/n);

        }
    }
