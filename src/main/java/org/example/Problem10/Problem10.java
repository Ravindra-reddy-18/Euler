package org.example.Problem10;

public class Problem10 {

    static boolean isPrime(int a){
        for(int i=2;i<=Math.sqrt(a);i++)
            if(a%i==0)
                return false;
        return true;
    }
    public static void main(String[] args){
        long sum=2;
        for(int i=3;i<2_000_000;i++)
            if(isPrime(i))sum+=i;
        System.out.println(sum);
    }
}
