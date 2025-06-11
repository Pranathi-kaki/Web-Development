package com.project.SpringBoot;

public interface Computer {
    //on implementing  Computer for both desktop and laptop raises an error because of equal priorities
    //we use primary for setting the priorities
    public void compile();
    public void debug();
}
