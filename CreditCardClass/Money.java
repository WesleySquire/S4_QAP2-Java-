package CreditCardClass;

public class Money {
  private double amount;

  public Money(double amount) {
    String strAmount = String.valueOf(amount);
    // strDollars = strAmount.substring(0, indexOfDecimal);
    // strCents = strAmount.substring(indexOfDecimal);
    // dollars = Long.parseLong(strDollars);
    // cents = Long.parseLong(strCents);
    this.amount = amount;
  }

  public Money(Money otherObject) {
    this.amount = otherObject.amount;
  }

  public Money add(Money otherAmount) {
    this.amount += otherAmount.amount;
    return this;
  }

  public Money subtract(Money otherAmount) {
    this.amount -= otherAmount.amount;
    return this;
  }

  public int compareTo(Money otherObject) {
    if (this.amount >= otherObject.amount) {
      return 1;
    } else {
      // amount < otherObject.amount
      return 2;
    }
  }

  // equals

  public String toString() {
    return ("$" + this.amount);
  }
}
