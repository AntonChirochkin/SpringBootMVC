package ru.skypro.lesson.springboot.springbootmvc.service;

import org.springframework.stereotype.Service;

@Service
public class CounterServiceImpl implements CounterService {
    private int counter;

    public String showCounter(){
        return "Количество запросов " + ++counter;
    }
}