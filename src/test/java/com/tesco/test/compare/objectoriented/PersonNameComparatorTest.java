package com.tesco.test.compare.objectoriented;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.tesco.test.compare.Person;
import com.tesco.test.compare.PersonBuilder;

@RunWith(BlockJUnit4ClassRunner.class)
public class PersonNameComparatorTest {

  PersonBuilder personBuilder;
  PersonNameComparator personNameComparator;
  Person[] personArray;

  @Before
  public void beforeEachTest() {
    personBuilder = new PersonBuilder();
    personNameComparator = new PersonNameComparator();
    personArray = personBuilder.constructPersonsRandom();
  }

  @Test
  public void checkComparePerson() {
    Person person1 = personBuilder.constructPerson1();
    Person person2 = personBuilder.constructPerson2();
    int resultComparision = personNameComparator.compare(person1, person2);

    assertEquals("Should compare by age", -1, resultComparision);
  }

  @Test
  public void checkComparePersons() {
    Person[] persons = personBuilder.constructPersonsRandom();

    Arrays.sort(persons, personNameComparator);

    Person[] personsSortedByName = personBuilder.constructPersonsSortedByName();
    assertArrayEquals("Should Array compare by age", personsSortedByName, persons);
  }
}
