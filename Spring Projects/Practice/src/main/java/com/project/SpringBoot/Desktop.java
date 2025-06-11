package com.project.SpringBoot;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Desktop implements Computer{
    public void compile(){
        System.out.println("Desktop is compiling....");
    }
    public void debug(){
        System.out.println("Desktop is debugging....");
    }
}
