package com.epam.exceptionMain.bean;

import com.epam.exceptionMain.exception.AbsenceOfSubjectException;
import com.epam.exceptionMain.exception.InvalidScoreValueException;

import java.util.HashMap;
import java.util.List;

public class Student {
    private String name;
    private String surname;
    private HashMap<SubjectName, Subject> subjects;

    public Student() {

    }

    public Student(String name, String surname, HashMap<SubjectName, Subject> subjects) throws AbsenceOfSubjectException {
        if (subjects.isEmpty()) {
            throw new AbsenceOfSubjectException("You didn't enter subjects");
        } else {
            this.subjects = subjects;
            this.name = name;
            this.surname = surname;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public HashMap<SubjectName, Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(HashMap<SubjectName, Subject> subjects) throws AbsenceOfSubjectException {
        if (subjects.isEmpty()) {
            throw new AbsenceOfSubjectException("You didn't enter subjects");
        } else {
            this.subjects = subjects;
        }
    }

    public void addSubject(SubjectName name, int score) throws InvalidScoreValueException {
        if (score > 10 || score < 0) {
            throw new InvalidScoreValueException("Entered score is invalid");
        } else {
            subjects.put(name, new Subject(name, score));
        }
    }


    @Override
    public String toString() {
        return "name = " + name + ", surname = " + surname + ", subjects = " + subjects;
    }
}
