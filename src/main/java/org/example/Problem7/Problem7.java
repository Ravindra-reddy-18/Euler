package org.example.Problem7;
import java.util.function.Predicate;

public class Problem7 {
    public static void main(String[] args){
        int count=0,res;
        Predicate<Integer> p=n->{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0)return false;
            }
            return true;
        };
        for(int i=2;;i++){
            if(p.test(i))count++;
            if(count==10001){res=i;break;}
        }
        System.out.println(res);
    }
}
