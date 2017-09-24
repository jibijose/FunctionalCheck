package com.tesco.test.compare.anonymousclass;

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
public class PersonAgeComparatorTest {

  PersonBuilder personBuilder;
  Person[] personArray;

  @Before
  public void beforeEachTest() {
    personBuilder = new PersonBuilder();
    personArray = personBuilder.constructPersonsRandom();
  }

  @Test
  public void checkComparePerson() {
    Person person1 = personBuilder.constructPerson1();
    Person person2 = personBuilder.constructPerson2();

//    assertEquals("Should compare by age", -1, resultComparision);
  }

  @Test
  public void checkComparePersons() {
    Person[] persons = personBuilder.constructPersonsRandom();

    Person[] personsSortedByAge = personBuilder.constructPersonsSortedByAge();
    assertArrayEquals("Should Array compare by age", personsSortedByAge, persons);
  }
}
