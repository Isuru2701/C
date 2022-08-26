import java.util.Arrays;

public class test {

    public static void main(String[] args) {
        //float is by-default taken as double
        float x = 50.2f;
        boolean y = false;
        int z = 50;
        double a = 50;
        double[] n = new double[3];



        n[0] = 492.4;
        n[1] = 52;
        System.out.println(n[0] + n[1]);
        Arrays.sort(n);

        System.out.println(Float.toString(x) + " " + y + " " + Integer.toString(z)+ " " + Double.toString(a));

    }
}