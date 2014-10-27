package home.lists;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListHelper lh = new ListHelper();
        ListController lc = new ListController(lh);
        List<Person> firstList = new ArrayList<>();
        List<Person> secondList = new ArrayList<>();

        String[] firstStrList = {
                "Ivan Ivanov i.ivanov@test.com 111-1111",
                "Petr Petrov p.petrov@test.com 222-2222",
                "Oleg Olegov o.olegov@test.com 222-2222",
                "Nikolai Nikolaev n.nikolaev@test.com 222-2222"
        };

        String[] secondStrList = {
                "Ivan Ivanov i.ivanov@test.com 111-1111",
                "Petr Petrov p.petrov@test.com 222-2222",
                "Zinedine Zidane z.zidane@test.com 000-2222",
                "David Beckham d.beckham@test.com 123-2222"
        };

        for (String pers : firstStrList) {
            firstList.add(new Person.Builder().build(pers));
        }

        for (String pers : secondStrList) {
            secondList.add(new Person.Builder().build(pers));
        }

        System.out.println("FirstList :");
        for (Person p : firstList) {
            System.out.println(p);
        }

        System.out.println("SecondList :");
        for (Person p : secondList) {
            System.out.println(p);
        }

        lc.merge(firstList, secondList);
        lc.innerUnion(firstList, secondList);
        lc.outerUnion(firstList, secondList);
    }
}
