package ch02.sec02;

public class IntegerLiteralExample {
    public static void main(String[] args) {
        int var1 = 0b1011; //2진수 : 접두사 0b 또는 0B
        int var2 = 0206; //8진수 : 접두사 0
        int var3 = 365; //10진수
        int var4 = 0xB3; //16진수 : 접두사 0x 또는 0X

        System.out.println("var1: " + var1);
        System.out.println("var2: " + var2);
        System.out.println("var3: " + var3);
        System.out.println("var4: " + var4);
    }
}
