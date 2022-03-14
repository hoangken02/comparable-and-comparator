package com.kenIT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Family> familyList = new ArrayList();
        familyList.add(new Family("Ken",20));
        familyList.add(new Family("Dad",59));
        familyList.add(new Family("Tep",30));
        familyList.add(new Family("Mom",53));

        // use comparator by make a class
        Collections.sort(familyList, new AgeInFamilyComparator());

        Collections.sort(familyList, new Comparator<Family>() {
            @Override
            public int compare(Family o1, Family o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        for (Family family:
             familyList) {
            System.out.println(family);
        }


    }
}
