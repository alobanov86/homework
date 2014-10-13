package homework.arrays;

import java.util.Arrays;

public class ArrayExercise {
    private static int[] firstArray = {1, 5, 4, 23, 65, 32, 78};
    private static int[] secondArray = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};
    private static int[] sortedSecondArray;
    private static int[] sortedFirstArray;

    //getting an array of different elements of firstArray and secondArray
    private static int[] outerJoinUniqueElements(int[] firstArray, int[] secondArray) {
        int[] result1 = new int[0];
        for (int el : firstArray) {
            if (Arrays.binarySearch(sortedSecondArray, el) < 0) {
                result1 = Arrays.copyOf(result1, result1.length + 1);
                result1[result1.length - 1] = el;
            }
        }
        int[] result2 = new int[0];
        for (int el : secondArray) {
            if (Arrays.binarySearch(sortedFirstArray, el) < 0) {
                result2 = Arrays.copyOf(result2, result2.length + 1);
                result2[result2.length - 1] = el;
            }
        }
        int[] result = new int[result1.length + result2.length];
        System.arraycopy(result1, 0, result, 0, result1.length);
        System.arraycopy(result2, 0, result, result1.length, result2.length);
        return result;
    }

    //getting an array of common elements of firstArray and secondArray
    private static int[] innerJoinUniqueElements(int[] firstArray, int[] secondArray) {

        int[] result = new int[0];
        for (int el : firstArray) {
            if (Arrays.binarySearch(sortedSecondArray, el) >= 0) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = el;
            }
        }
        return result;
    }

    //Print of arr[] elements
    private static void print(String str, int[] arr) {
        System.out.print(str + ": ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        print("firstArray", firstArray);
        print("secondArray", secondArray);

        //getting sorted Arrays for binarySearch purposes
        sortedSecondArray = new int[secondArray.length];
        sortedFirstArray = new int[firstArray.length];
        System.arraycopy(secondArray, 0, sortedSecondArray, 0, secondArray.length);
        Arrays.sort(sortedSecondArray);
        System.arraycopy(firstArray, 0, sortedFirstArray, 0, firstArray.length);
        Arrays.sort(sortedFirstArray);

        int[] result1 = innerJoinUniqueElements(firstArray, secondArray);
        int[] result2 = outerJoinUniqueElements(firstArray, secondArray);
        print("innerJoinUniqueElements", result1);
        print("outerJoinUniqueElements", result2);
    }
}
