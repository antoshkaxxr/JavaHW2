package org.example;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Task3 {
    public static class Employee {
        private String fullName;
        private Integer age;
        private String department;
        private Double salary;

        public Employee(String fullName, Integer age, String department, Double salary) {
            this.fullName = fullName;
            this.age = age;
            this.department = department;
            this.salary = salary;
        }

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public Double getSalary() {
            return salary;
        }

        public void setSalary(Double salary) {
            this.salary = salary;
        }

        @Override
        public String toString() {
            return String.format("Сотрудник: %s, Возраст: %d, Отдел: %s, Зарплата: %.2f",
                    fullName, age, department, salary);
        }
    }

    public void solve() {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Иванов Петр Сергеевич",
                31, "Отдел разработки ПО", 100000.0));

        employees.add(new Employee("Петров Петр Петрович",
                28, "Маркетинг", 55000.0));

        employees.add(new Employee("Сидоров Сидор Сидорович",
                35, "Финансы", 70000.0));

        employees.add(new Employee("Кузнецова Анна Андреевна",
                27, "Продажи", 50000.0));

        employees.add(new Employee("Васильева Ольга Владимировна",
                42, "РHR", 65000.0));

        ArrayList<Employee> filteredEmployees = employees.stream()
                .filter(employee -> employee.getAge() > 30)
                .collect(Collectors.toCollection(ArrayList::new));

        int count = 1;
        for (Employee employee : filteredEmployees) {
            System.out.println(count + ") " + employee);
            count++;
        }
    }
}
