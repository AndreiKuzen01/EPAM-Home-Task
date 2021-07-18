package com.epam.exceptionMain.exception;

public class AbsenceOfSubjectException extends Exception {

    private String message;

    public AbsenceOfSubjectException(String message){
        super();
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
