package com.demo.numbers;

import com.demo.numbers.base.IEvaluable;
import com.demo.numbers.base.Number;

public class SyntaxParser {
    private LexicalParser lp;

    public SyntaxParser(LexicalParser lp) {
        this.lp = lp;
    }

    public IEvaluable parse() throws Exception {
        if (isVar(lp.next())) {
            return new Var();
        } else return new Number();
    }

    public boolean isVar(String st) {
        if (st.toCharArray()[0] == '$') {
            return true;
        } else return false;
    }

    public boolean isNumber(String st) {
        if (Character.isDigit(st.toCharArray()[0])) {
            return true;
        } else return false;
    }
}
