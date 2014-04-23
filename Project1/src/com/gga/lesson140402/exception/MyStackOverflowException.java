package com.gga.lesson140402.exception;

public class MyStackOverflowException extends Exception {
    private int _lenght;
    private int _tos;
    public MyStackOverflowException(int length, int tos) {
    	_lenght = length;
    	_tos = tos;
    }
}
