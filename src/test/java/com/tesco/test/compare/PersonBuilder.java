package com.tesco.test.compare;

import java.time.LocalDate;

import com.tesco.test.compare.Person.Sex;

public class PersonBuilder {

  public Person constructPerson1() {
    return new Person("name1", LocalDate.now().plusYears(1), Sex.MALE, "email1@email.com");
  }
  
  public Person constructPerson2() {
    return new Person("name2", LocalDate.now().plusYears(2), Sex.FEMALE, "email2@email.com");
  }

  public Person[] constructPersons() {
    
    Person[] rosterAsArray = new Person[5];
    rosterAsArray[0] = new Person("name3", LocalDate.now().plusYears(3), Sex.MALE, "email3@email.com");
    rosterAsArray[1] = new Person("name1", LocalDate.now().plusYears(1), Sex.MALE, "email1@email.com");
    rosterAsArray[2] = new Person("name2", LocalDate.now().plusYears(2), Sex.FEMALE, "email2@email.com");
    rosterAsArray[3] = new Person("name5", LocalDate.now().plusYears(5), Sex.MALE, "email5@email.com");
    rosterAsArray[4] = new Person("name4", LocalDate.now().plusYears(4), Sex.FEMALE, "email4@email.com");
    
    return rosterAsArray;
  }
}
