package ch03.sec01;

public class IncreaseDecreaseOperatorExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        x++; // x = 11
        ++x; // x = 12
        System.out.println("x=" + x); // x = 12
        System.out.println("-----------------------");

        y--; // y = 9
        --y; // y = 8
        System.out.println("y=" + y); // y = 8
        System.out.println("------------------------");

        z = x++; // x값을 먼저 z에 넣고 1 증가시켜 z = 12 / x = 13
        System.out.println("z=" + z); // z = 12
        System.out.println("x=" + x); // x = 13
        System.out.println("------------------------");

        z = ++x; // x값을 1 증가시키고 z값에 넣음 z = 14 / x = 14
        System.out.println("z=" + z); // z = 14
        System.out.println("x=" + x); // x = 14
        System.out.println("------------------------");

        z = ++x + y++; // x값을 1 증가시키고 y는 그대로 z 값에 넣고 y는 후에 증가 z = 23 / x = 15 / y = 9
        System.out.println("z=" + z); // z = 23
        System.out.println("x=" + x); // x = 15
        System.out.println("y=" + y); // y = 9
    }
}
