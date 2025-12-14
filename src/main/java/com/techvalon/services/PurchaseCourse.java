package com.techvalon.services;

import com.techvalon.dao.Course;

public class PurchaseCourse {
    private Course course;

    public boolean proceedWithCourse (Course course) {
        return course.coursePurchased();
    }
}
