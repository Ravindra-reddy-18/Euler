package org.example.ProblemThree;

public class ProblemThree {

//method to check if a factor is prime
    public static boolean isPrime(long a){
        for(long i=2;i<=Math.sqrt(a);i++){
            if(a%i==0)return false;
        }
        return true;
    }
    //filters factors and calls isPrime
    public static long factors(long x){
        for(long i=(long)Math.sqrt(x);i>1;i--){
            if(x%i==0&&isPrime(i))return i;
        }
        return -1;
    }
    public static void main(String[] args){
        long x=600851475143l;
        long res=factors(x);
       if(res!=-1)
            System.out.println("The biggest prime factor is = "+res);
       else
           System.out.println(x+" is the biggest prime factor of itself!!");
    }
}
