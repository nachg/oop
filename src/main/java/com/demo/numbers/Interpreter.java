package com.demo.numbers;

import com.demo.numbers.base.INumber;

import java.util.ArrayList;

public class Interpreter implements INumber {
    private String st;

    public Interpreter(String s) {
        this.st = s;
    }

    public static void parse(String in) {
        char[] inputString;
        String lexemeTemp = "";
        char operator = 0;
        char sym;
        int lexemeNumb = 0;
        int pos1 = 0;
        int pos2 = 0;
        int bracketsLevel = 0;
        ArrayList<String> lexemeArray = new ArrayList<>();

        inputString = deleteSpaces(in).toCharArray();

        for (int i = 0; i < inputString.length; i++) {
            sym = inputString[i];
            if (sym == '(' & bracketsLevel == 0) {
                bracketsLevel += 1;
                pos1 = i + 1;
            } else if (sym == '(' & bracketsLevel != 0) {
                bracketsLevel += 1;
            } else if (sym == ')' & bracketsLevel != 1) {
                bracketsLevel -= 1;
            } else if (sym == ')' & bracketsLevel == 1) {
                pos2 = i;
                bracketsLevel -= 1;
            } else if (Character.isDigit(sym) & bracketsLevel == 0) {
                lexemeTemp += sym;
            } else if (isOperator(sym) & bracketsLevel == 0) {
                operator = sym;
                pos1 = 0;
                pos2 = 0;
                lexemeArray.add(lexemeNumb, lexemeTemp);
                lexemeTemp = "";
                lexemeNumb += 1;
            }
            if (Character.isDigit(sym) & i == inputString.length - 1) {
                lexemeArray.add(lexemeNumb, lexemeTemp);
            }
            if (pos2 != 0 & bracketsLevel == 0 & !isOperator(sym)) {
                for (int j = pos1; j < pos2; j++) {
                    lexemeTemp += inputString[j];
                    lexemeArray.add(lexemeNumb, lexemeTemp);
                }
            }
        }

        System.out.println(operator);
        System.out.println(lexemeArray.get(0));
        System.out.println(lexemeArray.get(1));
    }

    private static String deleteSpaces(String in) {
        String temp = "";
        for (int i = 0; i < in.toCharArray().length; i++) {
            if (in.toCharArray()[i] != ' ') {
                temp += in.toCharArray()[i];
            }
        }
        return temp;
    }

    public static boolean isOperator(char symbol) {
        if (symbol == '+' || symbol == '-' || symbol == '*' || symbol == '/') {
            return true;
        } else return false;
    }

    @Override
    public Double toDouble() {
        return null;
    }

    public static void main(String[] args) {
        Interpreter.parse("(34+45)*(23+(56+45))");
    }
}
