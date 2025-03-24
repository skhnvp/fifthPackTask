package ru.stepup.office;

public class Employee {
    protected final String name;
    protected Department dep;

    public Employee(String name) {
        this.name = name;
        this.dep = null;
    }

    public void setDep(Department dep) {
        if (this.dep == null) {
            this.dep = dep;
            dep.emps.add(this);
        } else {
            if (this.dep.headOffice.equals(this)) {
                throw new IllegalArgumentException("Начальник отдела всегда работает в том отделе, где он начальник");
            }

            this.dep.emps.remove(this);
            this.dep = dep;
            dep.emps.add(this);
        }
    }

    @Override
    public String toString() {
        if (dep == null) {
            return name + " не привязан к отделу";
        } else if (this.name.equals(this.dep.headOffice.name)) {
            return name + " начальник отдела " + dep.name;
        } else {
            return name + " работает в отделе " + dep.name + ", начальник которого " + dep.headOffice.name;
        }
    }
}