package homework.arrays;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by master on 14.10.2014.
 */
public class ArrayHelperTest {

    @Test
    public void testInnerUnion() {
        // initialize variable inputs
        int[] inputArrayFirst = {1, 5, 4, 23, 65, 32, 78};
        int[] inputArraySecond = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};

        //expectedResult
        int[] expectedValues = {1, 5, 4, 32};

        // initialize class to test
        ArrayHelper testClass = new ArrayHelper();

        // invoke method on class to test
        int[] returnedValue = testClass.innerUnion(inputArrayFirst, inputArraySecond);
        // assert return value
        Assert.assertArrayEquals(expectedValues, returnedValue);
    }


    @Test
    public void testInnerUnion_FirstArrayIsEmpty() {
        // initialize variable inputs
        int[] inputArrayFirst = {};
        int[] inputArraySecond = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};

        //expectedResult
        int[] expectedValues = {};

        // initialize class to test
        ArrayHelper testClass = new ArrayHelper();

        // invoke method on class to test
        int[] returnedValue = testClass.innerUnion(inputArrayFirst, inputArraySecond);

        // assert return value
        Assert.assertArrayEquals(expectedValues, returnedValue);
    }


    @Test
    public void testInnerUnion_FirstArrayIsNull() {
        // initialize variable inputs
        int[] inputArrayFirst = null;
        int[] inputArraySecond = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};

        //expectedResult
        int[] expectedValues = null;

        // initialize class to test
        ArrayHelper testClass = new ArrayHelper();

        // invoke method on class to test
        int[] returnedValue = testClass.innerUnion(inputArrayFirst, inputArraySecond);
        // assert return value
        Assert.assertArrayEquals(expectedValues, returnedValue);
    }

    @Test
    public void testInnerUnion_SecondArrayIsEmpty() {
        // initialize variable inputs
        int[] inputArrayFirst = {1, 5, 4, 23, 65, 32, 78};
        int[] inputArraySecond = {};

        //expectedResult
        int[] expectedValues = {};

        // initialize class to test
        ArrayHelper testClass = new ArrayHelper();

        // invoke method on class to test
        int[] returnedValue = testClass.innerUnion(inputArrayFirst, inputArraySecond);

        // assert return value
        Assert.assertArrayEquals(expectedValues, returnedValue);
    }

    @Test
    public void testInnerUnion_SecondArrayIsNull() {
        // initialize variable inputs
        int[] inputArrayFirst = {1, 5, 4, 23, 65, 32, 78};
        int[] inputArraySecond = null;

        //expectedResult
        int[] expectedValues = null;

        // initialize class to test
        ArrayHelper testClass = new ArrayHelper();

        // invoke method on class to test
        int[] returnedValue = testClass.innerUnion(inputArrayFirst, inputArraySecond);
        // assert return value
        Assert.assertArrayEquals(expectedValues, returnedValue);
    }


    @Test
    public void testOuterUnion() {
        // initialize variable inputs
        int[] inputArrayFirst = {1, 5, 4, 23, 65, 32, 78};
        int[] inputArraySecond = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};

        //expectedResult
        int[] expectedValues = {23, 65, 78, 3, 24, 2, 34, 45};

        // initialize class to test
        ArrayHelper testClass = new ArrayHelper();

        // invoke method on class to test
        int[] returnedValue = testClass.outerUnion(inputArrayFirst, inputArraySecond);
        // assert return value
        Assert.assertArrayEquals(expectedValues, returnedValue);
    }

    @Test
    public void testOuterUnion_FirstArrayIsEmpty() {
        // initialize variable inputs
        int[] inputArrayFirst = {};
        int[] inputArraySecond = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};

        //expectedResult
        int[] expectedValues = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};

        // initialize class to test
        ArrayHelper testClass = new ArrayHelper();

        // invoke method on class to test
        int[] returnedValue = testClass.outerUnion(inputArrayFirst, inputArraySecond);
        // assert return value
        Assert.assertArrayEquals(expectedValues, returnedValue);
    }

    @Test
    public void testOuterUnion_SecondArrayIsEmpty() {
        // initialize variable inputs
        int[] inputArrayFirst = {1, 5, 4, 23, 65, 32, 78};
        int[] inputArraySecond = {};

        //expectedResult
        int[] expectedValues = {1, 5, 4, 23, 65, 32, 78};

        // initialize class to test
        ArrayHelper testClass = new ArrayHelper();

        // invoke method on class to test
        int[] returnedValue = testClass.outerUnion(inputArrayFirst, inputArraySecond);
        // assert return value
        Assert.assertArrayEquals(expectedValues, returnedValue);
    }

    @Test
    public void testOuterUnion_FirstArrayIsNull() {
        // initialize variable inputs
        int[] inputArrayFirst = null;
        int[] inputArraySecond = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};

        //expectedResult
        int[] expectedValues = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};

        // initialize class to test
        ArrayHelper testClass = new ArrayHelper();

        // invoke method on class to test
        int[] returnedValue = testClass.outerUnion(inputArrayFirst, inputArraySecond);
        // assert return value
        Assert.assertArrayEquals(expectedValues, returnedValue);
    }

    @Test
    public void testOuterUnion_SecondArrayIsNull() {
        // initialize variable inputs
        int[] inputArrayFirst = {1, 5, 4, 23, 65, 32, 78};
        int[] inputArraySecond = null;

        //expectedResult
        int[] expectedValues = {1, 5, 4, 23, 65, 32, 78};

        // initialize class to test
        ArrayHelper testClass = new ArrayHelper();

        // invoke method on class to test
        int[] returnedValue = testClass.outerUnion(inputArrayFirst, inputArraySecond);
        // assert return value
        Assert.assertArrayEquals(expectedValues, returnedValue);
    }
}
