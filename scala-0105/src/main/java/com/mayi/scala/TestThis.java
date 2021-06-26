package com.mayi.scala;

import com.mayi.scala.chapter01.Student;

import java.io.FileInputStream;
import java.util.Objects;

/**
 * Author: Felix
 * Date: 2020/4/27
 * Desc:
 */
public class TestThis {
    public static void main(String[] args){
        /*Student std = new Student();
        std.name = "zhangsan";
        std.age = 18;

//        std.m1(20,std);

        Student wq = new Student();
        wq.name = "wq";
        wq.age = 17;

//        wq.m1(20,wq);*/



    }
}

/*
class Student{
    String name;
    int age;
    public void m1(int n){
//        this = std;
        System.out.println(this.age);
        System.out.println(this.name);
        return;
    }
    public Student(){
        super();
    }
}*/

class Student66{
    String name;
    int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student66 student66 = (Student66) o;
        return age == student66.age &&
                name.equals(student66.name);
    }

}
