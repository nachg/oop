package com.demo.numbers;

import com.demo.numbers.base.INumber;

import java.util.ArrayList;

public class Interp {
    private String mathExpr;
    double operand1 = 0;
    double operand2 = 0;
    char operator = 0;
    Double result = 0.0;

    public Interp(String s) {
        this.mathExpr = s;
    }

    public void parse()throws Exception {
        char[] inputString;
        String lexemeTemp = "";
        char sym;
        int lexemeNumb = 0;
        int bracketPos1 = 0;
        int bracketPos2 = 0;
        int bracketsLevel = 0;
        ArrayList<String> lexemes = new ArrayList<>();
        ArrayList<String> lexemeType = new ArrayList<>();

        inputString = deleteSpaces(mathExpr).toCharArray();

        for (int i = 0; i < inputString.length; i++) {
            sym = inputString[i];
            if (sym == '(' & bracketsLevel == 0) {
                bracketsLevel += 1;
                bracketPos1 = i + 1;
            } else if (sym == '(' & bracketsLevel != 0) {
                bracketsLevel += 1;
            } else if (sym == ')' & bracketsLevel != 1) {
                bracketsLevel -= 1;
            } else if (sym == ')' & bracketsLevel == 1) {
                bracketPos2 = i;
                bracketsLevel -= 1;
            } else if (Character.isDigit(sym) & bracketsLevel == 0) {
                lexemeTemp += sym;
            } else if (isOperator(sym) & bracketsLevel == 0) {
                operator = sym;
                bracketPos1 = 0;
                bracketPos2 = 0;
                if (lexemeTemp != "") {
                    lexemes.add(lexemeNumb, lexemeTemp);
                    lexemeType.add(lexemeNumb, "Number");
                }
                lexemeTemp = "";
                lexemeNumb += 1;
            }
            if (Character.isDigit(sym) & i == inputString.length - 1) {
                lexemes.add(lexemeNumb, lexemeTemp);
                lexemeType.add(lexemeNumb, "Number");
            }
            if (bracketPos2 != 0 & bracketsLevel == 0 & !isOperator(sym)) {
                for (int j = bracketPos1; j < bracketPos2; j++) {
                    lexemeTemp += inputString[j];
                }
                lexemes.add(lexemeNumb, lexemeTemp);
                lexemeType.add(lexemeNumb, "Expression");
                lexemeTemp = "";
            }
        }
        if (lexemeType.get(0) == "Number") {
            operand1 = Double.parseDouble(lexemes.get(0));
        } else {
            operand1 = (new Interp(lexemes.get(0)).toDouble());
        }
        if (lexemeType.get(1) == "Number") {
            operand2 = Integer.parseInt(lexemes.get(1));
        } else {
            operand2 = (new Interp(lexemes.get(1)).toDouble());
        }

    }

    private String deleteSpaces(String in) {
        String temp = "";
        for (int i = 0; i < in.toCharArray().length; i++) {
            if (in.toCharArray()[i] != ' ') {
                temp += in.toCharArray()[i];
            }
        }
        return temp;
    }

    public boolean isOperator(char symbol) {
        if (symbol == '+' || symbol == '-' || symbol == '*' || symbol == '/') {
            return true;
        } else return false;
    }


    public Double toDouble() throws Exception {
        parse();
        switch (operator) {
            case '+':
                result = (new Plus(operand1,operand2)).toDouble();
                break;
            case '-':
                result = (new Minus(operand1,operand2)).toDouble();
                break;
            case '*':
                result = (new Mult(operand1,operand2)).toDouble();
                break;
            case '/':
                result = (new Div(operand1,operand2)).toDouble();
                break;
        }
        return result;
    }


}
