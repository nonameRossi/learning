package CodePractise1.Task5;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Valiantsin_Samakhave on 10/20/2018.
 */
public class UniteTestBasketball {
    @Test
    public void Test1(){
        Ball b = new Ball(5, "Blue");
        Assert.assertEquals(b.getWeight(),5);
    }
    @Test
    public void Test2(){
        Busket busk = Busket.getInstance();
        for(int i = 0;i<50;i++ ) {
            busk.addBalls(new Ball(i+1, "Blue"));
        }
        Assert.assertEquals(busk.ballsWeight(),1275);
    }
    @Test
    public void Test3(){
        Busket busk = Busket.getInstance();
        busk.addBalls(new Ball(1, "Yellow"));
        busk.addBalls(new Ball(1, "Green"));
        Assert.assertEquals(busk.blueBalls(),50);
    }
}
