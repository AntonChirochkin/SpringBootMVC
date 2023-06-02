package ru.skypro.lesson.springboot.springbootmvc.repository;

import ru.skypro.lesson.springboot.springbootmvc.pojo.Employee;

import java.util.List;

public interface EmployeeRepository {
    public List<Employee> getAllEmployees();
}
