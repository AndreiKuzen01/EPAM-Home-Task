package com.epam.classesMain.main;

import com.epam.classesMain.beans.Adress;
import com.epam.classesMain.beans.Student;
import com.epam.classesMain.utils.Utils;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student(1, "Petrov", "Andrei", "Aleksandrovich", 1995, new Adress("Minsk", "Levkovo"), "MSF", 1, 103511);
        Student student2 = new Student(2, "Ivanov", "Vladimir", "Ivanovich", 1993, new Adress("Minsk", "Volodko"), "MSF", 2, 103511);
        Student student3 = new Student(3, "Sidorov", "Vadim", "Olegovich", 1994, new Adress("Brest", "Krasnaja"), "PSF", 2, 104213);
        Student student4 = new Student(4, "Sobolev", "Ilya", "Maksimovich", 1994, new Adress("Grodno", "Voronianskogo"), "ATF", 1, 105211);
        Student student5 = new Student(5, "Zlotnik", "Vladislav", "Andreevich", 1992, new Adress("Zhodino", "Beryta"), "ATF", 2, 105211);

        Student [] allStudents = new Student[5];
        allStudents[0] = student1;
        allStudents [1] = student2;
        allStudents [2] = student3;
        allStudents [3] = student4;
        allStudents [4] = student5;

        Utils util = new Utils();
        //Вывести студентов заданного факультета
        util.printStudentsByFaculty(allStudents, "MSF");
        // Вывести списки студентов, родившихся после заданного года
        util.printStudentByBirthDate(allStudents, 1991);
        // Вывести список учебной группы
        util.printSudentByGroup(allStudents,103511);

    }
}

