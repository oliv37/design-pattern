package org.design.pattern.creational.builder;

import org.design.pattern.creational.builder.LaunchOrder.Builder;

public class DemoBuilder {

  public static void main(String[] args) {
    Builder builder = new LaunchOrder.Builder();
    builder.bread("wheat").meat("turkey");

    LaunchOrder order = builder.build();
    System.out.println(order.getBread());
    System.out.println(order.getMeat());
  }

}
