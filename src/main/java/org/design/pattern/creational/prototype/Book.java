package org.design.pattern.creational.prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class Book extends Item {

  private int numberOfPages;

}
