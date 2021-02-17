package com.example.studentperspective.Model;

public class Model_83 {

    String title,subject,lesson_code,date,views;

    public Model_83(String title, String subject, String lesson_code, String date, String views) {
        this.title = title;
        this.subject = subject;
        this.lesson_code = lesson_code;
        this.date = date;
        this.views = views;
    }

    public String getTitle() {
        return title;
    }

    public String getSubject() {
        return subject;
    }

    public String getLesson_code() {
        return lesson_code;
    }

    public String getDate() {
        return date;
    }

    public String getViews() {
        return views;
    }
}
