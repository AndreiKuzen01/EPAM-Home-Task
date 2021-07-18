package com.epam.classesMain.utils;

import com.epam.classesMain.beans.Student;

public class Utils {

    public void printStudentsByFaculty(Student[] allStudents, String faculty) {
        System.out.println("Студенты факультета " + faculty);
        for (int i = 0; i <= allStudents.length - 1; i++) {
            if (allStudents[i].getFaculty() == faculty) {
                System.out.println(allStudents[i]);
            }
        }
    }

    public void printStudentByBirthDate(Student[] allStudent, int birthYear) {
        System.out.println("Студенты, родившиеся после " + birthYear + " года");
        for (int i = 0; i <= allStudent.length - 1; i++) {
            if (allStudent[i].getBirthYear() > birthYear) {
                System.out.println(allStudent[i]);

            }
        }
    }

    public void printSudentByGroup(Student[] allStudents, int groupNumber) {
        System.out.println("Студенты группы №" + groupNumber);
        for (int i = 0; i <= allStudents.length - 1; i++) {
            if (allStudents[i].getGroupNumber() == groupNumber) {
                System.out.println(allStudents[i]);
            }
        }
    }

}


