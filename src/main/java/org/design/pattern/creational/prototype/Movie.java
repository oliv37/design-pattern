package org.design.pattern.creational.prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class Movie extends Item {

  private String runtime;

}
