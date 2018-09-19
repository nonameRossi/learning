import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson2 {
    public static void main(String[] args) throws IOException {
        int i = 1;
        BufferedReader buffy = new BufferedReader(new InputStreamReader(System.in));
        while (i > 0) {
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
                case 0:
                    break;
                default:
                    System.out.println("The max number is 2");
            }
        }
    }
    private static void task1() throws IOException {
        BufferedReader buffy = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a : ");
        int a = Integer.parseInt(buffy.readLine());
        System.out.print("Enter b : ");
        int b = Integer.parseInt(buffy.readLine());
        System.out.print("Enter c : ");
        int c = Integer.parseInt(buffy.readLine());
        double result = (b+Math.sqrt(b*b+4*a*c))/2*a-a*a*a*c+b;
        System.out.println("Result = "+result);
    }
    private static void task2() throws IOException {
        BufferedReader buffy = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter R :");
        int r = Integer.parseInt(buffy.readLine());
        System.out.println("Circumference = "+2*Math.PI*r);
        System.out.println("Circle area = "+Math.PI*r*r);
    }
}
