package com.mayi.scala.chapter05

/**
  * Author: Felix
  * Date: 2020/4/28
  * Desc: 高阶函数之函数作为返回值返回
  */
object Scala08_TestFun_return {
  def main(args: Array[String]): Unit = {

    /*
    def f1(): (Int)=>Int ={
      var a:Int = 10
      def f2(b:Int): Int ={
        a + b
      }
      f2 _
    }
    */

    //执行f1函数返回f2,将返回的f2赋值给ff变量
    //val ff: Int => Int = f1()

    //闭包：内存函数f2要访问外层函数f1局部变量a，当外层函数f1执行结束之后，f1会释放栈内存，但是会自动的延长f1函数的局部变量的生命周期，
    //    和内层函数f2形成一个闭合的效果，我们将这种闭合的效果称之为闭包

    //如果存在闭包，那么编译器会生成包含$anonfun$的字节码文件

    //闭包  = 外层函数的局部变量  + 内层函数

    //调用ff函数，其实就是调用f2
    //println(ff(20))

    //也可以直接通过如下方式调用
    //println(f1()(30))


    println("-----------------------------------")
    //以上代码可以转换为如下代码
    /*
    def f3() ={
      var a:Int = 10
      (b:Int) => a + b
    }

    f3()(30)
    */


    //柯里化
    //将一个函数的一个参数列表中的多个参数，拆分为多个参数列表
    //简化闭包代码的编写
    def f4()(b:Int):Int = {
      var a:Int = 10
      a + b
    }
    println(f4()(20))

    //f4在执行的时候，其实会转换为以下结构
    /*
    def f4() ={
      var a:Int = 10
      (b:Int) => a + b
    }
    */


    //柯里化，是对函数嵌套的简化，但是这里只有一层函数体， 如果每层函数完成的业务逻辑不一样，一个函数体如何处理
    //控制抽象





  }
}
