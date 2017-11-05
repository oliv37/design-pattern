package org.design.pattern.creational.abstractfactory;

public class VisaFactory extends CreditCardFactory {

  @Override
  public CreditCard getCreditCard(CardType cardType) {
    switch (cardType) {
      case BLACK:
        return new VisaBlackCreditCard();
      case GOLD:
        return new VisaGoldCreditCard();
      default:
        return null;
    }
  }

  @Override
  public Validator getValidator(CardType cardType) {
    return new VisaValidator();
  }
}
