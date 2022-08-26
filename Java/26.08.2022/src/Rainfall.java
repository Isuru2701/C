/*
Write a Java Application to input five rainfall values into an array and output below:
    - Maximum rainfall value
    - Minimum rainfall value
    - Average rainfall value
 */

import java.util.Scanner;

public class Rainfall {
    public static void main(String[] args) {

        float[] rainfall = new float[5];
        int max = 0, min = 0;
        float total = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; ++i) {

            System.out.println("enter rainfall value: ");
            rainfall[i] = sc.nextFloat();

            total += rainfall[i];
            if (rainfall[i] > rainfall[max]) {
                max = i;
            } else if (rainfall[i] < rainfall[min]) {
                min = i;
            }
        }
        System.out.println("Max rainfall: " + rainfall[max] + " Min rainfall: " + rainfall[min] + "\nAverage rainfall: " + total / 5);
        sc.close();
    }
}
