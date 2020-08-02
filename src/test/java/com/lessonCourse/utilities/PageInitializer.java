package com.lessonCourse.utilities;


import com.lessonCourse.pages.InstructorPage_Furkan;
import com.lessonCourse.pages.InstructorPage_Turker;

public class PageInitializer extends MyDriver {
    public static InstructorPage_Furkan iPageFurkan;
    public static InstructorPage_Turker iPageTurker;

    public static void initializeAllPages() {
        iPageFurkan = new InstructorPage_Furkan();
        iPageTurker = new InstructorPage_Turker();
    }
}
