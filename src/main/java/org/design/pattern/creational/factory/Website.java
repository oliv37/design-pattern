package org.design.pattern.creational.factory;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Website {

  protected List<Page> pages = new ArrayList<>();

  public Website() {
    this.createWebsite();
  }

  public abstract void createWebsite();

}
