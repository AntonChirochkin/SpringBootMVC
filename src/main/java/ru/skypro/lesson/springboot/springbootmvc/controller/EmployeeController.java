package ru.skypro.lesson.springboot.springbootmvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.skypro.lesson.springboot.springbootmvc.pojo.Employee;
import ru.skypro.lesson.springboot.springbootmvc.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping("/salary/max")
    public Employee findEmployeeWithMaxSalary() {return employeeService.getFindEmployeeWithMaxSalary(); }

    @GetMapping("/salary/min")
    public Employee findEmployeeWithMinSalary() {
        return employeeService.getFindEmployeeWithMinSalary();
    }

    @GetMapping("/salary/sum")
    public Integer findAllSalary() {
        return employeeService.getFindAllSalary();
   }
    @GetMapping("/salary/MoreThanAverage")
    public List<Employee> getFindEmployeeSalaryMoreThanAverage() {
        return employeeService.getFindEmployeeSalaryMoreThanAverage();
    }

}