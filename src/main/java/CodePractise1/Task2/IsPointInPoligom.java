package CodePractise1.Task2;

/**
 * Created by Valiantsin_Samakhave on 10/18/2018.
 */
public class IsPointInPoligom {
    public static boolean PointChecker(int x, int y){
        Poligom pol = Poligom.getInstance();
        int npol = pol.getXarray().length;
        int[] yp = pol.getYarray();
        int[] xp = pol.getXarray();
        int j = npol - 1;
        boolean c = false;
            for (int i = 0; i < npol;i++){
                if ((((yp[i]<=y) && (y<yp[j])) || ((yp[j]<=y) && (y<yp[i]))) &&
                        (x > (xp[j] - xp[i]) * (y - yp[i]) / (yp[j] - yp[i]) + xp[i])) {
                    c = !c;
                }
                j = i;
            }
            return c;

    }
}
