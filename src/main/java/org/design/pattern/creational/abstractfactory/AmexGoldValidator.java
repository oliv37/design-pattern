package org.design.pattern.creational.abstractfactory;

public class AmexGoldValidator implements Validator {

  @Override
  public boolean isValid(CreditCard card) {
    return false;
  }

}
