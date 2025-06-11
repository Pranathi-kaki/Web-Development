package com.project.SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static java.awt.SystemColor.desktop;

@Component
public class Dev {
    @Autowired
    Desktop desktop;

//    @Autowired
//    Laptop laptop;  //autowired will automatically creates the object inside the IOC
    @Autowired
    Computer computer;

    public void sayHello(){
        System.out.println("Hello Developer!!");
    }
    public void task(){
        desktop.compile();
        desktop.debug();

//        laptop.compile();
//        laptop.debug();

        System.out.println("Task is Completed");
    }
}
