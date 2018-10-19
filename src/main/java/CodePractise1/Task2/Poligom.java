package CodePractise1.Task2;

/**
 * Created by Valiantsin_Samakhave on 10/20/2018.
 */
public class Poligom {
    private static Poligom instance;
    private int[] xarray = new int[8];
    private int[] yarray = new int[8];

    public void setXarray(int[] xarray) {
        this.xarray = xarray;
    }

    public void setYarray(int[] yarray) {
        this.yarray = yarray;
    }

    private Poligom() {
    }

    public static Poligom getInstance() {
        if (instance == null) {
            instance = new Poligom();
        }
        return instance;
    }

    public int[] getXarray() {
        return xarray;
    }

    public int[] getYarray() {
        return yarray;
    }
}
