package ch03.sec03;

public class OverflowUnderflowExample {
    public static void main(String[] args) {
        byte var1 = 125;
        for(int i=0; i<5; i++) { //{ }를 5번 반복 실행
            // byte의 범위를 초과할 경우 byte의 최소 값인 -128로 돌아간다
            var1++; //++ 연산은 var1의 값을 1 증가시킨다.
            System.out.println("var1: " + var1);
        }

        System.out.println("------------------------");

        byte var2 = -125;
        for(int i=0; i<5; i++) { //{ }를 5번 반복 실행
            // byte의 범위를 아래로 초과할 경우 byte의 최다 값인 127로 돌아간다
            var2--;     //-- 연산은 var2의 값을 1 감소시킨다.
            System.out.println("var2: " + var2);
        }
    }
}
