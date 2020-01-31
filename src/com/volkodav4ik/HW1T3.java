package com.volkodav4ik;
/*
3) Заполнить массив из 10 элементов случайными целыми числами от
10 (включительно) до 20 (включительно). Вывести среднее арифметическое.
*/
import java.util.Arrays;
import java.util.Random;

public class HW1T3 {

    private static final int ARR_LENGTH = 10;
    private static final int MAX_VALUE = 20;
    private static final int MIN_VALUE = 10;
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        int[] arr = new int[ARR_LENGTH];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = RANDOM.nextInt(MAX_VALUE - (MIN_VALUE - 1)) + 10;
            sum += arr[i];
        }
        double ariphValue = (double) sum / arr.length;
        System.out.println("Созданный массив :" + Arrays.toString(arr));
        System.out.printf("Среднее арифметическое чисел массива равно %.1f.", ariphValue);
    }
}
