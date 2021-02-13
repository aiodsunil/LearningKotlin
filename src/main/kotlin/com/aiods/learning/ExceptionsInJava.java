package com.aiods.learning;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionsInJava {
    public static void main(String[] args) throws InterruptedException {
       Thread.sleep(200);
        System.out.println("Hello Java");
//        try {
//            System.out.println(divide(7,0));
//        } catch (ArithmeticException e) {
//            System.out.println(e);
//        }
    }
    public  static Integer divide(int a,int b){
        return  a/b;
    }
    public void  readFile() throws IOException {
       try (FileInputStream fileInputStream=new FileInputStream("input.txt")){

       }

    }
}

