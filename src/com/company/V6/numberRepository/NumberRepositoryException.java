package com.company.V6.numberRepository;

public class NumberRepositoryException extends Exception{
       public NumberRepositoryException(String msg , Exception exception){
           super(msg,exception); // If Sql and IO exception will occur we have to move Exception class .

    }
}
