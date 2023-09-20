package com.hillel.skoryk.homeworks.lesson2.company;

import com.hillel.skoryk.homeworks.lesson2.company.car.Car;
import com.hillel.skoryk.homeworks.lesson2.company.employee.Employee;

public class CompanyMain {
    public static void main(String[] args) {

        //створюємо співробітника
        Employee employee =
                new Employee("Skoryk Anna", "Manager",
                        "skoryk.a.y@gmail.com", "+1234567890", 26);

        System.out.println("Employee Information:");
        System.out.println("Name: " + employee.getFullName());
        System.out.println("Position: " + employee.getPosition());
        System.out.println("Email: " + employee.getEmail());
        System.out.println("Phone: " + employee.getPhone());
        System.out.println("Age: " + employee.getAge());

        //запускаємо машинку
        Car myCar = new Car();
        myCar.start();

        // Я не знайшла як оптимізувати цю штуку саме через імпорт чи скоротити
        com.hillel.skoryk.homeworks.lesson2.company.samename_a.SameName SameNameA =
                new com.hillel.skoryk.homeworks.lesson2.company.samename_a.SameName("Ann");
        com.hillel.skoryk.homeworks.lesson2.company.samename_b.SameName SameNameB =
                new com.hillel.skoryk.homeworks.lesson2.company.samename_b.SameName("Brown");

        System.out.println("CompanyA SameName: " + SameNameA.getName());
        System.out.println("CompanyB SameName: " + SameNameB.getName());
    }
}
