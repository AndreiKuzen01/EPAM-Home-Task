package com.epam.exceptionMain.bean;

import com.epam.exceptionMain.exception.InvalidScoreValueException;

public class Subject {
    private SubjectName subjectName;
    private int score;

    public Subject(SubjectName subjectName, int score)throws InvalidScoreValueException {
        if(score > 10 || score < 1){
            throw new InvalidScoreValueException("Entered score is invalid");
        } else {
            this.subjectName = subjectName;
            this.score = score;
        }
    }

    public SubjectName getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(SubjectName subjectName) {
        this.subjectName = subjectName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) throws InvalidScoreValueException {
        if (score > 10 || score < 0) {
            throw new InvalidScoreValueException("Entered score is invalid");
        } else {
            this.score = score;
        }
    }
}
