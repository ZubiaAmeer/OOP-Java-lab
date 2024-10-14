

package com.mycompany.task3;

public class Task3 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String result = Array(numbers);
        System.out.println(result);
    }
    public static String Array(int[] numbers) {
        String result = "";
        for (int i = 0; i < numbers.length; i++) {
            result += "no " + i + ": " + numbers[i] + "\n";
        }
        return result;
    }
}