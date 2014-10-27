package home.lists;

import java.util.List;

public class ListController {
    private final ListHelper resource;

    public ListController(ListHelper resource){
        this.resource = resource;
    }

    public List<Person> merge(List<Person> firstList, List<Person> secondList){
        List<Person> list = resource.merge(firstList,secondList);
        System.out.println("\nMerged list: ");
        for(Person p : list){
            System.out.println(p);
        }
        return list;
    }

    public List<Person> innerUnion(List<Person> firstList, List<Person> secondList){
        List<Person> list = resource.innerUnion(firstList,secondList);
        System.out.println("\nInnerUnion list: ");
        for(Person p : list){
            System.out.println(p);
        }
        return list;
    }

    public List<Person> outerUnion(List<Person> firstList, List<Person> secondList){
        List<Person> list = resource.outerUnion(firstList,secondList);
        System.out.println("\nOuterUnion list: ");
        for(Person p : list){
            System.out.println(p);
        }
        return list;
    }
}
