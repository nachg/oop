package com.demo.numbers.base;

import java.util.ArrayList;

public class LexicalParser {
    public static String ERROR_NO_STRING_CONTENT = "Отсутствует строка";

    private ArrayList<String> values = new ArrayList<>();
    private int currentPosition = 0;

    public LexicalParser(String value) {
        //Разбиваем строку на подстроки
        String[] res = value.trim().split(" ");

        //исключаем из результирующего массива пустые строки
        for(String it: res) {
            if(!it.trim().isEmpty()) {
                values.add(it);
            }
        }
    }

    public boolean hasElement() {
        return !(values.isEmpty() || currentPosition >= values.size());
    }

    public String next() throws Exception {
        if(!hasElement()) {
            throw new Exception(ERROR_NO_STRING_CONTENT);
        }

        return values.get(currentPosition++);
    }

    public static void main(String[] args) throws Exception {
        LexicalParser lp = new LexicalParser("    1 22  3 ");
        while(lp.hasElement()) {
            System.out.println(lp.next());
        }
    }
}