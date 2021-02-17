package com.example.studentperspective.Model;

public class ExerciseLibrary_Model {
    String text_chapter,text_subj,lesson_code,text_day;

    public ExerciseLibrary_Model(String text_chapter, String text_subj, String lesson_code, String text_day) {
        this.text_chapter = text_chapter;
        this.text_subj = text_subj;
        this.lesson_code = lesson_code;
        this.text_day = text_day;
    }

    public String getText_chapter() {
        return text_chapter;
    }

    public String getText_subj() {
        return text_subj;
    }

    public String getLesson_code() {
        return lesson_code;
    }

    public String getText_day() {
        return text_day;
    }
}
