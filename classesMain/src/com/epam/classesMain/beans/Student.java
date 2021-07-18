package com.epam.classesMain.beans;

public class Student {
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private int birthYear;
    private Adress adress;
    private String faculty;
    private int course;
    private int groupNumber;

    public Student(){

    }

    public Student(int id, String surname, String name, String patronymic, int birthYear, Adress adress, String faculty, int course, int groupNumber) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthYear = birthYear;
        this.adress = adress;
        this.faculty = faculty;
        this.course = course;
        this.groupNumber = groupNumber;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", birthYear=" + birthYear +
                ", adress=" + adress +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
