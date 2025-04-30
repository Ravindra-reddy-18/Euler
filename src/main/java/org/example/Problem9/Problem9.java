package org.example.Problem9;

public class Problem9 {
    static boolean tri(int a,int b,int c){
        return a*a+b*b==c*c;}
    public static void main(String[] arfs){
       for(int a=1;a<=332;a++){
           for(int b=a+1;b<(1000-a)/2;b++){
               int c=1000-a-b;
               if(tri(a,b,c)){System.out.println(a*b*c);return;}
           }
       }
    }
}
