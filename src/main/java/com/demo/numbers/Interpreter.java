package com.demo.numbers;

import com.demo.numbers.base.IEvaluable;
import com.demo.numbers.base.INumber;
import com.demo.numbers.base.IVars;
import com.demo.numbers.base.Number;

import java.util.ArrayList;
import java.util.List;

public class Interpreter {
    private INumber operand1;
    private INumber operand2;
    private INumber expr;
    private String operator;
    private String tempValue;
    private List<INumber> operators = new ArrayList<>();
    private List<IVars> vars = new ArrayList<>();
    private SyntaxParser sp;
    private IEvaluable expression;

    public Interpreter() {
        createObjList();
    }

    public void addLine(SyntaxParser sp) throws Exception {
        expression = sp.parse();
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

    public Double evaluate() throws Exception {
        return expr.evaluate();
    }
}
