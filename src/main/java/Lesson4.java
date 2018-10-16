import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Valiantsin_Samakhave on 10/16/2018.
 */
public class Lesson4 {
    private static int task1() throws IOException {
        BufferedReader buffy = new BufferedReader(new InputStreamReader(System.in));
        int n,k,sum=0;
        System.out.println("Enter array size : ");
        n = Integer.parseInt(buffy.readLine());
        System.out.println("Enter divider : ");
        k = Integer.parseInt(buffy.readLine());
       int[] a = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter a["+i+"] = ");
            a[i] = Integer.parseInt(buffy.readLine());
        }
        for(int i : a){
            if(i%k==0){
                sum+=i;
            }
        }
        return sum;
    }

    private void task2(int[] a) {
        int l = a.length;
        if(l==0){
            System.out.println("Array is too short!");
        }
        while (l>0) {
            if (a[l] > a[l - 1]) {
                System.out.println("Unsorted array!");
                l=-1;
                break;
            }
            l--;
        }
        if(l!=-1){
            System.out.println("Array sorted by ascending");
        }

    }

    private void task3(int[] a){
        int j =0;
        for(int i : a) {
            if(i == 0){
                j++;
            }
        }
        int[] b = new int[j];
        int k=0;
        for(int i = 0; i<a.length; i++) {
            if (a[i] == 0) {
                b[k] = i;
                k++;
            }
        }
    }
}
