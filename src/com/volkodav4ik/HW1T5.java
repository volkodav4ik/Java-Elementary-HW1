package com.volkodav4ik;

/*
5*) Написать метод который убирает лишние пробелы в строке и возвращает строку.
Убрать начальные, конечные и между словами должно быть не больше 1 пробела.
*/
public class HW1T5 {
    private static final int CHAR_MINING_OF_SPACE = 32;

    public static void main(String[] args) {
        String s = "   There   is no  extra space   in this sentence    ";
        System.out.println(deleteExtraSpace(s));
    }

    private static String deleteExtraSpace(String s) {
        s = s.trim();
        StringBuilder sb = new StringBuilder(s);
        for (int i = sb.length() - 1; i > 1; i--) {
            if (sb.charAt(i) == CHAR_MINING_OF_SPACE && sb.charAt(i - 1) == CHAR_MINING_OF_SPACE) {
                sb.deleteCharAt(i - 1);
            }
        }
        s = sb.toString();
        return s;
    }
}
