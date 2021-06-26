package com.mayi.scala;

/**
 * Author: Felix
 * Date: 2020/4/30
 * Desc: 通过静态绑定和动态绑定说明多态
 *  -多态
 *      >同一个对象，多种不同形态
 *      >父类引用指向子类对象|接口指向实现类
 *      >只能调用其引用类型中定义的方法(编译看左)
 *          静态绑定(编译期绑定)：在Java语言中，在程序编译的时候，确定属性所属的类型
 *      >在运行的时候，会执行子类中覆盖的方法(运行看右)
 *          动态绑定(运行期绑定)：在程序执行的时候，看实际创建对象的；类型是什么，然后进行调用，方法属于动态绑定
 *
 */
public class TestDynamic {
    public static void main(String[] args) {
        /*
        //不存在多态的情况
        Teacher11 tea = new Teacher11();
        System.out.println(tea.name);//teacher
        tea.hello();//hello teacher
        */
        //存在多态的情况
        Person11 tea = new Teacher11();
        System.out.println(tea.name);//person
        tea.hello();//hello teacher
        //tea.sayHi();
    }
}

class Person11{
    String name = "person";
    public void hello(){
        System.out.println("hello Person");
    }
}
class Teacher11 extends Person11{
    String name = "teacher";
    public void hello(){
        System.out.println("hello teacher");
    }

    public void sayHi(){
        System.out.println("sayHI teacher");
    }
}

