package com.tesco.test.compare.objectoriented;

import java.util.Comparator;

import com.tesco.test.compare.Person;

public class PersonAgeComparator implements Comparator<Person> {
  public int compare(Person a, Person b) {
    return a.getBirthday().compareTo(b.getBirthday());
  }
}
