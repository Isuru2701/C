public class exampleProgram {
    public static void main(String[] args)
    {
    int[] numbers = new int[]{10, 30, 40, 50, 75, 25, 70};
    int sum = 0;

    for(int i = 0; i < numbers.length; ++i)
    {
    sum += numbers[i];
    }
    double average = sum/numbers.length;
    System.out.println("Average value of the array is: " + average);


    }
}