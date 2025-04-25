package org.example.ProblemFive;

public class ProblemFive {
    public static void main(String[] args){
        //O(1)
        //System.out.println(5*7*9*11*13*16*17*19);
        //brute force O(n)
        for(int i=2520;;i++){
            if(i%5==0&&i%7==0&&i%9==0&&i%11==0&&i%13==0&&i%16==0&&i%17==0&&i%19==0)
            {System.out.println(i);
                break;
            }
        }
    }
}
