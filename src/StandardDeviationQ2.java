import java.util.Scanner;

public class StandardDeviationQ2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter N real numbers");
        double average;
        double sum = 0;
        double standardDeviation;
        int N = keyboard.nextInt();
        double[] array= new double[N];
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            average = sum/array.length;
standardDeviation=Math.sqrt(([Math.pow((array[i]-average), 2]))/N);
            System.out.println(standardDeviation);
        }
    }
}
