package org.design.pattern.creational.factory;

public class Blog extends Website {

  @Override
  public void createWebsite() {
    pages.add(new PostPage());
    pages.add(new AboutPage());
    pages.add(new CommonPage());
    pages.add(new ContactPage());
  }

}