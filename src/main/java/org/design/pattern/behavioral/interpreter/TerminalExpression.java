package org.design.pattern.behavioral.interpreter;

import java.util.StringTokenizer;

public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String expression) {
        StringTokenizer st = new StringTokenizer(expression);
        while (st.hasMoreElements()) {
            String test = st.nextToken();
            if (test.equals(data)) {
                return true;
            }
        }

        return false;
    }

}
