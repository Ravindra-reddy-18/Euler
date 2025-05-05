package org.example.Problem12;
import java.time.LocalTime;
public class Problem12 {
    static boolean _500Factors(long n){
        int count=2;
        for(long i=1;i*i<=n;i++){
            if(n%i==0){
                count+=2;
                if(n/i==i)count--;
            }
        }
        return count>500;
    }
    public static void main(String[] args){
        long n=0;
        System.out.println(LocalTime.now());
      for(int i=1;;i++){
          n+=i;
          if(_500Factors(n)){System.out.println(n+"\n"+LocalTime.now());return;}
      }
    }
}
