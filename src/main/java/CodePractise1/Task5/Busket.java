package CodePractise1.Task5;

import java.util.ArrayList;

/**
 * Created by Valiantsin_Samakhave on 10/20/2018.
 */
public class Busket {
    private ArrayList<Ball> balls = new ArrayList<Ball>();
    private static final Busket instance = new Busket();

    private Busket(){
    }

    public static Busket getInstance(){
        return instance;
    }

    public void addBalls(Ball b) {
        balls.add(b);
    }

    public int ballsWeight(){
        int weight=0;
        for(Ball b : balls){
            weight+=b.getWeight();
        }
        return weight;
    }

    public int blueBalls(){
        int count = 0;
        for(Ball b : balls){
            if(b.getColor().equals("Blue")){
                count++;
            }
        }
        return count;
    }
}
