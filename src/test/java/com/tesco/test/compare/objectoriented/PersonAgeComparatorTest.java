package com.tesco.test.compare.objectoriented;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.tesco.test.compare.Person;
import com.tesco.test.compare.PersonBuilder;

@RunWith(BlockJUnit4ClassRunner.class)
public class PersonAgeComparatorTest {

  PersonAgeComparator personAgeComparator = null;
  PersonBuilder personBuilder = new PersonBuilder();
  Person[] personArray = null;
  
  @Before
  public void beforeEachTest() {
    personAgeComparator = new PersonAgeComparator();
    personArray = personBuilder.constructPersons();
  }
  
  @Test
  public void checkCompare() {
    Person person1 = personBuilder.constructPerson1();
    Person person2 = personBuilder.constructPerson2();
    int resultComparision = personAgeComparator.compare(person1, person2);
    
    assertEquals("Should compare by age", -1, resultComparision);
  }
}
