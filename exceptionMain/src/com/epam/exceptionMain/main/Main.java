package com.epam.exceptionMain.main;

        import com.epam.exceptionMain.bean.*;
        import com.epam.exceptionMain.exception.*;
        import com.epam.exceptionMain.util.Util;

        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.HashMap;
        import java.util.List;

public class Main {
    public static void main(String[] args) {

        try {
            HashMap<SubjectName,Subject> subjects = new HashMap<>();
            subjects.put(SubjectName.ASTRONOMY, new Subject(SubjectName.ASTRONOMY, 8));
            subjects.put(SubjectName.MATH, new Subject(SubjectName.MATH, 9));
            subjects.put(SubjectName.PHYSIC, new Subject(SubjectName.PHYSIC, 7));
            Student student = new Student("Andrei", "Shishkin", subjects);

            HashMap<SubjectName, Subject> subjects1 = new HashMap<>();
            subjects1.put(SubjectName.ASTRONOMY, new Subject(SubjectName.ASTRONOMY, 6));
            subjects1.put(SubjectName.MATH, new Subject(SubjectName.MATH, 8));
            subjects1.put(SubjectName.PHYSIC, new Subject(SubjectName.PHYSIC, 10));
            Student student1 = new Student("Vladislav", "Dalidovich", subjects1);

            HashMap<SubjectName, Subject> subjects2 = new HashMap<>();
            subjects2.put(SubjectName.ASTRONOMY, new Subject(SubjectName.ASTRONOMY, 7));
            subjects2.put(SubjectName.MATH, new Subject(SubjectName.MATH, 7));
            subjects2.put(SubjectName.PHYSIC, new Subject(SubjectName.PHYSIC, 7));
            Student student2 = new Student("Anna", "Grapova", subjects2);

            HashMap<SubjectName, Subject> subjects3 = new HashMap<>();
            subjects3.put(SubjectName.ASTRONOMY, new Subject(SubjectName.ASTRONOMY, 5));
            subjects3.put(SubjectName.MATH, new Subject(SubjectName.MATH, 9));
            subjects3.put(SubjectName.PHYSIC, new Subject(SubjectName.PHYSIC, 10));
            Student student3 = new Student("Vladimir", "Ponomarchyk", subjects3);

            HashMap<SubjectName, Subject> subjects4 = new HashMap<>();
            subjects4.put(SubjectName.BIOLOGY, new Subject(SubjectName.BIOLOGY, 5));
            subjects4.put(SubjectName.CHEMISTRY, new Subject(SubjectName.CHEMISTRY, 9));
            subjects4.put(SubjectName.INORGANIC_CHEMISTRY, new Subject(SubjectName.INORGANIC_CHEMISTRY, 10));
            Student student4 = new Student("Valentin", "Kotelnikov", subjects4);

            HashMap<SubjectName, Subject> subjects5 = new HashMap<>();
            subjects5.put(SubjectName.BIOLOGY, new Subject(SubjectName.BIOLOGY, 6));
            subjects5.put(SubjectName.CHEMISTRY, new Subject(SubjectName.CHEMISTRY, 5));
            subjects5.put(SubjectName.INORGANIC_CHEMISTRY, new Subject(SubjectName.INORGANIC_CHEMISTRY, 4));
            Student student5 = new Student("Ivan", "Zmitrovich", subjects5);

            HashMap<SubjectName, Subject> subjects6 = new HashMap<>();
            subjects6.put(SubjectName.BIOLOGY, new Subject(SubjectName.BIOLOGY, 5));
            subjects6.put(SubjectName.CHEMISTRY, new Subject(SubjectName.CHEMISTRY, 8));
            subjects6.put(SubjectName.INORGANIC_CHEMISTRY, new Subject(SubjectName.INORGANIC_CHEMISTRY, 8));
            Student student6 = new Student("Oleg", "Dedul", subjects6);

            HashMap<SubjectName, Subject> subjects7 = new HashMap<>();
            subjects7.put(SubjectName.BIOLOGY, new Subject(SubjectName.BIOLOGY, 5));
            subjects7.put(SubjectName.CHEMISTRY, new Subject(SubjectName.CHEMISTRY, 5));
            subjects7.put(SubjectName.INORGANIC_CHEMISTRY, new Subject(SubjectName.INORGANIC_CHEMISTRY, 4));
            Student student7 = new Student("Ilya", "Gorbacevich", subjects7);

            Group group = new Group(101001, Arrays.asList(student,student1));
            Group group1 = new Group(101002, Arrays.asList(student2,student3));
            Group group2 = new Group(102001, Arrays.asList(student4,student5));
            Group group3 = new Group(102002, Arrays.asList(student6,student7));

            HashMap<Integer, List<Student>> groups = new HashMap<>();
            groups.put(group.getGroupNumber(), group.getStudents());
            groups.put(group1.getGroupNumber(), group1.getStudents());
            Faculty faculty = new Faculty(FacultiesName.FACULTY_OF_PHYSICS, groups);


            HashMap<Integer, List<Student>> groups1 = new HashMap<>();
            groups1.put(group2.getGroupNumber(), group2.getStudents());
            groups1.put(group3.getGroupNumber(), group3.getStudents());
            Faculty faculty1 = new Faculty(FacultiesName.FACULTY_OF_CHEMISTRY, groups1);


            HashMap<FacultiesName,Faculty>faculties = new HashMap<>();
            faculties.put(FacultiesName.FACULTY_OF_PHYSICS, faculty);
            faculties.put(FacultiesName.FACULTY_OF_CHEMISTRY, faculty1);
            University university = new University(faculties);

            Util util = new Util();
            double i = util.getGradePointAverage(university,SubjectName.MATH);
            System.out.println(i);

//            Group group1 = new Group(101001, Arrays.asList(
//                    new Student("Andrei", "Shishkin", Arrays.asList(new Subject(SubjectName.CHEMISTRY, 10), new Subject(SubjectName.BIOLOGY, 10), new Subject(SubjectName.INORGANIC_CHEMISTRY, 10))),
//                    new Student("Vladislav", "Dalidovich", Arrays.asList(new Subject(SubjectName.CHEMISTRY, 9), new Subject(SubjectName.BIOLOGY, 8), new Subject(SubjectName.INORGANIC_CHEMISTRY, 7)))
//            ));
//
//            Group group2 = new Group(101002, Arrays.asList(
//                    new Student("Anna", "Grapova", Arrays.asList(new Subject(SubjectName.CHEMISTRY, 10), new Subject(SubjectName.BIOLOGY, 9), new Subject(SubjectName.INORGANIC_CHEMISTRY, 9))),
//                    new Student("Vladimir", "Ponomarchyk", Arrays.asList(new Subject(SubjectName.CHEMISTRY, 10), new Subject(SubjectName.BIOLOGY, 9), new Subject(SubjectName.INORGANIC_CHEMISTRY, 9)))
//            ));
//
//            Group group3 = new Group(102001, Arrays.asList(
//                    new Student("Valentin", "Kotelnikov", Arrays.asList(new Subject(SubjectName.MATH, 9), new Subject(SubjectName.PHYSIC, 8), new Subject(SubjectName.ASTRONOMY, 7))),
//                    new Student("Ivan", "Zmitrovich", Arrays.asList(new Subject(SubjectName.MATH, 8), new Subject(SubjectName.PHYSIC, 7), new Subject(SubjectName.ASTRONOMY, 6)))
//            ));
//            Group group4 = new Group(102002, Arrays.asList(
//                    new Student("Oleg", "Dedul", Arrays.asList(new Subject(SubjectName.MATH, 8), new Subject(SubjectName.PHYSIC, 8), new Subject(SubjectName.ASTRONOMY, 8))),
//                    new Student("Ilya", "Gorbacevich", Arrays.asList(new Subject(SubjectName.MATH, 9), new Subject(SubjectName.PHYSIC, 8), new Subject(SubjectName.ASTRONOMY, 8)))
//            ));
//
//            Group group5 = new Group(103001, Arrays.asList(
//                    new Student("Karina", "Apranich", Arrays.asList(new Subject(SubjectName.HISTORY, 8), new Subject(SubjectName.JURISPRUDENCE, 7), new Subject(SubjectName.PHILOSOPHY, 6))),
//                    new Student("Anastasia", "Zelenevskaya", Arrays.asList(new Subject(SubjectName.HISTORY, 7), new Subject(SubjectName.JURISPRUDENCE, 7), new Subject(SubjectName.PHILOSOPHY, 6)))
//            ));
//            Group group6 = new Group(103002, Arrays.asList(
//                    new Student("Filip", "Kremnev", Arrays.asList(new Subject(SubjectName.HISTORY, 8), new Subject(SubjectName.JURISPRUDENCE, 9), new Subject(SubjectName.PHILOSOPHY, 6))),
//                    new Student("Artsiom", "Pavlovski", Arrays.asList(new Subject(SubjectName.HISTORY, 5), new Subject(SubjectName.JURISPRUDENCE, 9), new Subject(SubjectName.PHILOSOPHY, 6)))
//            ));
//
//
//        HashMap<Integer,List<Student>>facultyOfChemistryGroups = new HashMap<>();
//        HashMap<Integer,List<Student>> facultyOfPhysicsGroups = new HashMap<>();
//        HashMap<Integer,List<Student>> lawFacultyGroups = new HashMap<>();
//
//        facultyOfChemistryGroups.put(group1.getGroupNumber(), group1.getStudents());
//        facultyOfChemistryGroups.put(group2.getGroupNumber(), group2.getStudents());
//        facultyOfPhysicsGroups.put(group3.getGroupNumber(), group3.getStudents());
//        facultyOfPhysicsGroups.put(group4.getGroupNumber(), group4.getStudents());
//        lawFacultyGroups.put(group5.getGroupNumber(), group5.getStudents());
//        lawFacultyGroups.put(group6.getGroupNumber(), group6.getStudents());
//
//
//        Faculty facultyOfChemistry = new Faculty(FacultiesName.FACULTY_OF_CHEMISTRY, facultyOfChemistryGroups);
//        Faculty facultyOfPhysics = new Faculty(FacultiesName.FACULTY_OF_PHYSICS, facultyOfPhysicsGroups);
//        Faculty lawFaculty = new Faculty(FacultiesName.LAW_FACULTY, lawFacultyGroups);
//
//        HashMap<FacultiesName, Faculty> faculties = new HashMap<>();
//        faculties.put(FacultiesName.FACULTY_OF_CHEMISTRY, facultyOfChemistry);
//        faculties.put(FacultiesName.FACULTY_OF_PHYSICS, facultyOfPhysics);
//        faculties.put(FacultiesName.LAW_FACULTY, lawFaculty);
//
//        University university = new University(faculties);
//
//        Util util = new Util();
//        double i = util.getGradePointAverage(university.getUniversity().get(FacultiesName.FACULTY_OF_CHEMISTRY).getGroups().get(101001).get(0));
//        System.out.println(i);
//        double y = util.getGradePointAverage(university, SubjectName.CHEMISTRY, 101001, FacultiesName.FACULTY_OF_CHEMISTRY);
//        System.out.println(y);
//        double u = util.getGradePointAverage(university, SubjectName.MATH);
//        System.out.println(u);
        }
        catch (InvalidScoreValueException e){
            System.out.println(e.getMessage());
        }
        catch (AbsenceOfSubjectException e){
            System.out.println(e.getMessage());
        }
        catch (AbsenceOfStudentException e){
            System.out.println(e.getMessage());
        }
        catch (AbsenceOfGroupExceptinon e){
            System.out.println(e.getMessage());
        }
        catch (AbsenceOfFacultyException e){
            System.out.println(e.getMessage());
        }
        }
    }

