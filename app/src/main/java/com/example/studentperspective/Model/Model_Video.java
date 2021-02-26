package com.example.studentperspective.Model;

public class Model_Video {

    String img,chapter_title,time,desc,subj,lesson_code;

    public Model_Video(String img, String chapter_title, String time, String desc, String subj, String lesson_code) {
        this.img = img;
        this.chapter_title = chapter_title;
        this.time = time;
        this.desc = desc;
        this.subj = subj;
        this.lesson_code = lesson_code;
    }

    public String getImg() {
        return img;
    }

    public String getChapter_title() {
        return chapter_title;
    }

    public String getTime() {
        return time;
    }

    public String getDesc() {
        return desc;
    }

    public String getSubj() {
        return subj;
    }

    public String getLesson_code() {
        return lesson_code;
    }
}
