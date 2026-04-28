package org.alexvsi.challenge.poo.domain;

public class Course {
    private String title;
    private String description;
    private int courseLoad;

    public Course(String title, String description, int courseLoad) {
        this.title = title;
        this.description = description;
        this.courseLoad = courseLoad;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCourseLoad() {
        return courseLoad;
    }

    public void setCourseLoad(int courseLoad) {
        this.courseLoad = courseLoad;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", courseLoad=" + courseLoad +
                '}';
    }
}
