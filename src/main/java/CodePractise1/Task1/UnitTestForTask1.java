package CodePractise1.Task1;


import org.junit.Assert;
import org.junit.Test;
/**
 * Created by Valiantsin_Samakhave on 10/17/2018.
 */

public class UnitTestForTask1 {
    @Test
    public void Test1(){
        double x = 10;
        double y = 5;
        double expected = 10.000566430841982;
        Task1 task = new Task1();
        double result = task.formula(x,y);
        Assert.assertEquals(expected , result ,  0.0000001);
    }
    @Test
    public void Test2(){
        double x = 0;
        double y = 0;
        double expected = 0.5;
        Task1 task = new Task1();
        double result = task.formula(x,y);
        Assert.assertEquals(expected , result ,  0.0000001);
    }
    @Test
    public void Test3(){
        double x = 45;
        double y = 45;
        double expected = 0.5; // incorrect expected value
        Task1 task = new Task1();
        double result = task.formula(x,y);
        Assert.assertEquals(expected , result ,  0.0000001);
    }
}
