package org.example.ProblemFour;

public class ProblemFour {
    public static boolean isPalindrome(int a){
        StringBuilder sb=new StringBuilder(a+"");
        return (a+"").contentEquals(sb.reverse());
    }
    public static void main(String[] args){
        int max=0;
        A:for(int i=999;i>=100;i--){
            for(int j=999;j>=100;j--){
                if(isPalindrome(i*j)){if(i*j>max)max=i*j;break;}
            }
        }
        System.out.println(max);
    }
}
