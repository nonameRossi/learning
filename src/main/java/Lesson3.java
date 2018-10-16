/**
 * Created by Valiantsin_Samakhave on 9/20/2018.
 */

/* I didn't understand the first task from the third lesson. How i can decompose simple code into one operation methods? */

import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        formula1();
        System.out.println(formula2());
    }

    private static void formula1() {
        Scanner sc = new Scanner(System.in);
        int a=0,b=0,h=0;
        System.out.print("Enter a (distance start): ");

        if (sc.hasNextInt()) {
            a = sc.nextInt();
        }
        System.out.print("Enter b (distance finish): ");
        if (sc.hasNextInt()) {
            b = sc.nextInt();
        }
        System.out.print("Enter h (step): ");
        if (sc.hasNextInt()) {
            h = sc.nextInt();
        }
        if(a>=b) {
            System.out.println(" A >= B. F(x) cannot be counted.");
        }
        else {
            while(b>a){
                System.out.println(2*Math.tan(a/2)+1);
                a+=h;
            }
            System.out.println("FINISH");
        }
    }

    private static double formula2() {
        Scanner sc = new Scanner(System.in);
        double x=0;
        if(sc.hasNextDouble()){
            x = sc.nextDouble();
        }
        if(-3<x&&x<=3){
            System.out.println("-3<X<=3 return 0");
            return 0;
        }
        if(x<=-3){
            return 9;
        }
        else{
            return 1/(x*x+1);
        }
    }
}


