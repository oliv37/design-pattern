package org.design.pattern.behavioral.chainresponsibility;

public class VP extends Handler {

    @Override
    public void handleRequest(Request request) {
        if (RequestType.PURCHASE.equals(request.getRequestType())) {
            if (request.getAmount() < 1500) {
                System.out.println("VPs can approve purchases below 1500");
            } else {
                successor.handleRequest(request);
            }
        }
    }

}
