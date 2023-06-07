package ru.skypro.lesson.springboot.springbootmvc.service;

import ru.skypro.lesson.springboot.springbootmvc.pojo.Employee;

import java.util.List;

public interface EmployeeService {

//    Employee findEmployeeWithMaxSalary(); //верно

    Integer getFindAllSalary();
    Employee getFindEmployeeWithMinSalary();
    Employee getFindEmployeeWithMaxSalary();
    List<Employee> getFindEmployeeSalaryMoreThanAverage();


}
