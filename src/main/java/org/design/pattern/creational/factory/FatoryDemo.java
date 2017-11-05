package org.design.pattern.creational.factory;

public class FatoryDemo {


  public static void main(String[] args) {
    Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);

    System.out.println(site.getPages());

    site = WebsiteFactory.getWebsite(WebsiteType.SHOP);

    System.out.println(site.getPages());
  }
}
