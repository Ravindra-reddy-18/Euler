package ProblemSix;

public class ProblemSIx {
    public static void main(String[] args){
        int sum2=0,sumo2=0;
        for(int i=1;i<=100;i++){
            sumo2+=i;
            sum2+=(int)Math.pow(i,2);
        }
        System.out.println((int)Math.pow(sumo2,2)-sum2);
        //(n(n+1)/2)^2-n(n+1)(2n+1)/6
        //System.out.println((int)Math.pow(50*101,2)-100*101*201/6);
    }
}
