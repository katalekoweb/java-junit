package com.techvalon.dao;

public class JavaCourse extends Course {

    @Override
    public  boolean coursePurchased () {
        System.out.println("Java course purchased override");
        System.out.println("Its not actually connecting to db hence in false");
        return true;
    }
}
