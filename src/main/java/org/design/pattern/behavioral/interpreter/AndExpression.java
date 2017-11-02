package org.design.pattern.behavioral.interpreter;

public class AndExpression implements Expression {

    private Expression exp1;
    private Expression exp2;

    public AndExpression(Expression exp1, Expression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public boolean interpret(String expression) {
        return exp1.interpret(expression) && exp2.interpret(expression);
    }

}
