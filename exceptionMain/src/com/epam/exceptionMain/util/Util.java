package com.epam.exceptionMain.util;

import com.epam.exceptionMain.bean.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Util {
    public double getGradePointAverage(Student student) {
        double gradePointAverage = 0;
        for (int i = 0; i < student.getSubjects().size(); i++) {
            gradePointAverage += student.getSubjects().get(i).getScore();
        }
        gradePointAverage = gradePointAverage / student.getSubjects().size();
        return gradePointAverage;
    }

    public double getGradePointAverage(University university, SubjectName subjectName, int groupNumber, FacultiesName facultiesName) {
        double gradePointAverage = 0;
        int counter = 0;
        List<Student> students = university.getUniversity().get(facultiesName).getGroups().get(groupNumber);
        for (Student student : students) {
            gradePointAverage += student.getSubjects().get(subjectName).getScore();
            counter += 1;
        }
        gradePointAverage = gradePointAverage / counter;
        return gradePointAverage;
    }

    public double getGradePointAverage(University univers, SubjectName subjectName) {
        double gradePointAverage = 0;
        int counter = 0;
        HashMap<FacultiesName, Faculty> university = univers.getUniversity();
        for (Map.Entry<FacultiesName, Faculty> entry : university.entrySet()) {
            HashMap<Integer, List<Student>> groups = entry.getValue().getGroups();
            for (Map.Entry<Integer, List<Student>> entry1 : groups.entrySet()) {
                List<Student> group = entry1.getValue();
                for (Student student : group) {
                    if (student.getSubjects().containsKey(subjectName)) {
                        gradePointAverage += student.getSubjects().get(subjectName).getScore();
                        counter = counter + 1;
                    }
                }
            }
        }
        gradePointAverage = gradePointAverage / counter;
        return gradePointAverage;
    }

    private List<Faculty> getListFacculties(University univers) {
        List<Faculty> faculties = new ArrayList<>();
        HashMap<FacultiesName, Faculty> university = univers.getUniversity();
        for (Map.Entry<FacultiesName, Faculty> entry : university.entrySet()) {
            faculties.add(entry.getValue());
        }
        return faculties;
    }

    private List<Student> getListStudent(List<Faculty> faculties) {
        List<Student> students = new ArrayList<>();
        for (Faculty faculty : faculties) {
            HashMap<Integer, List<Student>> groups = faculty.getGroups();
            for (Map.Entry<Integer, List<Student>> entry : groups.entrySet()) {
                students.addAll(entry.getValue());
            }
        }
        return students;
    }

//    public double getGradePointAverage(University univers, SubjectName subjectName) {
//        double gradePointAverage = 0;
//        int counter = 0;
//        HashMap<FacultiesName, Faculty> university = univers.getUniversity();
//        for (Map.Entry<FacultiesName, Faculty> entry : university.entrySet()) {
//            HashMap<Integer, List<Student>> groups = entry.getValue().getGroups();
//            for (Map.Entry<Integer, List<Student>> entry1 : groups.entrySet()) {
//                List<Student> group = entry1.getValue();
//                for (Student student : group) {
//                    List<Subject> subjects = student.getSubjects();
//                    for (Subject subject : subjects) {
//                        if (subject.getSubjectName() == subjectName) {
//                            gradePointAverage += subject.getScore();
//                            counter = counter + 1;
//                        }
//                        break;
//                    }
//                }
//            }
//        }
//        gradePointAverage = gradePointAverage / counter;
//        return gradePointAverage;
//    }
}

