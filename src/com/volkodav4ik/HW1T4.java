package com.volkodav4ik;
/*
4) Написать метод который вернет String в которой будут в одну строку
числа от 1 до 30. Каждое число при этом взять в круглые скобки ()
*/
public class HW1T4 {

    private static final int MAX_VALUE = 30;

    public static void main(String[] args) {
        String s = "";
        System.out.println(createAndInitString(s));
    }

    private static String createAndInitString(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 1; i <= MAX_VALUE; i++) {
            sb.append("(").append(i).append(")");
        }
        s = sb.toString();
        return s;
    }
}
