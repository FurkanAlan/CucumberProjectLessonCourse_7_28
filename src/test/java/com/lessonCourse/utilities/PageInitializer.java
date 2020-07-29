package com.lessonCourse.utilities;


import com.lessonCourse.pages.InstructorPage_furkan;

public class PageInitializer extends MyDriver {
    public static InstructorPage_furkan instructorPage_furkan;

    public static void initializeAllPages() {
        instructorPage_furkan = new InstructorPage_furkan();
    }
}
