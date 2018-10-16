package Lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Valiantsin_Samakhave on 10/16/2018.
 */
public class Lesson5 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffy = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many fractions you want set?");
        int k = Integer.parseInt(buffy.readLine());
        Fraction[] f = new Fraction[k];
        for(Fraction a : f){
            System.out.println("Enter N : ");
            int n = Integer.parseInt(buffy.readLine());
            System.out.println("Enter M : ");
            int m = Integer.parseInt(buffy.readLine());
            a = new Fraction(n,m);
        }
    }
}
