package com.tesco.test.compare;

import java.time.LocalDate;

public class Person {

  public Person(String name, LocalDate birthday, Sex gender, String emailAddress) {
    this.name = name;
    this.birthday = birthday;
    this.gender = gender;
    this.emailAddress = emailAddress;
  }

  public enum Sex {
    MALE, FEMALE
  }

  String name;
  LocalDate birthday;
  Sex gender;
  String emailAddress;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDate getBirthday() {
    return birthday;
  }

  public void setBirthday(LocalDate birthday) {
    this.birthday = birthday;
  }

  public Sex getGender() {
    return gender;
  }

  public void setGender(Sex gender) {
    this.gender = gender;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }
  /************************************************************************************************/
  @Override
  public String toString() {
    return "Person [name=" + name + ", birthday=" + birthday + ", gender=" + gender
        + ", emailAddress=" + emailAddress + "]";
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((birthday == null) ? 0 : birthday.hashCode());
    result = prime * result + ((emailAddress == null) ? 0 : emailAddress.hashCode());
    result = prime * result + ((gender == null) ? 0 : gender.hashCode());
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Person other = (Person) obj;
    if (birthday == null) {
      if (other.birthday != null)
        return false;
    } else if (!birthday.equals(other.birthday))
      return false;
    if (emailAddress == null) {
      if (other.emailAddress != null)
        return false;
    } else if (!emailAddress.equals(other.emailAddress))
      return false;
    if (gender != other.gender)
      return false;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    return true;
  }

  /************************************************************************************************/

  public int compareByName(Person a, Person b) {
    return a.getName().compareTo(b.getName());
  }

  public int compareByAge(Person a, Person b) {
    return a.getBirthday().compareTo(b.getBirthday());
  }
}
