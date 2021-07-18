package com.epam.exceptionMain.bean;

import com.epam.exceptionMain.exception.AbsenceOfFacultyException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class University {
    private HashMap<FacultiesName,Faculty> university;

    public University(){
    }

    public University(HashMap<FacultiesName, Faculty> university) throws AbsenceOfFacultyException {
        if (university.isEmpty()) {
            throw new AbsenceOfFacultyException("There aren't faculties");
        } else {
            this.university = university;
        }
    }

    public HashMap<FacultiesName, Faculty> getUniversity() {
        return university;
    }

    public void setUniversity(HashMap<FacultiesName, Faculty> university) throws AbsenceOfFacultyException {
        if (university.isEmpty()) {
            throw new AbsenceOfFacultyException("There aren't faculties");
        } else {
            this.university = university;
        }
    }

    public void addFaculty(Faculty faculty){
        university.put(faculty.getFacultyName(), faculty);
    }

    @Override
    public String toString() {
        return "University{" + "faculties = " + university + "}";
    }
}
