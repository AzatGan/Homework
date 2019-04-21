package ru.ganeev.task4.HospitalEmployee;

import ru.ganeev.task4.Person;

public class Nurse extends Person {
    private int salary;

    public Nurse(String firstName, String lastName, int birthdate) {
        super(firstName, lastName, birthdate);
    }

    int getSalary() { // зарплата
        return salary;
    }

     void setSalary(int salary) {
        this.salary = salary;
    }
}
