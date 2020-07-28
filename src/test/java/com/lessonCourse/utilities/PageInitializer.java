package com.lessonCourse.utilities;

import com.lessonCourse.pages.DashBoard_Alan;

public class PageInitializer extends MyDriver {
    public static DashBoard_Alan dashBoardAlan;

    public static void initializeAllPages() {
        dashBoardAlan = new DashBoard_Alan();
    }
}
