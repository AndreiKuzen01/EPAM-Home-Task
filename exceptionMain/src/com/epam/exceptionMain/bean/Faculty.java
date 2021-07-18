package com.epam.exceptionMain.bean;

import com.epam.exceptionMain.exception.AbsenceOfGroupExceptinon;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class Faculty {
    private FacultiesName facultyName;
    private HashMap<Integer, List<Student>>groups;

    public Faculty(){
    }

    public Faculty(FacultiesName facultyName, HashMap<Integer, List<Student>> groups)throws AbsenceOfGroupExceptinon {
        if (groups.isEmpty()) {
            throw new AbsenceOfGroupExceptinon("There aren't groups on faculty");
        } else {
            this.groups = groups;
            this.facultyName = facultyName;
        }
    }

    public FacultiesName getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(FacultiesName facultyName) {
        this.facultyName = facultyName;
    }

    public HashMap<Integer, List<Student>> getGroups() {
        return groups;
    }

    public void setGroups(HashMap<Integer, List<Student>> groups)throws AbsenceOfGroupExceptinon {
        this.facultyName = facultyName;
        if (groups.isEmpty()) {
            throw new AbsenceOfGroupExceptinon("There aren't groups on faculty");
        } else {
            this.groups = groups;
        }
    }
    public void addGroup(Group group){
        groups.put(group.getGroupNumber(),group.getStudents());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Faculty faculty = (Faculty) o;
        return facultyName == faculty.facultyName &&
                Objects.equals(groups, faculty.groups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(facultyName, groups);
    }

    @Override
    public String toString() {
        return "Faculty{" + "name = " + facultyName + ", groups = " + groups + "}";
    }
}
