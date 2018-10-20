package CodePractise1.Task3;

import java.util.ArrayList;

/**
 * Created by Valiantsin_Samakhave on 10/20/2018.
 */
public class Formula {
    public void tang(int a, int b ,int h) {
        ArrayList<Double> list = new ArrayList<Double>();
        if (a >= b) {
            System.out.println(" A >= B. F(x) cannot be counted.");
        } else {
            System.out.println("Argument       | Result ");
            while (b > a) {
                System.out.println("Argument " + a + " Result " + Math.tan(a));
                a += h;
            }
            System.out.println("FINISH");
        }
    }
}
