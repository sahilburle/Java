package com.SahilBurle;

import java.util.HashMap;

public class MapEx {
    public static void main(String[] args) {
        HashMap<String, Integer> courses = new HashMap<>();

        courses.put("CoreJava", 4000);
        courses.put("BasicPython", 3500);
        courses.put("Spring", 8000);
        courses.put("Android", 4000);

        System.out.println(courses);

        courses.forEach((e1, e2)->{
            System.out.println(e1 + "=>" + e2);
        });
    }
}
