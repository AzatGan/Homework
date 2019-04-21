package ru.ganeev.task4;

import java.util.Arrays;

public class MedicalDepartment {
    private String designation;
    private PlasticSurgery[] plasticSurgeries = new PlasticSurgery[2];

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public PlasticSurgery[] getPlasticSurgeries() {
        return plasticSurgeries;
    }

    @Override
    public String toString() {
        return "MedicalDepartment{" +
                "designation='" + designation + '\'' +
                ", plasticSurgeries=" + Arrays.toString(plasticSurgeries) +
                '}';
    }

    public void setPlasticSurgeries(PlasticSurgery[] plasticSurgeries) {
        this.plasticSurgeries = plasticSurgeries;

    }
}
