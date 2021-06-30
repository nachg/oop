package com.demo.numbers;

import com.demo.numbers.base.INumber;
import com.demo.numbers.base.Number;

import java.util.ArrayList;
import java.util.List;

public class Interpreter {
    private INumber operand1;
    private INumber operand2;
    private INumber expr;
    private String operator;
    private List <INumber> operators = new ArrayList<>();

    public Interpreter(LexicalParser lp) throws Exception {
        createObjList();
        operand1 = new Number(stringToDouble(lp.next()));
        operator = lp.next();
        operand2 = new Number(stringToDouble(lp.next()));
        convertToExpr();
    }

    public double stringToDouble (String st) throws Exception {
        return Double.parseDouble(st);
    }

    public void createObjList()  {
        operators.add(new Plus(1,1));
        operators.add(new Minus(1,1));
        operators.add(new Mult(1,1));
        operators.add(new Div(1,1));
    }

    public void convertToExpr() {
        for (INumber obj: operators) {
            if (obj.getName().equals(operator)) {
                expr = obj.createNew(operand1, operand2);
            }
        }
    }

    public INumber toObject() {
        return expr;
    }

    public String getOperator() {
        return operator;
    }

    public Double toDouble() throws Exception {
        return expr.toDouble();
    }
}
