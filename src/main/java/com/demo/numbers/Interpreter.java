package com.demo.numbers;

import com.demo.numbers.base.IVar;
import com.demo.numbers.base.INumber;
import com.demo.numbers.base.Number;

import java.util.ArrayList;
import java.util.List;

public class Interpreter {
    private INumber operand1;
    private INumber operand2;
    private INumber expr;
    private String operator;
    private List<INumber> operators = new ArrayList<>();
    static List<IVar> vars = new ArrayList<>();

    public Interpreter(LexicalParser lp) throws Exception {
        createObjList();
        String firstLex = lp.next();
        if (isNumber(firstLex)) {
            operand1 = new Number(stringToDouble(firstLex));
            operator = lp.next();
            operand2 = new Number(stringToDouble(lp.next()));
            convertToExpr();
        } else if (isVar(firstLex)) {
            Var var = new Var(firstLex);
            String secLex = lp.next();
            if (secLex.equals("=")) {
                operand1 = new Number(stringToDouble(lp.next()));
                operator = lp.next();
                operand2 = new Number(stringToDouble(lp.next()));
                convertToExpr();
                var.setValue(expr);
                vars.add(var);
            } else {
                operator = secLex;
                String thirdLex = lp.next();
                for (IVar v : vars) {
                    if (v.getName().equals(firstLex)) {
                        operand1 = v.getValue();
                    }
                    if (v.getName().equals(thirdLex)) {
                        operand2 = v.getValue();
                    }
                }
                convertToExpr();
            }
        }
    }

    public boolean isVar(String st) {
        if (st.toCharArray()[0] == '&') {
            return true;
        } else return false;
    }

    public boolean isNumber(String st) {
        if (Character.isDigit(st.toCharArray()[0])) {
            return true;
        } else return false;
    }

    public double stringToDouble(String st) throws Exception {
        return Double.parseDouble(st);
    }

    public void createObjList() {
        operators.add(new Plus());
        operators.add(new Minus());
        operators.add(new Mult());
        operators.add(new Div());
    }

    public void convertToExpr() {
        for (INumber obj : operators) {
            if (obj.getName().equals(operator)) {
                expr = obj.createNew(operand1, operand2);
            }
        }
    }

    public INumber toObject() {
        return expr;
    }

    public Double toDouble() throws Exception {
        return expr.toDouble();
    }
}
