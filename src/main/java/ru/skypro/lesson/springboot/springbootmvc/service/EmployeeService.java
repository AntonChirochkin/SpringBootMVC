package ru.skypro.lesson.springboot.springbootmvc.service;

import ru.skypro.lesson.springboot.springbootmvc.pojo.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
}
