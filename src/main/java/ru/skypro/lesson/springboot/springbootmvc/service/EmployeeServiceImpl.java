package ru.skypro.lesson.springboot.springbootmvc.service;

import org.springframework.stereotype.Service;
import ru.skypro.lesson.springboot.springbootmvc.pojo.Employee;
import ru.skypro.lesson.springboot.springbootmvc.repository.EmployeeRepository;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.getAllEmployees();
    }
}