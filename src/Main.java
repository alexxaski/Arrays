import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задача 1");
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        double[] weightDou = {1.57, 7.654, 9.986};
        int[] arbitrary = {100, 2002, 30003, 400004, 5000005};
        System.out.println("Задача 2");
        for (int i = 0; i < weight.length; i++) {
            if (i == weight.length - 1) {
                System.out.print(weight[i]);
                break;
            }
            System.out.print(weight[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < weightDou.length; i++) {
            if (i == weight.length - 1) {
                System.out.print(weightDou[i]);
                break;
            }
            System.out.print(weightDou[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < arbitrary.length; i++) {
            if (i == arbitrary.length - 1) {
                System.out.print(arbitrary[i]);
                break;
            }
            System.out.print(arbitrary[i] + ", ");
        }
        System.out.println();
        System.out.println("Задача 3");
        for (int i = weight.length -1 ; i >= 0; i--) {
            System.out.print( weight[i]);
            if (i > 0)
            System.out.print(", ");
        }
        System.out.println();
        for (int i = weightDou.length -1 ; i >= 0; i--) {
            System.out.print( weightDou[i]);
            if (i > 0)
                System.out.print(", ");
        }
        System.out.println();
        for (int i = arbitrary.length -1 ; i >= 0; i--) {
            System.out.print( arbitrary[i]);
            if (i > 0)
                System.out.print(", ");
        }
        System.out.println();
        System.out.println("Задача 4");
        for (int i = 0; i < weight.length; i++) {
            if (weight[i] % 2 != 0) {
                weight[i]++;
            }
        }
                System.out.println(Arrays.toString(weight));
    }
}