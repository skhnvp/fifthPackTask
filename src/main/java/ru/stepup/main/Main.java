package ru.stepup.main;

/*
Создайте сущность Сотрудник (Employee), которая описывается именем (в строковой форме) и отделом (Department),
в котором сотрудник работает, причем у каждого отдела есть название и начальник, который также является Сотрудником.
Сотрудник может быть приведен к текстовой форме вида: “Имя работает в отделе Название, начальник которого Имя”.
В случае если сотрудник является руководителем отдела, то текстовая форма должна быть “Имя начальник отдела Название”.
Гарантируйте, что Начальник всегда является сотрудником того отдела, в котором он работает.


При реализации инкапсуляции на уровне класса это требование приводит к неэффективному и запутанному коду.
Упростите решение, предполагая, что инкапсуляция необходима только на уровне пакета.
*/


import ru.stepup.office.Department;
import ru.stepup.office.Employee;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("Иван");
        Employee e2 = new Employee("Петр");
        Employee e3 = new Employee("Николай");

        Department d1 = new Department("Москва", e1);
        Department d2 = new Department("Самара", e3);

        e2.setDep(d1);

        try {
            e1.setDep(d2);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(d1);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }
}