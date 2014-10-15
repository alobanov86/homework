package homework.arrays;

import java.util.Arrays;

public class ArrayExercise {
    private static int[] firstArray = {1, 5, 4, 23, 65, 32, 78};
    private static int[] secondArray = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};

    //getting an array of different elements of firstArray and secondArray
    private static int[] outerUnion(int[] firstArray, int[] secondArray) {
        if(firstArray == null && secondArray != null) return secondArray;
        if(firstArray != null && secondArray == null) return firstArray;
        if (firstArray == null && secondArray == null) return new int[0];
        int[] sortedFirstArray = Arrays.copyOf(firstArray, firstArray.length);
        int[] sortedSecondArray = Arrays.copyOf(secondArray, secondArray.length);
        Arrays.sort(sortedFirstArray);
        Arrays.sort(sortedSecondArray);
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
    private static int[] innerUnion(int[] firstArray, int[] secondArray) {
        if(firstArray == null || secondArray == null) return null;
        int[] sortedSecondArray = Arrays.copyOf(secondArray, secondArray.length);
        Arrays.sort(sortedSecondArray);
        int[] result = new int[0];
        for (int el : firstArray) {
            if (Arrays.binarySearch(sortedSecondArray, el) >= 0) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = el;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("firstArray  : " + Arrays.toString(firstArray));
        System.out.println("secondArray : " + Arrays.toString(secondArray));

        int[] innerUnionArray = innerUnion(firstArray, secondArray);
        int[] outerUnionArray = outerUnion(firstArray, secondArray);
        System.out.println("innerUnionArray : " + Arrays.toString(innerUnionArray));
        System.out.println("outerUnionArray : " + Arrays.toString(outerUnionArray));
    }
}
