import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson1 {
    public static void main(String[] args) {
        int i=1;
        BufferedReader buffy = new BufferedReader(new InputStreamReader(System.in));
        while(i>0) {
            System.out.println("\n\n=======================================================\nWhat task would you check?");
            System.out.println("Enter 0 for exit");
            try {
                i = Integer.parseInt(buffy.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
            switch (i) {
                case 1:
                    task1();
                    break;
                case 2:
                    task2();
                    break;
                case 3:
                    task3();
                    break;
                case 4:
                    task4();
                    break;
                case 5:
                    task5();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("The max number is 5");
            }
        }
    }
    private static void task1(){
        System.out.println("Hello World!");
    }
    private static void task2(){
        System.out.println("Ivanov Ivan Ivanich");
        System.out.println("Minsk Nezavisimosti sq. 123");
        System.out.println("+375291234567");
    }
    private static void task3(){
        System.out.println("Пройдет много лет, и полковник Аурелиано Буэндиа, стоя у стены в ожидании расстрела,\nвспомнит тот далекий вечер, когда отец взял его с собой посмотреть на лед. Макондо было\nтогда небольшим селением с двумя десятками хижин, выстроенных из глины и бамбука на\nберегу реки, которая мчала свои прозрачные воды … ");
    }
    private static void task4(){
        BufferedReader buffy = new BufferedReader(new InputStreamReader(System.in));
        int a = 0,b = 0;
        try {
        System.out.println("Enter the fist catheter please");
        a = Integer.parseInt(buffy.readLine());
        System.out.println("Enter the second catheter please");
        b = Integer.parseInt(buffy.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Hypotenuse = "+Math.sqrt(a*a+b*b));
        System.out.println("Triangle area = "+a*b/2);
    }
    private static void task5(){
        BufferedReader buffy = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        int sum=0;
        try {
            for (int i = 1; i < 5; i++) {
                System.out.print("Enter term" + i + " = ");
                arr[i] = Integer.parseInt(buffy.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(int i=1;i<5;i++){
            sum+=arr[i];
        }
        System.out.println("Sum = "+sum);
    }
}
