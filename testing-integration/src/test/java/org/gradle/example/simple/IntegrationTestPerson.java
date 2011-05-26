package org.gradle.example.simple;

import org.gradle.example.simple.Person;

import org.junit.Test;
import static org.junit.Assert.*;

public class IntegrationTestPerson {
  @Test
  public void integrationTestPerson() {
      Person p = new Person();
      p.setAge(20);
      p.setName("Fird Birfle");
      p.setSalary(195750.22);
      
      assertTrue(p.wasteTime());
  }
}
