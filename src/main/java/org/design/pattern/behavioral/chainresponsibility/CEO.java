package org.design.pattern.behavioral.chainresponsibility;

public class CEO extends Handler {

    @Override
    public void handleRequest(Request request) {
        System.out.println("CEOs can approve anything");
    }
}

