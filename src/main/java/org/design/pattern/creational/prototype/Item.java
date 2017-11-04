package org.design.pattern.creational.prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class Item implements Cloneable {

  private String tile;
  private double price;
  private String url;

  @Override
  protected Item clone() throws CloneNotSupportedException {
    return (Item) super.clone();
  }

}
