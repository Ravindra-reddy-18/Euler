package org.example.Problem9;

public class Problem9 {
    static boolean tri(int a,int b,int c){return Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2);}
    public static void main(String[] arfs){
        for(int c=997;c>0;c--){
         for(int b=2;b<c;b++){
        for(int a=1;a<b;a++){
            if(a+b+c==1000&&tri(a,b,c)){System.out.println(a*b*c);return;}
                }
            }
        }
    }
}
