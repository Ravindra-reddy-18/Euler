package org.example.Problem2;

public class ProblemTwo {

    public static int fibEvenSum(int max){
        int a=1,b=2,c,sum=b;
        while((c=a+b)<max){
            a=b;
            b=c;
            if((c&1)==0)sum+=c;
        }
        return sum;
    }
    public static void main(String... args){
        System.out.println(fibEvenSum(4_000_000));
    }
}
