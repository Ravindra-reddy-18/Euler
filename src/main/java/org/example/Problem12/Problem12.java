package org.example.Problem12;
public class Problem12 {
    static int count(long n){
        int count=0;
        for(long i=1;i*i<=n;i++){
            if(n%i==0){
                count+=2;
                if(n/i==i)count--;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int i;
        int count;
        long start=System.currentTimeMillis();
      for(i=1;;i++){
          if(i%2==0) {
          count=count(i/2)*count(i+1);
          }
          else{
              count=count(i)*count((i+1)/2);
          }
          if(count>500)break;
      }
      System.out.println(System.currentTimeMillis()-start);
     System.out.println(i*(i+1)/2);
    }
}
