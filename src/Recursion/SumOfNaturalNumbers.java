package Recursion;

import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        sum(n,1,sum);


    }
    static void sum(int n,int k, int sum){
        if (k>n) {
            System.out.println(sum);
            return;
        }
        sum = sum+k;
        sum(n,k+1,sum);

    }
}