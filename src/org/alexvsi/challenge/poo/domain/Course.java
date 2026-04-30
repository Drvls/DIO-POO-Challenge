package org.alexvsi.challenge.poo.domain;

public class Course extends Content{
    private int courseLoad;

    public Course(String title, String description, int courseLoad) {
        super(title, description);
        this.courseLoad = courseLoad;
    }

    @Override
    public double calculateXP() {
        return defaultXP * courseLoad;
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
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", courseLoad=" + courseLoad +
                '}';
    }
}
