package Task2;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line;

        do {
            System.out.println("Введите числа через запятую:");
            line = sc.nextLine();
        } while (!line.matches("^[0-9,;]+$"));


        int[] arr = Arrays.stream(line.split(",")).mapToInt(Integer::parseInt).toArray();

        System.out.println("Введите число, сумму которого требуется получить из цифр массива:");
        int sum = Integer.parseInt(sc.nextLine());

        if (twoSum(arr, sum) != null) {
            System.out.println(Arrays.toString(arr) + ", " + sum + " -> " + Arrays.toString(twoSum(arr, sum)));
        } else {
            System.out.println("В данном массиве нет пары чисел, которая образует искомую сумму.");
        }
    }

    public static int[] twoSum(int[] arr, int sum) {
        int[] result = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (i != j && ((arr[i] + arr[j]) == sum)) {
                    result[0] = arr[i];
                    result[1] = arr[j];
                    return result;
                }
            }
        }
        return null;
    }
}
        /*
        Task2.Task2

            [3, 4, 2, 7], 10 -> [3, 7] - вывести пару менно в скобках, которые дают сумму - 10
         */