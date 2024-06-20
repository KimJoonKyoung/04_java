package ch07.sec06.package2;

import ch07.sec06.package1.A;

public class D extends A{
    public D() {
        //A() 생성자 호출
        super();
    }

    public void method1() {
        //A 필드값 변경
        this.field = "value";   //o
        //A 메소드 호출
        this.method();          //o
    }

    //메소드 선언
    public void method2() {
        //A a = newA();         //x
        //a.field = "value";    //x
        //a.method();           //x
    }
}
