package org.example.task_one;

import java.util.Arrays;

public class DoubleArray {
    public double[] arr = new double[10];

    public static void start() {
        DoubleArray doubleArray = new DoubleArray();

        doubleArray.array();
        doubleArray.oneStep();
        doubleArray.twoStep();
        doubleArray.threeStep();
        doubleArray.fourStep();
    }

    public void array() {
        System.out.print("Массив: [");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (Math.random() * 50);

            if (i < 9) {
                System.out.printf("%.10f; ", arr[i]);
            } else if (i == 9) {
                System.out.printf("%.10f", arr[i]);
            }
        }
        System.out.print("]");

        System.out.println();
    }

    public void oneStep(){
        int[] newArr = new int[10];

        for (int k = 0; k < arr.length; k++) {
            newArr[k] = (int) arr[k];
        }

        System.out.print("Массив без чисел после запятой: ");
        System.out.println(Arrays.toString(newArr));
    }

    public void twoStep(){
        double[] newArr = new double[10];

        System.out.print("Массив округлённый: ");

        for (int k = 0; k < arr.length; k++) {
            newArr[k] = arr[k];
            newArr[k] = Math.round(arr[k]);
        }
        System.out.println(Arrays.toString(newArr));
    }

    public void threeStep(){
        Arrays.sort(arr);

        System.out.print("Массив отсортированный: [");

        for (double values : arr) {
            System.out.printf("%.10f; ", values);
        }

        System.out.print("]");

        System.out.println();
    }

    public void fourStep(){
        double result = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                result += arr[i];
            }
        }

        System.out.printf("Сумма значений массива: %.10f", result);
    }
}
