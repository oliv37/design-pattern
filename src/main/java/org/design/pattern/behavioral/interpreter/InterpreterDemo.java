package org.design.pattern.behavioral.interpreter;

public class InterpreterDemo {

    private static Expression buildInterpreterTree() {

        Expression terminal1 = new TerminalExpression("Lions");
        Expression terminal2 = new TerminalExpression("Tigers");
        Expression terminal3 = new TerminalExpression("Bears");

        Expression alternation1 = new AndExpression(terminal2, terminal3);

        // Lions or (Tigers and Bears)
        Expression alternation2 = new OrExpression(terminal1, alternation1);

        // Bears and (Lions or (Tigers and Bears))
        return new AndExpression(terminal3, alternation2);
    }

    public static void main(String[] args) {
        String context = "Bears Tigers";

        Expression define = buildInterpreterTree();

        System.out.println(context + " is " + define.interpret(context));
    }

}
