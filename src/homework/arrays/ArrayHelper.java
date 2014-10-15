package homework.arrays;

import java.util.Arrays;

/**
 * Created by master on 14.10.2014.
 */
public class ArrayHelper {

    public int[] innerUnion(int[] firstArray, int[] secondArray) {
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


    public int[] outerUnion(int[] firstArray, int[] secondArray) {
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
                //System.out.println(el + " " + Arrays.binarySearch(sortedSecondArray, el));
                result1 = Arrays.copyOf(result1, result1.length + 1);
                result1[result1.length - 1] = el;
            }
        }
        int[] result2 = new int[0];
        for (int el : secondArray) {
            if (Arrays.binarySearch(sortedFirstArray, el) < 0) {
                //System.out.println(el + " " +Arrays.binarySearch(sortedFirstArray, el));
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
