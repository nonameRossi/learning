package CodePractise1.Task2;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Valiantsin_Samakhave on 10/20/2018.
 */
public class UnitTestsForTask2 {
    @Test
    public void Test1(){
        Poligom pol = Poligom.getInstance();
        pol.setXarray(new int[]{1, 1, 3, 3, -3, -3, -1, -1});
        pol.setYarray(new int[]{3, 0, 0, -2, -2, 0, 0, 3});
        Assert.assertTrue(IsPointInPoligom.PointChecker(0,0));
    }
    @Test
    public void Test2(){
        Poligom pol = Poligom.getInstance();
        pol.setXarray(new int[]{1, 1, 3, 3, -3, -3, -1, -1});
        pol.setYarray(new int[]{3, 0, 0, -2, -2, 0, 0, 3});
        Assert.assertTrue(!IsPointInPoligom.PointChecker(3,3));
    }
}
