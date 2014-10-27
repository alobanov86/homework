package home.lists;

import java.util.*;

public class ListHelper {

    public List<Person> merge(List<Person> firstList, List<Person> secondList) {
        List<Person> mergedList = new ArrayList<>();
        if (firstList != null) {
            for (Person p : firstList) {
                if (!mergedList.contains(p)) {
                    mergedList.add(p);
                }
            }
        }
        if (secondList != null) {
            for (Person p : secondList) {
                if (!mergedList.contains(p)) {
                    mergedList.add(p);
                }
            }
        }
        return mergedList;
    }

    public List<Person> innerUnion(List<Person> firstList, List<Person> secondList) {
        List<Person> innerUnionList = new ArrayList<>();
        if (firstList != null && secondList != null) {
            for (Person p : firstList) {
                if (secondList.contains(p) && !innerUnionList.contains(p)) innerUnionList.add(p);
            }
        }
        return innerUnionList;
    }

    public List<Person> outerUnion(List<Person> firstList, List<Person> secondList) {
        List<Person> outerUnionList = new ArrayList<>();
        List<Person> temp = new ArrayList<>();
        if (firstList != null) {
            temp.addAll(firstList);
        }   else firstList = new ArrayList<>();

        if (secondList != null) {
            temp.addAll(secondList);
        } else secondList = new ArrayList<>();
        System.out.println("temp: " + temp);
        for (Person p : temp) {
            if (firstList.contains(p) && !secondList.contains(p) && !outerUnionList.contains(p)) {
                outerUnionList.add(p);
            }
            if (secondList.contains(p) && !firstList.contains(p) && !outerUnionList.contains(p)) {
                outerUnionList.add(p);
            }
        }
        return outerUnionList;
    }
}
