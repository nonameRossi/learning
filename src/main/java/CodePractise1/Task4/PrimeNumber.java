package CodePractise1.Task4;

import java.util.ArrayList;

/**
 * Created by Valiantsin_Samakhave on 10/20/2018.
 */
public class PrimeNumber {
    public ArrayList<Integer> findPrimeNumber(ArrayList<Integer> list){
        ArrayList<Integer> prime = new ArrayList<Integer>();
        int i,m=0,flag=0;
        for(int j : list){
            flag=0;
            m=j/2;
            if(!(j==0||j==1)){
                for(i=2;i<=m;i++){
                    if(j%i==0){
                        flag=1;
                        break;
                    }
                }
                if(flag==0)  {
                    prime.add(j);
                }
            }
        }
        return prime;
    }
}
