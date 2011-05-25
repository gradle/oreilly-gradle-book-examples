package org.gradle.example.simple;

import org.gradle.example.simple.Person;

import org.testng.annotations.*;
import static org.testng.AssertJUnit.*;

public class TestPerson {
  private Person p = null;

  @BeforeClass
  public void setUp() {
    p = new Person();
	p.setAge(20);
	p.setName("Fird Birfle");
	p.setSalary(195750.22);
  }

  @Test(groups = { "fast" })
  public void testPerson() {
      assertEquals(215325.242, p.calculateBonus(), 0.01);
      assertEquals("The Honorable Fird Birfle", p.becomeJudge());
      assertEquals(30, p.timeWarp());
  }

  @Test(groups = { "slow" })
  public void testPersonAgain() {
  	Person p = new Person();
	p.setAge(30);
	p.setName("Bird Firfle");
	p.setSalary(32001.99);

	p.wasteTime();
  }
}
