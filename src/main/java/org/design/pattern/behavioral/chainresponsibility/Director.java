package org.design.pattern.behavioral.chainresponsibility;

public class Director extends Handler {

    public void handleRequest(Request request) {
        if (RequestType.CONFERENCE.equals(request.getRequestType())) {
            System.out.println("Directors can approve conferences");
        } else {
            successor.handleRequest(request);
        }
    }
}
