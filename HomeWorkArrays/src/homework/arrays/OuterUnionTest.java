package homework.arrays;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by alobanov on 20.10.2014.
 */
public class OuterUnionTest {

    private final Map<int[][], int[]> testData = new HashMap<int[][], int[]>();

    @Before
    public void setUpTestData() {
        testData.put(new int[][]{{1, 5, 4, 23, 65, 32, 78}, {3, 5, 24, 4, 1, 2, 34, 45, 32, 5}}, new int[]{23, 65, 78, 3, 24, 2, 34, 45});
        testData.put(new int[][]{null,{3, 5, 24, 4, 1, 2, 34, 45, 32, 5}}, new int[]{3, 5, 24, 4, 1, 2, 34, 45, 32, 5});
        testData.put(new int[][]{{1, 5, 4, 23, 65, 32, 78},null}, new int[]{1, 5, 4, 23, 65, 32, 78});
        testData.put(new int[][]{{},{3, 5, 24, 4, 1, 2, 34, 45, 32, 5}}, new int[]{3, 5, 24, 4, 1, 2, 34, 45, 32, 5});
        testData.put(new int[][]{{1, 5, 4, 23, 65, 32, 78},{}}, new int[]{1, 5, 4, 23, 65, 32, 78});
        //testData.put(new int[][]{{1, 5, 4, 23, 65, 32, 78}, new int[Integer.MAX_VALUE]}, new int[]{1, 5, 4, 32});
    }

    @After
    public void tearDownTestData() {
        testData.clear();
    }

    @Test
    public void testOuterUnion() {
        for(Map.Entry<int[][], int[]> entry: testData.entrySet()){
            final int[] firstArray = entry.getKey()[0];
            final int[] secondArray = entry.getKey()[1];
            final int[] expectedValue = entry.getValue();
            ArrayHelper testClass = new ArrayHelper();
            final int[] returnedValue = testClass.outerUnion(firstArray, secondArray);
            Assert.assertArrayEquals("\nfirstArray: " + Arrays.toString(firstArray) +
                    "\nsecondArray: " + Arrays.toString(secondArray) +
                    "\nexpected: " + Arrays.toString(expectedValue) +
                    "\nreturned: " + Arrays.toString(returnedValue) + "\n", expectedValue, returnedValue);
        }
    }
}

