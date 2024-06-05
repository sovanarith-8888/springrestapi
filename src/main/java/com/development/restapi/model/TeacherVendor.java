package com.development.restapi.model;

public class TeacherVendor {
    private String teacherId;
    private String teacherName;
    private String teacherMajor;
    private String teacherStatus;

    public TeacherVendor() {
    }

    public TeacherVendor(String teacherId, String teacherName, String teacherMajor, String teacherStatus) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.teacherMajor = teacherMajor;
        this.teacherStatus = teacherStatus;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherMajor() {
        return teacherMajor;
    }

    public void setTeacherMajor(String teacherMajor) {
        this.teacherMajor = teacherMajor;
    }

    public String getTeacherStatus() {
        return teacherStatus;
    }

    public void setTeacherStatus(String teacherStatus) {
        this.teacherStatus = teacherStatus;
    }
}
