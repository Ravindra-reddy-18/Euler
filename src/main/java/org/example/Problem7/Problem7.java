package org.example.Problem7;

public class Problem7 {

    static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)return false;
        }
        return true;
    }
    public static void main(String[] args){
        int count=0,res;
        for(int i=2;;i++){
            if(isPrime(i))count++;
            if(count==10001){res=i;break;}
        }
        System.out.println(res);
    }
}
