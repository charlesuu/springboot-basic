package com.example.demo.controller;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class VoucherApplication implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hi");
    }
}
