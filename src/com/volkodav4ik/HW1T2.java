package com.volkodav4ik;
/*
2) Вывести ряд чисел от 1 до 100 через пробел, с изменениями:
- если число кратно 3 то вместо него вывести Hello
- если число кратно 5 то вместо него вывести World
- если число кратно и 3 и 5 то вместо него вывести HelloWorld
 */
public class HW1T2 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 1; i <= 100; i++) {
            if ((i % 3) == 0 && (i % 5) == 0) {
                sb.append("HelloWorld ");
            } else {
                if ((i % 3) == 0) {
                    sb.append("Hello ");
                } else {
                    if ((i % 5) == 0) {
                        sb.append("World ");
                    } else {
                        sb.append(i + " ");
                    }
                }
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb.toString());
    }
}
