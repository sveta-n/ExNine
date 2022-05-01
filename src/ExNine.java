import java.util.Arrays;
import java.util.Scanner;

public class ExNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Размер массива: ");
        int size = scanner.nextInt();
        double[] myArray = new double[size];
        System.out.println("Данные массива: ");
        for (int i = 0; i < size; i++) {
            myArray[i] = scanner.nextDouble();
        }

        double average = 0;
        if (myArray.length > 0 ) {
            double sum = 0;
            for (double v : myArray) {
                sum += v;
            }
            average = sum / myArray.length;
        }
        System.out.println(average);

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = myArray[i] * average;
        }
        System.out.println(Arrays.toString(myArray));

    }
}
