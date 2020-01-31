package com.volkodav4ik;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/*
6*) Задан 2-мерный массив char и слово. Написать метод который определит есть ли по вертикали
или горизонтали это слово. Например, в данном случае для слова test метод должен вернуть true:
a z r g z
a t e s t
q v u t r
6.1*) Массив загрузить из текстового файла
*/
public class HW1T6 {
    private static Scanner scanner;
    private static char[][] matrix = new char[3][5];
    private static String requiredWord = "test";
    private static String fileName = "1.txt";

    public static void main(String[] args) {
        openFile(fileName);
        readFileAndInitMatrix();
        outMatrix();
        if (searchWordFromMatrix()) {
            System.out.println("Available matrix contain word \"" + requiredWord + "\"");
        } else {
            System.out.println("Available matrix doesn't contain word \"" + requiredWord + "\"");
        }
    }

    private static boolean searchWordFromMatrix() {
        boolean result = false;
        char firstLetter = requiredWord.charAt(0);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == firstLetter) {
                    String rowWord = GetWordFromRow(i, j);
                    if (rowWord.equals(requiredWord)) {
                        result = true;
                    }
                    String colWord = GetWordFromCol(i, j);
                    if (colWord.equals(requiredWord)) {
                        result = true;
                    }
                }
            }
        }
        return result;
    }

    private static String GetWordFromCol(int i, int j) {
        StringBuilder sb = new StringBuilder("");
        if ((i + requiredWord.length()) > matrix.length) {
            return sb.toString();
        } else {
            for (int k = i; k < i + requiredWord.length(); k++) {
                sb.append(matrix[k][j]);
            }
        }
        return sb.toString();
    }

    private static String GetWordFromRow(int i, int j) {
        StringBuilder sb = new StringBuilder("");
        if ((j + requiredWord.length()) > matrix[i].length) {
            return sb.toString();
        } else {
            for (int k = j; k < j + requiredWord.length(); k++) {
                sb.append(matrix[i][k]);
            }
        }
        return sb.toString();
    }

    private static void outMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    private static void readFileAndInitMatrix() {
        while (scanner.hasNext()) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    String tmp = scanner.next();
                    char value = tmp.charAt(0);
                    matrix[i][j] = value;
                }
            }
        }
    }

    private static void openFile(String fileName) {
        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Файл не найден");
        }
    }
}
