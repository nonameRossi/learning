package CodePractise1.Task4;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by Valiantsin_Samakhave on 10/20/2018.
 */
public class UnitTestforPrimeNumber {
    @Test
    public void Test1(){
        PrimeNumber testobject = new PrimeNumber();
        ArrayList<Integer> testdata = new ArrayList<Integer>();
        ArrayList<Integer> expected = new ArrayList<Integer>();
        for(int i=0;i<20;i++){
            testdata.add(i);
        }
        for(int i=2;i<20;i++){
            int flag =1;
            for(int check = 2; check < i; ++check) {
                if(i % check == 0) {
                    flag = 0;
                }
            }
            if(flag==1){
            expected.add(i);
            }
        }
        Assert.assertTrue(testobject.findPrimeNumber(testdata).equals(expected));
    }
    @Test
    public void Test2(){
        PrimeNumber testobject = new PrimeNumber();
        ArrayList<Integer> testdata = new ArrayList<Integer>();
        ArrayList<Integer> expected = new ArrayList<Integer>();
        for(int i=20;i<100;i++){
            testdata.add(i);
        }
        for(int i=20;i<100;i++){
            int flag =1;
            for(int check = 2; check < i; ++check) {
                if(i % check == 0) {
                    flag = 0;
                }
            }
            if(flag==1){
                expected.add(i);
            }
        }
        Assert.assertTrue(testobject.findPrimeNumber(testdata).equals(expected));
    }
}
