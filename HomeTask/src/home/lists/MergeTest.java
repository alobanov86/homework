package home.lists;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;
import static home.lists.TestConstants.*;

public class MergeTest {

    private final Map<List<Person>[], List<Person>> testData = new HashMap<>();

    @Before
    public void setUpTestData() {

        List<Person> firstList = new ArrayList<>();
        List<Person> secondList = new ArrayList<>();
        List<Person> res1 = new ArrayList<>();
        List<Person> res2 = new ArrayList<>();

        for(String str: firstStrArray){
            firstList.add(new Person.Builder().build(str));
        }

        for(String str: secondStrArray){
            secondList.add(new Person.Builder().build(str));
        }

        res1.add(new Person.Builder().build(firstStrArray[0]));
        res1.add(new Person.Builder().build(firstStrArray[1]));
        res1.add(new Person.Builder().build(firstStrArray[2]));
        res1.add(new Person.Builder().build(firstStrArray[3]));
        res1.add(new Person.Builder().build(secondStrArray[2]));
        res1.add(new Person.Builder().build(secondStrArray[3]));

        res2.add(new Person.Builder().build(secondStrArray[0]));
        res2.add(new Person.Builder().build(secondStrArray[1]));
        res2.add(new Person.Builder().build(secondStrArray[2]));
        res2.add(new Person.Builder().build(secondStrArray[3]));

        testData.put(new ArrayList[]{(ArrayList) firstList, (ArrayList) secondList}, res1);
        testData.put(new ArrayList[]{null, (ArrayList) secondList}, res2);
        testData.put(new ArrayList[]{new ArrayList<Person>(), (ArrayList) secondList}, res2);
        }

    @After
    public void tearDownTestData() {
        testData.clear();
    }

    @Test
    public void testMergeArrays() {
        for (Map.Entry<List<Person>[], List<Person>> entry : testData.entrySet()) {
            final List<Person> firstArray = entry.getKey()[0];
            final List<Person> secondArray = entry.getKey()[1];
            final List<Person> expectedValue = entry.getValue();
            ListHelper resource = new ListHelper();
            ListController testClass = new ListController(resource);
            final List<Person> returnedValue = testClass.merge(firstArray, secondArray);
            Assert.assertArrayEquals("\nfirstList: " + firstArray +
                    "\nsecondList: " + secondArray +
                    "\nexpectedList: " + expectedValue +
                    "\nreturnedList: ", expectedValue.toArray(), returnedValue.toArray());
        }
    }
}


