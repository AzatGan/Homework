package ru.ganeev.task4;

public class Patient extends Person {
    private int insurance;

    public Patient(String firstName, String lastName, int birthdate) {
        super(firstName, lastName, birthdate);
    }

    public int getInsurance() { //Страховка
        return insurance;
    }

    public void setInsurance(int insurance) {
        this.insurance = insurance;
    }
}
