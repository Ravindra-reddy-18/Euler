package org.example.ProblemOne;

public class ProblemOne {

    //method to find sum of multiples of 3 or 5 below a specified number x
    public static int sumOfMultiples(int x){
        int sum=0;
        for(int i=3;i<x;i++){
            if(i%3==0||i%5==0)
                sum+=i;
        }
        return sum;
    }

    public static void main(String[] args){
        System.out.println("The sum of multiples of 3 or 5 below 1000 is = "+sumOfMultiples(1000));
    }
}
