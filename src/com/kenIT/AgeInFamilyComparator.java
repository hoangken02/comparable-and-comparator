package com.kenIT;

import java.util.Comparator;

public class AgeInFamilyComparator implements Comparator<Family> {
    @Override
    public int compare(Family family1, Family family2) {
        return - family1.getAge() + family2.getAge();
    }
}
