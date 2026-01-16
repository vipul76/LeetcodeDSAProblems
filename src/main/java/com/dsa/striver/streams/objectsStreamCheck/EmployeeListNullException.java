package com.dsa.striver.streams.objectsStreamCheck;

public class EmployeeListNullException extends RuntimeException {
    public EmployeeListNullException(){
        super("Employee list is null or empty");
    }
    public EmployeeListNullException(String message){
        super(message);
    }
}
