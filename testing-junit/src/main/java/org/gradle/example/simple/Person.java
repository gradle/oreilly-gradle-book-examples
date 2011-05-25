package org.gradle.example.simple;

public class Person {
    private int age;
    private String name;
    private double salary;
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int new_age) {
        age = new_age;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String new_name) {
        name = new_name;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double new_salary) {
        salary = new_salary;
    }
    
    //Operations
    public double calculateBonus() {
        return salary * 1.10;
    }
    
    public String becomeJudge() {
        return "The Honorable " + name;
    }
    
    public int timeWarp() {
        return age + 10;
    }
    
    public void wasteTime() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            //Burn some CPU cycles
            long wasteful = i * i * i * i;
        }
    }
}
