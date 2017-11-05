package org.design.pattern.creational.abstractfactory;

public class VisaValidator implements Validator {

  @Override
  public boolean isValid(CreditCard card) {
    return false;
  }

}
