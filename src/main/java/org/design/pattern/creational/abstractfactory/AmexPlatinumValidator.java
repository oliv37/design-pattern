package org.design.pattern.creational.abstractfactory;

public class AmexPlatinumValidator implements Validator {

  @Override
  public boolean isValid(CreditCard card) {
    return false;
  }

}
