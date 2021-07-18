package com.epam.exceptionMain.bean;

import com.epam.exceptionMain.exception.AbsenceOfStudentException;

import java.util.List;

public class Group {
    private int groupNumber;
    private List<Student> students;

    public Group() {
    }

    public Group(int groupNumber, List<Student> students) throws AbsenceOfStudentException {
        if (students.isEmpty()) {
            throw new AbsenceOfStudentException("There aren't students in group");
        } else {
            this.students = students;
            this.groupNumber = groupNumber;
        }
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) throws AbsenceOfStudentException {
        if (students.isEmpty()) {
            throw new AbsenceOfStudentException("There aren't students in group");
        } else {
            this.students = students;
        }
    }
    public void addStudent(Student student){
        students.add(student);
    }

}

