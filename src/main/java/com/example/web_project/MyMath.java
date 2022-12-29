package com.example.web_project;

public class MyMath {
    public static double divide(int num1, int num2){
        if (num2 ==0)
            throw new ArithmeticException("Деление на 0");
        return num1/num2;
    }
}
