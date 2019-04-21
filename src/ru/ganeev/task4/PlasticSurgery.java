package ru.ganeev.task4;

import java.util.Arrays;

public class PlasticSurgery {
    private String designation;
    private Patient[] patients = new Patient[5];

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Patient[] getPatients() {
        return patients;
    }

    public void setPatients(Patient[] patients) {
        this.patients = patients;
    }

    @Override
    public String toString() {
        return "PlasticSurgery{" +
                "designation='" + designation + '\'' +
                ", patients=" + Arrays.toString(patients) +
                '}';
    }
}
