package com.lessonCourse.utilities;

import com.lessonCourse.Pages.VahidPages;

public class PageInitializer extends MyDriver {
    public static VahidPages pageFactory;

    public static void initializeAllPages() {
        pageFactory = new VahidPages();
    }
}
