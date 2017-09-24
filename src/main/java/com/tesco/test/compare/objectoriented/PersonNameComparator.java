package com.tesco.test.compare.objectoriented;

import java.util.Comparator;

import com.tesco.test.compare.Person;

public class PersonNameComparator implements Comparator<Person> {
  public int compare(Person a, Person b) {
    return a.getName().compareTo(b.getName());
  }
}
