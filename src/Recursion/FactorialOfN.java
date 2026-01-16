package Recursion;

import java.util.Scanner;

public class FactorialOfN {

    // static void fact(int n, int fac,int i){
    // if(n==1 || n==0) {
    // System.out.println(1);
    // return;
    // }
    //
    // else if(n<i) {
    //// fac = fac*i;
    // System.out.println(fac);//
    //// n=5 Fac = 1, i = 3
    //// n=5 fac = 2, i = 4
    //// n=5 fac = 6, i = 5
    //// n=5 fac = 24, i = 6 Ans 120
    //
    // return;
    // }
    //
    // fac = fac*i;
    // fact(n,fac,i+1);
    // }

    static void fact(int n, int fac) {
        if (n == 1 || n == 0) {
            System.out.println(1);
            return;
        }

        else if (n == 2) {
            fac = fac * 2;
            System.out.println(fac);//
            // n=5 Fac = 5 call n = 4
            // n=4 fac = 20, n = 3
            // n=3 fac = 60, i = 2
            // n=2 fac = 120, i = 1 Ans 120

            return;
        }

        fac = fac * n;
        fact(n - 1, fac);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fact(n, 1);
    }
}
