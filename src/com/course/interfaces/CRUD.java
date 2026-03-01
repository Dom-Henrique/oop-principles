package com.course.interfaces;

import com.course.classes.Course;
import com.course.classes.Users;
import com.course.enums.Category;

public interface CRUD {
    public void buyCourse(Course course, Users user);

    public void avaliateCourse(Course course, float avaliation);

    public void updateInformations();
    public void pushCourse(Course course);
    public void listCategory(Category category);
    public void searchKeyWord();
}
