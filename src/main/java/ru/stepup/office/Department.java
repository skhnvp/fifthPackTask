package ru.stepup.office;

import java.util.ArrayList;
import java.util.List;

public class Department {
    protected final String name;
    protected Employee headOffice;
    protected List<Employee> emps;

    public Department(String name, Employee headOffice) {
        this.name = name;
        this.headOffice = headOffice;
        this.emps = new ArrayList<>();
        headOffice.setDep(this);
        this.emps.add(headOffice);
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", headOffice=" + headOffice +
                ", emps=" + emps +
                '}';
    }
}