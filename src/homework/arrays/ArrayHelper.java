package homework.arrays;

import java.util.Arrays;

public class ArrayHelper {

    public int[] innerUnion(int[] firstArray, int[] secondArray) {
        if (firstArray == null || secondArray == null) return new int[0];
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

    public int[] mergeArrays(int[] firstArray, int[] secondArray) {
        int[] mergedArray = new int[0];
        if (firstArray != null && secondArray != null) {
            mergedArray = new int[firstArray.length + secondArray.length];
            System.arraycopy(firstArray, 0, mergedArray, 0, firstArray.length);
            System.arraycopy(secondArray, 0, mergedArray, firstArray.length, secondArray.length);
        } else if (firstArray == null) {
            mergedArray = Arrays.copyOf(secondArray, secondArray.length);
        } else if (secondArray == null) {
            mergedArray = Arrays.copyOf(firstArray, firstArray.length);
        } else {
            return mergedArray;
        }
        mergedArray = removeDublicates(mergedArray);
        return mergedArray;

    }

    public int[] removeDublicates(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.arraycopy(array, j + 1, array, j, array.length - j - 1);
                    array = Arrays.copyOf(array, array.length - 1);
                }
            }
        }
        return array;
    }


    public int[] outerUnion(int[] firstArray, int[] secondArray) {
        if (firstArray == null && secondArray != null) return secondArray;
        if (firstArray != null && secondArray == null) return firstArray;
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


}
